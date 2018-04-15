package com.abner.springmvc.service;


import java.util.Map;

import com.abner.springmvc.model.Sensor;
import com.abner.springmvc.model.User;

public interface UserService {
	
	boolean controlSensor(User user, Sensor sensor, int value);
	
	Map<String, Sensor> getAllSensors();
}
