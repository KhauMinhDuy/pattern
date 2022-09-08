package com.khauminhduy.creational.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		System.out.println(singleton1);
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2);
		
		System.out.println(singleton1 == singleton2);
	}
	
}
