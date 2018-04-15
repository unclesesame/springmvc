package com.abner.springmvc.service;

import java.util.Map;

import com.abner.springmvc.model.Sensor;
import com.abner.springmvc.model.User;

public class UserServiceImpl implements UserService{
	
	public boolean controlSensor(User user, Sensor sensor, int value) {
		sensor.setSensorValue(value);
		return true;
	}

	public Map<String, Sensor> getAllSensors() {
		return null;
	}
}
