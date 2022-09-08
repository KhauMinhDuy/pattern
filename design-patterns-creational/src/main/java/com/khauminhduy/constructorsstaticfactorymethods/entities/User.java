package com.khauminhduy.constructorsstaticfactorymethods.entities;

import java.time.LocalTime;

public class User {

	private static volatile User instance = null;
	private final String name;
	private final String email;
	private final String country;

	public static User createWithDefaultCountry(String name, String email) {
		return new User(name, email, "VietNam");
	}

	public static User createWithLoggedInstantiationTime(String name, String email, String country) {
		System.out.println("Creating User instance at : " + LocalTime.now());
		return new User(name, email, country);
	}

	public static User getSingletonInstance(String name, String email, String country) {
		if (instance == null) {
			synchronized (User.class) {
				if (instance == null) {
					instance = new User(name, email, country);
				}
			}
		}
		return instance;
	}

	private User() {
		this.name = "";
		this.email = "";
		this.country = "";
	}

	private User(String name, String email, String country) {
		this.name = name;
		this.email = email;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getCountry() {
		return country;
	}

}
