package com.khauminhduy.creational.abstractfactory;

public class AbstractPatternDriver {

	public static void main(String[] args) {
		AbstractFactory<?> abstractFactory = FactoryProvider.getFactory("toy");
		Animal toy = (Animal) abstractFactory.create("dog");
		System.out.println(toy);
		
		abstractFactory = FactoryProvider.getFactory("color");
		Color color = (Color) abstractFactory.create("brown");
		System.out.println(color);
		
		String result = "A " + toy.getType() + " with " + color.getColor() + " color " + toy.makeSound();
		System.out.println(result);
	}
	
}
