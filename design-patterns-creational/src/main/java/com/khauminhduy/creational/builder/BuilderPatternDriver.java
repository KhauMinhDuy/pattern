package com.khauminhduy.creational.builder;

public class BuilderPatternDriver {

	public static void main(String[] args) {
		BankAccount account = new BankAccount.BankAccountBuilder()
					.withName("DuyKhau")
					.withAccountNumber("1234567891")
					.withEmail("khauminhduy@gmail.com")
					.withNewsLetter(true)
					.build();
		
		System.out.println(account);
	}
	
}
