package com.khauminhduy.bd.interpreter;

import java.util.List;

public class Select implements Expression {

	private String column;
	private From from;

	Select(String column, From from) {
		this.column = column;
		this.from = from;
	}

	@Override
	public List<String> interpret(Context context) {
		context.setColumn(column);
		return from.interpret(context);
	}

}
