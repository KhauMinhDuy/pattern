package com.khauminhduy.singleton;

public class Sanbox {

	public static void main(String[] args) {
		ClassSingleton classSingleton1 = ClassSingleton.getInstance();
		System.out.println(classSingleton1.getInfo());
		
		ClassSingleton classSingleton2 = ClassSingleton.getInstance();
		classSingleton2.setInfo("new class info");
		
		System.out.println(classSingleton1.getInfo());
		System.out.println(classSingleton2.getInfo());
		
		System.out.println();
		
		EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();
		System.out.println(enumSingleton1.getInfo());
		
		EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
		enumSingleton2.setInfo("new enum info");
		
		System.out.println(enumSingleton1.getInfo());
		System.out.println(enumSingleton2.getInfo());
	}
	
}
