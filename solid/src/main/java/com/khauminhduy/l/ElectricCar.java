package com.khauminhduy.l;

public class ElectricCar implements Car {

	@Override
	public void turnOnEngine() {
		throw new AssertionError("I don't have an engine!");
	}

	@Override
	public void accelerate() {

	}

}
