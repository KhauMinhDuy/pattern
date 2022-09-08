package com.khauminhduy.singleton.synchronization;

public class DraconianSingleton {

	private static DraconianSingleton instance;

	private DraconianSingleton() {
	}

	public static synchronized DraconianSingleton getInstance() {
		if (instance == null) {
			instance = new DraconianSingleton();
		}
		return instance;
	}

}
