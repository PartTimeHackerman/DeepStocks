package data;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultHighLowDataset;
import org.jfree.ui.ApplicationFrame;

public class CandlestickDemo extends ApplicationFrame {
	
	public CandlestickDemo(final String title, DefaultHighLowDataset dataset) {
		
		super(title);
		final JFreeChart chart = createChart(dataset);
		chart.getXYPlot().setOrientation(PlotOrientation.VERTICAL);
		final ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
		setContentPane(chartPanel);
		
	}
	
	/**
	 * Creates a chart.
	 *
	 * @param dataset the dataset.
	 * @return The dataset.
	 */
	private JFreeChart createChart(final DefaultHighLowDataset dataset) {
		final JFreeChart chart = ChartFactory.createCandlestickChart(
				"Candlestick Demo",
				"Time",
				"Value",
				dataset,
				true);
		return chart;
	}
}
    
