package com.example.latency.extras;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

// Class to read the properties from the properties file

public class GetPropertyValues {
	private int recordsConsider = 0;
	private double bestLatency = 0;
	private double worstLatency = 0;
	private double bestBandwidth = 0;
	private double worstBandwidth = 0;

	public void readValues() {
		try {
			Properties properties = new Properties();
			String propertiesFile = "config.properties";

			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFile);

			if (inputStream != null) {
				properties.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propertiesFile + "' not found");
			}

			// get the property value
			recordsConsider = Integer.parseInt(properties.getProperty("recordsConsider"));
			bestLatency = Double.parseDouble(properties.getProperty("bestLatency"));
			worstLatency = Double.parseDouble(properties.getProperty("worstLatency"));
			bestBandwidth = Double.parseDouble(properties.getProperty("bestBandwidth"));
			worstBandwidth = Double.parseDouble(properties.getProperty("worstBandwidth"));

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public int getRecordsConsider() {
		return recordsConsider;
	}

	public void setRecordsConsider(int recordsConsider) {
		this.recordsConsider = recordsConsider;
	}

	public double getBestLatency() {
		return bestLatency;
	}

	public void setBestLatency(double bestLatency) {
		this.bestLatency = bestLatency;
	}

	public double getWorstLatency() {
		return worstLatency;
	}

	public void setWorstLatency(double worstLatency) {
		this.worstLatency = worstLatency;
	}

	public double getBestBandwidth() {
		return bestBandwidth;
	}

	public void setBestBandwidth(double bestBandwidth) {
		this.bestBandwidth = bestBandwidth;
	}

	public double getWorstBandwidth() {
		return worstBandwidth;
	}

	public void setWorstBandwidth(double worstBandwidth) {
		this.worstBandwidth = worstBandwidth;
	}

}
