package com.example.sensor_drashboard.model;

public class Sensor {
	
	private String name;
	private String values;
	private String status;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValues() {
		return values;
	}
	public void setValues(String values) {
		this.values = values;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Sensor(String name, String values, String status) {
		super();
		this.name = name;
		this.values = values;
		this.status = status;
	}
	
}
