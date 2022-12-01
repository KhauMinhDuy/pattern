package com.khauminhduy.l;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MotorCar implements Car {

	private Engine engine;

	// Constructors, getters + setters

	@Override
	public void turnOnEngine() {
		// turn on the engine!
		engine.on();
	}

	@Override
	public void accelerate() {
		// move forward!
		engine.powerOn(1000);
	}

}
