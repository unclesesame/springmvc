package com.abner.springmvc.model;

public class SensorImpl implements Sensor{
	
	private String sensorId;
	
	private Location sensorLocation;
	
	private LocationType locationType;
	
	private SensorType sensorType;
	
	private double sersorValue;
	
	public SensorImpl(String sensorId, Location location, SensorType sensorType, LocationType locationType){
		this.sensorId = sensorId;
		this.sensorLocation = location;
		this.sensorType = sensorType;
		this.locationType = locationType;
	}
	
	public String getSensorId() {
		return sensorId;
	}

	public void setSensorId(String sensorId) {
		this.sensorId = sensorId;
	}
	
	public Location getSensorLocation() {
		return sensorLocation;
	}

	public void setSensorLocation(Location sensorLocation) {
		this.sensorLocation = sensorLocation;
	}

	public LocationType getLocationType() {
		return locationType;
	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}
	
	public SensorType getSensorType() {
		return sensorType;
	}

	public void setSensorType(SensorType sensorType) {
		this.sensorType = sensorType;
	}

	public double getSensorValue() {
		return sersorValue;
	}

	public void setSensorValue(double value) {
		this.sersorValue = value;
	}

	@Override
	public String toString() {
		return "SensorImpl [sensorId=" + sensorId + ", sensorLocation=" + sensorLocation + ", locationType="
				+ locationType + ", sensorType=" + sensorType + ", sersorValue=" + sersorValue + "]";
	}

}
