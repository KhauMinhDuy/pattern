package com.khauminhduy.reduceIfelse;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.khauminhduy.reducingIfElse.Expression;
import com.khauminhduy.reducingIfElse.Operator;
import com.khauminhduy.reducingIfElse.Result;
import com.khauminhduy.reducingIfElse.RuleEngine;

public class RuleEngineUnitTest {

	@Test
	public void whenNumbersGivenToRuleEngine_thenReturnCorrectResult() {
		Expression expression = new Expression(5, 5, Operator.ADD);
		RuleEngine ruleEngine = new RuleEngine();
		Result result = ruleEngine.process(expression);
		
		assertNotNull(result);
		assertEquals(10, result.getValue());
	}
}
