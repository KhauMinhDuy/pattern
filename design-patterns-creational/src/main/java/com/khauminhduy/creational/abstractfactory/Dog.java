package com.khauminhduy.creational.abstractfactory;

public class Dog implements Animal{

	@Override
	public String getType() {
		return "dog";
	}

	@Override
	public String makeSound() {
		return "barks";
	}

}
