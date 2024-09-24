package com.QueueUsingArrays;

import java.util.Arrays;

public class Queue<T> {
	
	private static final int MAX_SIZE=10;
	private Object array[];
	private int frontIndex=-1;
	private int rearIndex=-1;
	public Queue() {
		array=new Object[MAX_SIZE];
	}
	public boolean isEmpty() {
		return frontIndex==-1 && rearIndex==-1;
	}
	public boolean isFull() {
		return frontIndex==0 && rearIndex==MAX_SIZE-1;
		
	}
	public int size() {
		if(isEmpty()) {
			return 0;
		}
		return rearIndex-frontIndex+1;
	}
	public T peek() throws QueueUnderFlowException{
		if(isEmpty()) {
			throw new QueueUnderFlowException("Queue is Empty, Cannot Peek");
		}
		@SuppressWarnings("unchecked")
		T topElement=(T)array[frontIndex];
		return topElement;
		}
	public String toString() {
		return Arrays.toString(array);
	}
	public void enqueue(T data) throws QueueOverFlowException {
		if(isFull()) {
			throw new QueueOverFlowException("Queue is full! Cannot add Elements ");
		}
		if(isEmpty()) {
		array[0]=data;
		frontIndex=0;
		rearIndex=0;
		return;		
		}
		if(rearIndex<MAX_SIZE-1) {
			rearIndex++;
			array[rearIndex]=data;
			return;
		}
		
			int copyIndex=0;
			for(int i=frontIndex;i<rearIndex;i++) {
				array[copyIndex]=array[i];
				copyIndex++;
			}
			array[copyIndex]=data;
			frontIndex=0;
			rearIndex=copyIndex;
		
	}
	public T dequeue() throws QueueUnderFlowException{
		if(rearIndex==-1 && frontIndex==-1) {
			throw new QueueUnderFlowException("Element Cannot be Dequeued. Queue is Empty");
		}
		@SuppressWarnings("unchecked")
		T data=(T)array[frontIndex];
		if(frontIndex==rearIndex) {
			frontIndex=-1;
			rearIndex=-1;
		}else {
			frontIndex++;
		}
		return data;
		
	}

}
