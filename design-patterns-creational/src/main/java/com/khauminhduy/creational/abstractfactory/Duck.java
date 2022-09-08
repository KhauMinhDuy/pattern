package com.khauminhduy.creational.abstractfactory;

public class Duck implements Animal{

	@Override
	public String getType() {
		return "duck";
	}

	@Override
	public String makeSound() {
		return "squeks";
	}

}
