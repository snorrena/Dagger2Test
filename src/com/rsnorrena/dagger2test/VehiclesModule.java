package com.rsnorrena.dagger2test;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class VehiclesModule {
	
//	@Provides
//	public String provideEngine() {
//		return "V8";
//	}
	
//	@Provides
//	@Singleton
//	public String provideBrand() {
//		return "Mustang";
//	}
	
	@Provides
	@Singleton
	public Car provideCar() {
		return new Car("Mustang", "V8");
	}

}
