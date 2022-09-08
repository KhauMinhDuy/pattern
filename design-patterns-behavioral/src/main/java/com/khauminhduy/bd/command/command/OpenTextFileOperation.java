package com.khauminhduy.bd.command.command;

import com.khauminhduy.bd.command.receiver.TextFile;

public class OpenTextFileOperation implements TextFileOperation {

	private TextFile textFile;

	public OpenTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.open();
	}

}
