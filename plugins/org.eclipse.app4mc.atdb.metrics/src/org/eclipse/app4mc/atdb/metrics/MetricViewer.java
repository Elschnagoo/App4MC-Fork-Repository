package org.eclipse.app4mc.atdb.metrics;

import java.sql.SQLException;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

public class MetricViewer extends EditorPart implements IEditorPart {

	protected DatabaseAccess dbAccess;
	private List<Process> processes;
	private String timestampUnit;
	private TreeViewer treeViewer;

	@Override
	public void doSave(final IProgressMonitor monitor) {
		// this is just a viewer for trace metrics, nothing can be changed
		// so there is nothing to save
	}

	@Override
	public void doSaveAs() {
		// this is just a viewer for trace metrics, nothing can be changed
		// so there is nothing to save
	}

	@Override
	public boolean isDirty() {
		// this is just a viewer for trace metrics, nothing can be changed
		// so there is nothing to save, so it is never dirty
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// this is just a viewer for trace metrics, nothing can be changed
		// so there is nothing to save
		return false;
	}

	@Override
	public void init(final IEditorSite site, final IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
		if (input instanceof FileEditorInput) {
			final FileEditorInput fei = (FileEditorInput) input;
			final IFile dbFile = fei.getFile();
			this.dbAccess = new DatabaseAccess();
			try {
				this.dbAccess.connectToDatabase(dbFile);
				this.processes = this.dbAccess.loadProcesses();

				if (this.treeViewer != null) {
					this.treeViewer.setInput(this.processes);
				}
			}
			catch (final Exception e) {
				MessageDialog.openError(site.getShell(), Messages.MetricViewer_fileErrorTitle,
						String.format(Messages.MetricViewer_fileErrorMessage, fei.getName()));
				e.printStackTrace();
			}
			loadTimestampUnit();
		}
	}

	private void loadTimestampUnit() {
		try {
			this.timestampUnit = this.dbAccess.readTimestampUnit();
		}
		catch (final SQLException e) {
			e.printStackTrace();
		}
		if (this.timestampUnit == null) {
			this.timestampUnit = "?"; //$NON-NLS-1$
		}
	}

	@Override
	public void createPartControl(final Composite parent) {
		this.treeViewer = new TreeViewer(parent, SWT.FULL_SELECTION);
		this.treeViewer.getTree().setHeaderVisible(true);
		this.treeViewer.getTree().setLinesVisible(true);

		final TreeViewerColumn cName = new TreeViewerColumn(this.treeViewer, SWT.NONE);
		cName.getColumn().setText(Messages.MetricViewer_nameColumnTitle);
		cName.getColumn().setWidth(200);

		final TreeViewerColumn cMin = new TreeViewerColumn(this.treeViewer, SWT.RIGHT);
		cMin.getColumn().setText(String.format(Messages.MetricViewer_minimumColumnTitle, this.timestampUnit));
		cMin.getColumn().setWidth(200);

		final TreeViewerColumn cAvg = new TreeViewerColumn(this.treeViewer, SWT.RIGHT);
		cAvg.getColumn().setText(String.format(Messages.MetricViewer_averageColumnTitle, this.timestampUnit));
		cAvg.getColumn().setWidth(200);

		final TreeViewerColumn cMax = new TreeViewerColumn(this.treeViewer, SWT.RIGHT);
		cMax.getColumn().setText(String.format(Messages.MetricViewer_maximumColumnTitle, this.timestampUnit));
		cMax.getColumn().setWidth(200);

		this.treeViewer.setContentProvider(new MetricViewerContentProvider(this));
		this.treeViewer.setLabelProvider(new MetricViewerLabelProvider());

		if (this.processes != null) {
			this.treeViewer.setInput(this.processes);
		}
	}

	@Override
	public void setFocus() {
		final Control viewerControl = this.treeViewer.getControl();
		if (!viewerControl.isDisposed()) {
			viewerControl.forceFocus();
		}
	}

	@Override
	public void dispose() {
		try {
			this.dbAccess.closeDatabaseConnection();
		}
		catch (final SQLException e) {
			throw new RuntimeException(e);
		}
		super.dispose();
	}
}
