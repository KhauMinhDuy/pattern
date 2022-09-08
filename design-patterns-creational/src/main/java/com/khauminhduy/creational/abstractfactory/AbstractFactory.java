package com.khauminhduy.creational.abstractfactory;

public interface AbstractFactory<T>{

	T create(String type);
	
}
