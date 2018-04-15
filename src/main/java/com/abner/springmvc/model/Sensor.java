package com.abner.springmvc.model;

public interface Sensor {
	
	String getSensorId();
	
	void setSensorId(String sensorId);
	
	Location getSensorLocation();
	
	void setSensorLocation(Location sensorLocation);
	
	LocationType getLocationType();
	
	void setLocationType(LocationType locationType);
	
	SensorType getSensorType();
	
	void setSensorType(SensorType sensorType);
	
	double getSensorValue();
	
	void setSensorValue(double value);
	
}
