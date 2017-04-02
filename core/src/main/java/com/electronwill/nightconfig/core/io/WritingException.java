package com.electronwill.nightconfig.core.io;

/**
 * @author TheElectronWill
 */
public class WritingException extends RuntimeException {
	public WritingException(String message) {
		super(message);
	}

	public WritingException(String message, Throwable cause) {
		super(message, cause);
	}

	public static WritingException writeFailed(Throwable cause) {
		return new WritingException("Failed to write data to Writer", cause);
	}
}