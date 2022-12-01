package com.khauminhduy.o;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Addition implements CalculatorOperation {

	private double left;
	private double right;
	private double result;

	public Addition(double left, double right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public void perform() {
		result = left + right;
	}

}
