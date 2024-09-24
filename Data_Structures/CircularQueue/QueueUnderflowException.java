package com.CircularQueue;

public class QueueUnderflowException extends Exception {

	public static final long serialVersionUID=1L;
	public QueueUnderflowException(String message) {
		super(message);
	}
}
