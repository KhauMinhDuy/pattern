package com.khauminhduy.s;

import lombok.Data;

@Data
public class BadBook {

	private String name;
	private String author;
	private String text;

	// methods that directly relate to the book properties
	public String replaceWordInText(String word, String replacementWord) {
		return text.replaceAll(word, replacementWord);
	}

	public boolean isWordInText(String word) {
		return text.contains(word);
	}

	// methods for outputting text to console - should this really be here?
	void printTextToConsole() {
		// our code for formatting and printing the text
	}

}
