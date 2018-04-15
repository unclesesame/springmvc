package com.abner.springmvc.model;

public enum LocationType {
	HOME("HOME"),
	COMPANY("HOME");
	
	private final String value;
	
	private LocationType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
