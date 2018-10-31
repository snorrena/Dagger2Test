package com.rsnorrena.dagger2test;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = VehiclesModule.class)
public interface VehiclesComponent {
	Car buildCar();
}
