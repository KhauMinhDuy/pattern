package com.khauminhduy.creational.builder;

public class BankAccount {

	private final String name;
	private final String accountNumber;
	private final String email;
	private final boolean newsLetter;

	private BankAccount(BankAccountBuilder builder) {
		this.name = builder.name;
		this.accountNumber = builder.accountNumber;
		this.email = builder.email;
		this.newsLetter = builder.newsLetter;
	}

	public static class BankAccountBuilder {
		private String name;
		private String accountNumber;
		private String email;
		private boolean newsLetter;

		public BankAccountBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public BankAccountBuilder withAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public BankAccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public BankAccountBuilder withNewsLetter(boolean newsLetter) {
			this.newsLetter = newsLetter;
			return this;
		}

		public BankAccount build() {
			return new BankAccount(this);
		}
	}

	public String getName() {
		return name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public boolean isNewsLetter() {
		return newsLetter;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", email=" + email + ", newsLetter="
				+ newsLetter + "]";
	}

}
