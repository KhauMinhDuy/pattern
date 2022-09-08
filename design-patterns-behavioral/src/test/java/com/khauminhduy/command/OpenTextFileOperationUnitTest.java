package com.khauminhduy.command;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.khauminhduy.bd.command.command.OpenTextFileOperation;
import com.khauminhduy.bd.command.command.TextFileOperation;
import com.khauminhduy.bd.command.receiver.TextFile;

public class OpenTextFileOperationUnitTest {
	
	@Test
	public void givenOpenTextFileOperationIntance_whenCalledExecuteMethod_thenOneAssertion() {
		TextFileOperation openFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
		assertEquals("Opening file file1.txt", openFileOperation.execute());
	}

}
