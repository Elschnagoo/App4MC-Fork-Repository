package org.eclipse.app4mc.atdb.metrics;

import java.text.NumberFormat;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class MetricViewerLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(final Object element, final int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(final Object element, final int columnIndex) {
		if (element instanceof Process) {
			if (columnIndex == 0) {
				return ((Process) element).name;
			}
			return ""; //$NON-NLS-1$
		}
		else if (element instanceof Metric) {
			final Metric metric = (Metric) element;
			switch (columnIndex) {
			case 0:
				return metric.name;
			case 1:
				return NumberFormat.getInstance().format(metric.minimum);
			case 2:
				return NumberFormat.getInstance().format(metric.average);
			case 3:
				return NumberFormat.getInstance().format(metric.maximum);
			}
		}

		return ""; //$NON-NLS-1$
	}

}
