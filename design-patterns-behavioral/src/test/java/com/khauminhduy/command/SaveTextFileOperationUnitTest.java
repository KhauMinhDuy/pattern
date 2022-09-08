package com.khauminhduy.command;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.khauminhduy.bd.command.command.SaveTextFileOperation;
import com.khauminhduy.bd.command.command.TextFileOperation;
import com.khauminhduy.bd.command.receiver.TextFile;

public class SaveTextFileOperationUnitTest {
	
	@Test
	public void givenSaveTextFileOperationIntance_whenCalledExecuteMethod_thenOneAssertion() {
		TextFileOperation saveFileOperation = new SaveTextFileOperation(new TextFile("file1.txt"));
		assertEquals("Saving file file1.txt", saveFileOperation.execute());
	}

}
