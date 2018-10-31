package com.rsnorrena.dagger2test;

import javax.inject.Inject;

public class Car {
	
	private String brand;
	private String engine;

	@Inject
	public Car(String brand, String engine) {
		this.brand = brand;
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engine=" + engine + "]";
	}
	
	

}
