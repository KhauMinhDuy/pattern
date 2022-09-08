package com.khauminhduy.reduceIfelse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.khauminhduy.reducingIfElse.AddCommand;
import com.khauminhduy.reducingIfElse.Calculator;
import com.khauminhduy.reducingIfElse.Operator;

public class CalculatorUnitTest {

	@Test
	public void whenCalculateUsingStringOperator_thenReturnCorrectResult() {
		Calculator calculator = new Calculator();
		int result = calculator.calculate(3, 4, "add");
		assertEquals(7, result);
	}
	
	@Test
	public void whenCalculateUsingSwitchString_thenReturnCorrectResult() {
		Calculator calculator = new Calculator();
		int result = calculator.calculateUsingSwitch(3, 4, "add");
		assertEquals(7, result);
	}
	
	@Test
	public void whenCalculateUsingSwitchOperator_thenReturnCorrectResult() {
		Calculator calculator = new Calculator();
		int result = calculator.calculateUsingSwitch(3, 4, Operator.ADD);
		assertEquals(7, result);
	}
	
	@Test
	public void whenCalculateUsingEnumOperator_thenReturnCorrectResult() {
		Calculator calculator = new Calculator();
		int result = calculator.calculate(3, 4, Operator.ADD);
		assertEquals(7, result);
	}
	
	@Test
	public void whenCalculateUsingCommand_thenReturnCorrectResult() {
		Calculator calculator = new Calculator();
		int result = calculator.calculate(new AddCommand(3, 4));
		assertEquals(7, result);
	}
	
	@Test
	public void whenCalculateUsingFactory_thenReturnCorrectResult() {
		Calculator calculator = new Calculator();
		int result = calculator.calculateUsingFactory(3, 4, "add");
		assertEquals(7, result);
	}
	
}
