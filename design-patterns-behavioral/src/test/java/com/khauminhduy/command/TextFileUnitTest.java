package com.khauminhduy.command;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.khauminhduy.bd.command.receiver.TextFile;

public class TextFileUnitTest {

	private static TextFile textFile;

	@BeforeClass
	public static void setUpTextFileInstance() {
		textFile = new TextFile("file1.txt");
	}

	@Test
	public void givenTextFileInstance_whenCalledopenMethod_thenOneAssertion() {
		assertEquals("Opening file file1.txt", textFile.open());
	}

	@Test
	public void givenTextFileInstance_whenCalledwriteMethod_thenOneAssertion() {
		assertEquals("Writing to file file1.txt", textFile.write());
	}

	@Test
	public void givenTextFileInstance_whenCalledsaveMethod_thenOneAssertion() {
		assertEquals("Saving file file1.txt", textFile.save());
	}

	@Test
	public void givenTextFileInstance_whenCalledcopyMethod_thenOneAssertion() {
		assertEquals("Copying file file1.txt", textFile.copy());
	}

	@Test
	public void givenTextFileInstance_whenCalledpasteMethod_thenOneAssertion() {
		assertEquals("Pasting file file1.txt", textFile.paste());
	}

}
