package com.abner.springmvc.model;

public enum SensorType {
	TEMPRATURE("TEMPRATURE"),
	HUMIDITY("HUMIDITY"),
	LIGHT("LIGHT");
	
	private final String value;
	
	private SensorType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
