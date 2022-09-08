package com.khauminhduy.singleton;

public class ClassSingleton {

	private static ClassSingleton instance;
	private String info = "Initial class info";

	private ClassSingleton() {
		System.out.println("ClassSingleton created");
	}

	public static ClassSingleton getInstance() {
		if (instance == null) {
			instance = new ClassSingleton();
		}
		return instance;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
