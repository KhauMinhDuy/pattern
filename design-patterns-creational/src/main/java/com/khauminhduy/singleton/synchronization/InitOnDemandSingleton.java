package com.khauminhduy.singleton.synchronization;

public class InitOnDemandSingleton {

	private static class InstanceHolder {
		private static final InitOnDemandSingleton instance = new InitOnDemandSingleton();
	}

	private InitOnDemandSingleton() {
	}

	public static InitOnDemandSingleton getInstance() {
		return InstanceHolder.instance;
	}

}
