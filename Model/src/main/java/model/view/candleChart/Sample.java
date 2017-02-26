package view.candleChart;


import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.util.List;

/**
 * Base class for all Ensemble samples. Samples can either support layout resizing or they can be fixed size if needed
 * for simple graphics etc. If you need fixed size use the constructor with width and height arguments.
 */
public class Sample extends Pane {
	
	private Node controls = null;
	private boolean isFixedSize;
	
	/**
	 * Create a resizable sample
	 */
	public Sample() {
		isFixedSize = false;
		VBox.setVgrow(this, Priority.ALWAYS);
		setMaxWidth(Double.MAX_VALUE);
		setMaxHeight(Double.MAX_VALUE);
	}
	
	/**
	 * Create a fixed size sample
	 *
	 * @param width  The fixed width of the sample
	 * @param height The fixed height of the sample
	 */
	public Sample(double width, double height) {
		isFixedSize = true;
		setMaxSize(width, height);
		setPrefSize(width, height);
		setMaxSize(width, height);
	}
	
	@Override
	protected void layoutChildren() {
		if (isFixedSize) {
			super.layoutChildren();
		} else {
			List<Node> managed = getManagedChildren();
			double width = getWidth();
			///System.out.println("width = " + width);
			double height = getHeight();
			///System.out.println("height = " + height);
			double top = getInsets().getTop();
			double right = getInsets().getRight();
			double left = getInsets().getLeft();
			double bottom = getInsets().getBottom();
			for (int i = 0; i < managed.size(); i++) {
				Node child = managed.get(i);
				layoutInArea(child, left, top,
							 width - left - right, height - top - bottom,
							 0, Insets.EMPTY, true, true, HPos.CENTER, VPos.CENTER);
			}
		}
	}
	
	public void play() {
	}
	
	public void stop() {
	}
	/*
	protected void setControls(SimplePropertySheet.PropDesc... properties) {
		controls = new SimplePropertySheet(properties);
	}*/
	
	public Node getControls() {
		return controls;
	}
	
	/**
	 * Samples can override this if they want to provide extra content for the side bar
	 *
	 * @return A node to be added at the bottom of the side bar
	 */
	public Node getSideBarExtraContent() {
		return null;
	}
	
	/**
	 * Samples can override this if they want to provide extra content for the side bar. This provides the title.
	 *
	 * @return The title for the extra content section provided by the sample
	 */
	public String getSideBarExtraContentTitle() {
		return null;
	}
	
}
