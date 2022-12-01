package com.khauminhduy.l.advanced;

import java.io.File;
import java.io.IOException;

public class ReadOnlyFileSystem implements FileSystem {

	@Override
	public File[] listFiles(String path) {
		// code to list files
		return new File[0];
	}

	@Override
	public void deleteFile(String path) throws IOException {
		// Do nothing.
		// deleteFile operation is not supported on a read-only file system
	}

}
