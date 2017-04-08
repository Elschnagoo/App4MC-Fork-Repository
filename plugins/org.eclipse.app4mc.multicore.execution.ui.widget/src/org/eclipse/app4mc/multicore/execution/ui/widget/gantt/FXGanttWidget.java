/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.execution.ui.widget.gantt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.AbstractGanttViewElement;
import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
public class FXGanttWidget extends XYChart<Number, String> implements IGantt {

	private double blockPadding = 10;

	private double blockHeight = 15;

	private NumberAxis xAxi;

	private CategoryAxis catAxi;

	/** A series for every category. Just for easier access.*/
	private Map<String, XYChart.Series<Number, String>> series = new HashMap<>();

	public FXGanttWidget(int vieport) {
		this(new NumberAxis(), new CategoryAxis());
		xAxi.setMinorTickCount(1);
		xAxi.setTickUnit(1);
		xAxi.setTickLabelFormatter(new IntegerStringConverter());
		xAxi.setLabel("");
		xAxi.setTickLabelFill(Color.CHOCOLATE);
		xAxi.setAutoRanging(false);
		xAxi.setLowerBound(0);
		xAxi.setUpperBound(vieport);
		catAxi.setAutoRanging(false);
		getYAxis().setLabel("");
		getYAxis().setTickLabelFill(Color.CHOCOLATE);
		getYAxis().setTickLabelGap(5);
		setLegendVisible(false);

		prefHeightProperty().bind(minHeightProperty());

		setupDragging();
		setupScrolling();
	}

	private FXGanttWidget(NumberAxis xAxis, CategoryAxis yAxis) {
		super(xAxis, yAxis);
		setData(FXCollections.<Series<Number, String>> observableArrayList());
		this.xAxi = xAxis;
		this.catAxi = yAxis;
	}

	private double deltX = 0;
	private double xBefore = 0;

	/**
	 * Setup moving the view port by dragging over the chart.
	 */
	private void setupDragging() {
		setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (xBefore == 0.0) {
					xBefore = event.getX();
				}
				deltX += event.getX() - xBefore;

				double pxPerUnit = getNumberAxis().getScale();

				if (deltX >= pxPerUnit) {
					moveViewPort(-1);
					deltX = 0.0;
				} else if (deltX <= -pxPerUnit) {
					moveViewPort(1);
					deltX = 0.0;
				}

				xBefore = event.getX();
			}
		});
		setOnMouseDragReleased(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				deltX = 0.0;
				xBefore = 0.0;
			}
		});
	}

	/**
	 * Setup the scrolling capabilities:
	 * 1. Scroll the view port 
	 * 2. Scroll + STRG: zoom the view port
	 */
	private void setupScrolling() {

//		Tooltip t = new Tooltip("Navigation Hints\n 1. Scroll: Move Chart \n 2. Scroll + STRG: Zoom Chart");
//		Tooltip.install(this, t);

		setOnScroll(new EventHandler<ScrollEvent>() {
			final static double moveSpeed = 0.1;
			final static int zoomSpeed = 2;

			@Override
			public void handle(ScrollEvent event) {
				if (event.isControlDown()) {
					if (event.getDeltaY() < 0) {
						zoomViewPort(zoomSpeed);
					} else {
						zoomViewPort(-zoomSpeed);
					}

				} else {

					if (event.getDeltaY() < 0) {
						//scrolling depends on zoom level
						moveViewPort(-(int)(moveSpeed*getViewSize()));
//						moveViewPort(-moveSpeed);
					} else {
						moveViewPort((int)(moveSpeed*getViewSize()));
//						moveViewPort(moveSpeed);
					}
				}
				event.consume();
			}

		});
	}

	/**
	 * Add a new category to the horizontal x-axi.
	 * 
	 * @param categorie
	 */
	public void addCategorie(String categorie) {
		if (getMinHeight() == -1) {
			// only invoked by adding first categorie
			// standard height for x and y axis
			setMinHeight(100);
		}
		double delta = getBlockHeight() + getBlockPadding() / 2.0;
		setMinHeight(getMinHeight() + delta);
		catAxi.getCategories().add(0,categorie);
		Series<Number, String> s = new Series<Number, String>();
		series.put(categorie, s); // only to get easier access
		getData().add(s);
//		getData().add(0, s);
//		getData().add(getData().size(),s);
	}

	@Override
	public void addEvent(String categorie, long start, AbstractGanttViewElement v) {
		XYChart.Data<Number, String> d = new XYChart.Data<Number, String>(start, categorie, v);
		series.get(categorie).getData().add(d);
	}

	public void moveViewPort(int move) {
		double ub = xAxi.getUpperBound() + move;
		double lb = xAxi.getLowerBound() + move;
		if (lb >= 0) {
			xAxi.setUpperBound(ub);
			xAxi.setLowerBound(lb);
		}
	}

	public void setViewPort(double lower, double upper) {
		lower = lower<0?0:lower;
		if (upper > 0 && lower<upper) {
			xAxi.setLowerBound(lower);
			xAxi.setUpperBound(upper);
		}
	}

	public void zoomViewPort(int zoom) {
		double ub = xAxi.getUpperBound() + zoom;
		double lb = xAxi.getLowerBound() - zoom;
		
		setViewPort(lb, ub);
	}
	
	public double getViewSize(){
		return xAxi.getUpperBound()-xAxi.getLowerBound();
	}

	@Override
	protected void layoutPlotChildren() {
		for (int seriesIndex = 0; seriesIndex < getData().size(); seriesIndex++) {
			Series<Number, String> series = getData().get(seriesIndex);
			Iterator<Data<Number, String>> it = getDisplayedDataIterator(series);
			
			while (it.hasNext()) {
				Data<Number, String> item = it.next();

				double x = getXAxis().getDisplayPosition(item.getXValue());
				double y = getYAxis().getDisplayPosition(item.getYValue());
				if (Double.isNaN(x) || Double.isNaN(y)) {
					continue;
				}
				
				Node node = item.getNode();
				
				if (node != null) {
					if(node instanceof AbstractGanttViewElement){
						AbstractGanttViewElement ev = (AbstractGanttViewElement) node;
						y -= getBlockHeight() / 2.0;
						ev.update(this,x,y);
					}
				}
			}
		}
	}

	@Override
	protected void dataItemAdded(Series<Number, String> series, int itemIndex, Data<Number, String> item) {
		Node block = createNode(item);
		getPlotChildren().add(block);
	}

	@Override
	protected void dataItemRemoved(final Data<Number, String> item, final Series<Number, String> series) {
		final Node block = item.getNode();
		getPlotChildren().remove(block);
		removeDataItemFromDisplay(series, item);
	}

	@Override
	protected void dataItemChanged(Data<Number, String> item) {
	}

	@Override
	protected void seriesAdded(Series<Number, String> series, int seriesIndex) {
		for (int j = 0; j < series.getData().size(); j++) {
			Data<Number, String> item = series.getData().get(j);			
			Node container = createNode(item);
			getPlotChildren().add(container);
		}
	}

	@Override
	protected void seriesRemoved(final Series<Number, String> series) {
		for (XYChart.Data<Number, String> d : series.getData()) {
			final Node container = d.getNode();
			getPlotChildren().remove(container);
		}
		removeSeriesFromDisplay(series);

	}

	private static Node createNode(final Data<Number, String> item) {

		Node container = item.getNode();
		if (container == null) {
			if(item.getExtraValue() instanceof AbstractGanttViewElement){
				container = (AbstractGanttViewElement) item.getExtraValue();
			}else{
				container = new StackPane();
			}
			item.setNode(container);
		}
		
		return container;
	}

