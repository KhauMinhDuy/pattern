package com.khauminhduy.bd.command.client;

import com.khauminhduy.bd.command.command.OpenTextFileOperation;
import com.khauminhduy.bd.command.command.SaveTextFileOperation;
import com.khauminhduy.bd.command.command.TextFileOperation;
import com.khauminhduy.bd.command.invoker.TextFileOperationExecutor;
import com.khauminhduy.bd.command.receiver.TextFile;

public class TextFileApplication {
	
	public static void main(String[] args) {
		TextFileOperation openFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
		TextFileOperation saveFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
		TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
		System.out.println(textFileOperationExecutor.executeOperation(openFileOperation));
		System.out.println(textFileOperationExecutor.executeOperation(saveFileOperation));
	}

}
