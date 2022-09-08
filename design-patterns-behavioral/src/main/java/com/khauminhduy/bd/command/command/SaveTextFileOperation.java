package com.khauminhduy.bd.command.command;

import com.khauminhduy.bd.command.receiver.TextFile;

public class SaveTextFileOperation implements TextFileOperation {

	private TextFile textFile;

	public SaveTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.save();
	}

}
