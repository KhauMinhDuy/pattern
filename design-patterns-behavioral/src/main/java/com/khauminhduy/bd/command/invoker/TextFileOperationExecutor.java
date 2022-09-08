package com.khauminhduy.bd.command.invoker;

import java.util.ArrayList;
import java.util.List;

import com.khauminhduy.bd.command.command.TextFileOperation;

public class TextFileOperationExecutor {
	
	private final List<TextFileOperation> textFileOperations = new ArrayList<>();

	public String executeOperation(TextFileOperation operation) {
		textFileOperations.add(operation);
		return operation.execute();
	}

}
