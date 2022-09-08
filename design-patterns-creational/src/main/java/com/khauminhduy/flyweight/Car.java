package com.khauminhduy.flyweight;

import java.awt.Color;

public class Car implements Vehicle {

	private Engine engine;
	
	private Color color;
	
	public Car(Engine engine, Color color) {
		this.engine = engine;
		this.color = color;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void start() {
		System.out.println("Car is starting");
		engine.start();
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");
		engine.stop();
	}

	@Override
	public Color getColor() {
		return this.color;
	}

}
