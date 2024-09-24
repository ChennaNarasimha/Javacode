package com.QueueUsingArrays;

public class QueueUnderFlowException extends Exception {

	private static final long serialVersionUID=1L;
	
	public QueueUnderFlowException(String message) {
		super(message);
	}
}
