package com.example.sensor_drashboard.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.sensor_drashboard.model.Sensor;

@Service
public class Sensorservice {
	
	public List<Sensor> getSensors(){
		
		Random random = new Random();
		
		int temperature= 25+random.nextInt(11);
		int humidity = 50+random.nextInt(31);
		int airquality= 80+random.nextInt(71);
		int light= 700+random.nextInt(301);
		
		return Arrays.asList(
				
				new Sensor("Temperature",temperature+"c",temperature>32 ? "High" : "Normal"),
				new Sensor("humidity",humidity+"%" ,humidity>70 ? "High" : "Good"),
				new Sensor("Air quality",airquality+"AIO",airquality>120?"Moderate":"Good"),
				new Sensor("Light",light+"Lux",light>900?"Bright":"Normal")				
				);
	}

}
