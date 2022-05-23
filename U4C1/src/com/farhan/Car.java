package com.farhan;

public class Car {
	private String model;
	private String companyName;
	private String color;
	private Engine engine;
	
	Car(){
		this.engine = new Engine();
	}
	
	Car(String model,String companyName,String color,int rpm,int power,String manufacturer){
		this.color=color;
		this.companyName=companyName;
		this.model=model;
		this.engine = new Engine();
		this.engine.setRmp(rpm);
		this.engine.setPower(power);
		this.engine.setManufacturer(manufacturer);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