//	@Override
//	protected void updateAxisRange() {
//		final Axis<Number> xa = getXAxis();
//		final Axis<String> ya = getYAxis();
//		List<Number> xData = null;
//		List<String> yData = null;
//		if (xa.isAutoRanging())
//			xData = new ArrayList<Number>();
//		if (ya.isAutoRanging())
//			yData = new ArrayList<String>();
//		if (xData != null || yData != null) {
//			for (Series<Number, String> series : getData()) {
//				for (Data<Number, String> data : series.getData()) {
//					if (xData != null) {
//						xData.add(data.getXValue());
//						//if autoranging the last event is fully displayed
//						xData.add(
//								xa.toRealValue(xa.toNumericValue(data.getXValue()) + getLength(data.getExtraValue())));
//					}
//					if (yData != null) {
//						yData.add(data.getYValue());
//					}
//				}
//			}
//			if (xData != null)
//				xa.invalidateRange(xData);
//			if (yData != null)
//				ya.invalidateRange(yData);
//		}
//	}

	/**
	 * Get the height of the gantt-blocks.
	 * 
	 * @return Height of the gantt-blocks in pixel.
	 */
	public double getBlockHeight() {
		return blockHeight;
	}

	/**
	 * Set the height of the Gantt-blocks.
	 * 
	 * @param blockHeight
	 *            Height of the Gantt-blocks in pixel.
	 */
	public void setBlockHeight(double blockHeight) {
		this.blockHeight = blockHeight;
	}

	/**
	 * Get the padding between the Gantt-blocks.
	 * 
	 * @return Distance in pixel.
	 */
	public double getBlockPadding() {
		return blockPadding;
	}

	/**
	 * Set the min padding between the Gantt-blocks.
	 * 
	 * @param blockPadding
	 *            Distance in pixel.
	 */
	public void setBlockPadding(double blockPadding) {
		this.blockPadding = blockPadding;
	}

	/**
	 * Get the x-number-axi.
	 * 
	 * @return
	 */
	public NumberAxis getNumberAxis() {
		return xAxi;
	}

	/**
	 * Get the y-category-axi
	 * 
	 * @return
	 */
	public CategoryAxis getCatAxi() {
		return catAxi;
	}

}
