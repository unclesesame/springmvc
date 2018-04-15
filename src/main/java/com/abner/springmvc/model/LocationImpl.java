package com.abner.springmvc.model;

public class LocationImpl implements Location{

	private double latitude;
	private double longitude;
	
	
	public LocationImpl(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	@Override
	public String toString() {
		return "LocationImpl [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
}
