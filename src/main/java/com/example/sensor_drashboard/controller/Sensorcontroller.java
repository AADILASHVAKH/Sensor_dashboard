package com.example.sensor_drashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sensor_drashboard.model.Sensor;
import com.example.sensor_drashboard.service.Sensorservice;

@RestController
public class Sensorcontroller {
	@Autowired
	private Sensorservice sensorService;
	
	@GetMapping("/api/sensors")
	public List<Sensor> getSensors(){
		
		return sensorService.getSensors();
	}
	

}
