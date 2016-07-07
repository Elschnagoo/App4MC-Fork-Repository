package org.eclipse.app4mc.atdb.metrics;

import java.sql.SQLException;
import java.util.Collection;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class MetricViewerContentProvider implements ITreeContentProvider {

	private final MetricViewer mv;

	public MetricViewerContentProvider(final MetricViewer mv) {
		this.mv = mv;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(final Object inputElement) {
		if (inputElement instanceof Collection<?>) {
			return ((Collection<?>) inputElement).toArray();
		}
		return null;
	}

	@Override
	public Object[] getChildren(final Object parentElement) {
		if (parentElement instanceof Process) {
			try {
				return this.mv.dbAccess.calculateMetrcisForProcess((Process) parentElement).toArray();
			}
			catch (final SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public Object getParent(final Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(final Object element) {
		if (element instanceof Process) {
			return ((Process) element).hasEvents();
		}
		return false;
	}

}
