package com.khauminhduy.singleton;

public enum EnumSingleton {

	INSTANCE("Initial enum info");

	private String info;

	private EnumSingleton(String info) {
		this.info = info;
	}
	
	public EnumSingleton getInstance() {
		return INSTANCE;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
