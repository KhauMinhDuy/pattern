package com.khauminhduy.command;

import static org.junit.Assert.assertEquals;

import java.util.function.Function;

import org.junit.BeforeClass;
import org.junit.Test;

import com.khauminhduy.bd.command.command.OpenTextFileOperation;
import com.khauminhduy.bd.command.command.SaveTextFileOperation;
import com.khauminhduy.bd.command.command.TextFileOperation;
import com.khauminhduy.bd.command.invoker.TextFileOperationExecutor;
import com.khauminhduy.bd.command.receiver.TextFile;

public class TextFileOperationExecutorUnitTest {
	
	private static TextFileOperationExecutor textFileOperationExecutor;

	@BeforeClass
	public static void setUpTextFileOperationExecutor() {
		textFileOperationExecutor = new TextFileOperationExecutor();
	}

	@Test
	public void givenTextFileOPerationExecutorInstance_whenCalledexecuteOperationWithOpenTextOperation_thenOneAssertion() {
		TextFileOperation openFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
		assertEquals("Opening file file1.txt", textFileOperationExecutor.executeOperation(openFileOperation));
	}

	@Test
	public void givenTextFileOPerationExecutorInstance_whenCalledexecuteOperationWithSaveTextOperation_thenOneAssertion() {
		TextFileOperation saveFileOperation = new SaveTextFileOperation(new TextFile("file1.txt"));
		assertEquals("Saving file file1.txt", textFileOperationExecutor.executeOperation(saveFileOperation));
	}

	@Test
	public void givenTextFileOperationExecutorInstance_whenCalledexecuteOperationWithTextFileOpenLambda_thenOneAssertion() {
		assertEquals("Opening file file1.txt", textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt"));
	}

	@Test
	public void givenTextFileOperationExecutorInstance_whenCalledexecuteOperationWithTextFileSaveLambda_thenOneAssertion() {
		assertEquals("Saving file file1.txt", textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt"));
	}

	@Test
	public void givenTextFileOperationExecutorInstance_whenCalledexecuteOperationWithTextFileOpenMethodReferenceOfExistingObject_thenOneAssertion() {
		TextFile textFile = new TextFile("file1.txt");
		assertEquals("Opening file file1.txt", textFileOperationExecutor.executeOperation(textFile::open));
	}

	@Test
	public void givenTextFileOperationExecutorInstance_whenCalledexecuteOperationWithTextFileSaveMethodReferenceOfExistingObject_thenOneAssertion() {
		TextFile textFile = new TextFile("file1.txt");
		assertEquals("Saving file file1.txt", textFileOperationExecutor.executeOperation(textFile::save));
	}

	@Test
	public void givenOpenTextFileOperationExecuteMethodReference_whenCalledApplyMethod_thenOneAssertion() {
		Function<OpenTextFileOperation, String> excuteMethodReference = OpenTextFileOperation::execute;
		assertEquals("Opening file file1.txt", excuteMethodReference.apply(new OpenTextFileOperation(new TextFile("file1.txt"))));
	}

	@Test
	public void givenSaveTextFileOperationExecuteMethodReference_whenCalledApplyMethod_thenOneAssertion() {
		Function<SaveTextFileOperation, String> excuteMethodReference = SaveTextFileOperation::execute;
		assertEquals("Saving file file1.txt", excuteMethodReference.apply(new SaveTextFileOperation(new TextFile("file1.txt"))));
	}

	@Test
	public void givenOpenAndSaveTextFileOperationExecutorInstance_whenCalledExecuteOperationWithLambdaExpression_thenBothAssertion() {
		TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
		assertEquals("Opening file file1.txt", textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt"));
		assertEquals("Saving file file1.txt", textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt"));
	}
	
}
