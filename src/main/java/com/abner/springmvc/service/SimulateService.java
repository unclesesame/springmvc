package com.abner.springmvc.service;

import java.util.HashMap;
import java.util.Map;

import com.abner.springmvc.model.Location;
import com.abner.springmvc.model.LocationImpl;
import com.abner.springmvc.model.LocationType;
import com.abner.springmvc.model.Sensor;
import com.abner.springmvc.model.SensorImpl;
import com.abner.springmvc.model.SensorType;
import com.alibaba.fastjson.JSON;

public class SimulateService {
	
	private static final int SCALE = 100;
	
	private static final long FREQUENCY = 100;
	
	private static Map<String, Sensor> sensorMap;
	
	private static void init(){
		sensorMap = new HashMap<String, Sensor>();
		for(int i=0; i < SCALE ; i++){
			Location location = new LocationImpl(Math.random()*180, Math.random()*360);
			Sensor sensor = new SensorImpl(String.valueOf(i), location, 
					EnumsUtil.random(SensorType.class),EnumsUtil.random(LocationType.class));
			sensorMap.put(sensor.getSensorId(), sensor);
		}
	}
	
	private static void randomSetSensor(String currentSensorId) {
		sensorMap.get(currentSensorId).setSensorValue(Math.random()*20);
	}
	
	public static void main(String[] args) {
		init();
		
		while(true){
			String currentSensorId = String.valueOf((int)(Math.random() * SCALE));
			randomSetSensor(currentSensorId);
			try {
				Thread.sleep(FREQUENCY);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String output = JSON.toJSONString(sensorMap.get(currentSensorId));
			System.out.println(output);
			ConnectionUtil.postData(output);
		}
	}
}
