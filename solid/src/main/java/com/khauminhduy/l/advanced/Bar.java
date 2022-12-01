package com.khauminhduy.l.advanced;

public class Bar extends Foo {

	@Override
	public void doStuff(int num) {
		if (num <= 0 || num > 10) {
			throw new IllegalArgumentException("Input out of range 1-10");
		}
		// some logic here...
	}

	@Override
	public void doOtherStuff(int num) {
		if (num <= 0 || num > 3) {
			throw new IllegalArgumentException("Input out of range 1-3");
		}
		// some logic here...
	}

	@Override
	public Number generateNumber() {
		return new Integer(10);
	}

}
