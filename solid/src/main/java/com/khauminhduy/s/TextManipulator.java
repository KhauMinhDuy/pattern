package com.khauminhduy.s;

import lombok.Getter;

@Getter
public class TextManipulator {

	private String text;

	public TextManipulator(String text) {
		this.text = text;
	}

	public void appendText(String newText) {
		text = text.concat(newText);
	}

	public String findWordAndReplace(String word, String replacementWord) {
		if (text.contains(word)) {
			text = text.replace(word, replacementWord);
		}
		return text;
	}

	public String findWordAndDelete(String word) {
		if (text.contains(word)) {
			text = text.replace(word, "");
		}
		return text;
	}

	/*
	 * Bad practice when implementing SRP principle, not in the scope of this class
	 * public void printText() {
	 * System.out.println(textManipulator.getText());
	 * }
	 */
}
