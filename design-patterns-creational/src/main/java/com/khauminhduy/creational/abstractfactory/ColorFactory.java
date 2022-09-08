package com.khauminhduy.creational.abstractfactory;

public class ColorFactory implements AbstractFactory<Color>{

	@Override
	public Color create(String type) {
		if("brown".equalsIgnoreCase(type)) {
			return new Brown();
		} else if("white".equalsIgnoreCase(type)) {
			return new White();
		}
		return null;
	}


}
