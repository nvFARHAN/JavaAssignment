package com.farhan;

public class Engine {
	private int rpm;
	private int power;
	private String manufacturer;
	private boolean hasTurbo;
	Engine()
	{
		this.hasTurbo = false;
	}
	Engine(int rpm,int power,String manufacturer)
	{
		this.manufacturer=manufacturer;
		this.power=power;
		this.rpm=rpm;
		this.hasTurbo=false;
	}
	public int getRpm() {
		return rpm;
	}
	public void setRmp(int rpm) {
		this.rpm = rpm;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public boolean isHasTurbo() {
		return hasTurbo;
	}
	public void setHasTurbo(boolean hasTurbo) {
		this.hasTurbo = hasTurbo;
	}
	
	public void setTurbo()
	{
		this.hasTurbo = true;
	}
	
}
