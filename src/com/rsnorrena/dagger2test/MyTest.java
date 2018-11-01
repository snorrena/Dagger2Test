package com.rsnorrena.dagger2test;

import org.junit.Assert;
import org.junit.Test;

public class MyTest {
	
	//this comment was added in the feature branch
	//anothe comment added in the feature branch
	
	@Test
	public void dependencyInjectionTest() {
		
		VehiclesComponent component = DaggerVehiclesComponent.create();
		
		Car carOne = component.buildCar();
		
		System.out.println(carOne.toString());
		
		Assert.assertNotNull(carOne);
		Assert.assertNotNull(carOne.getBrand());
		Assert.assertEquals("Mustang", carOne.getBrand());
		Assert.assertNotNull(carOne.getEngine());
		Assert.assertEquals("V8", carOne.getEngine());
		
	}

}
