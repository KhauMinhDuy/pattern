package com.khauminhduy.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>{

	@Override
	public Animal create(String type) {
		if("dog".equalsIgnoreCase(type)) {
			return new Dog();
		} else if("duck".equalsIgnoreCase(type)) {
			return new Duck();
		}
		return null;
	}

}
