package com.CircularQueue;

import java.util.Arrays;
import java.lang.reflect.Array;

public class CircularQueue<T> {

	private static final int MAX_SIZE=10;
	private T[] array;
	private int frontIndex=-1;
	private int rearIndex=-1;
	
	@SuppressWarnings("unchecked")
	public CircularQueue(Class<T> clazz) {
		array=(T[])Array.newInstance(clazz,MAX_SIZE);
	}
	public boolean isEmpty() {
		return frontIndex==-1 && rearIndex==-1;
	}
	public boolean isFull() {
		int nextIndex=(rearIndex+1)%array.length;
		return nextIndex==frontIndex;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\n");
		sb.append(Arrays.toString(array));
		sb.append("\n Front : "+frontIndex+" Rear : "+rearIndex);
		return sb.toString();
	}
	public void enqueue(T data) throws QueueOverflowException{
		if(isFull()) {
			throw new QueueOverflowException("Queue is Full");
		}
		rearIndex=(rearIndex+1)%array.length;
		array[rearIndex]=data;
		if(frontIndex==-1) {
			frontIndex=rearIndex;
		}
	}
	public T dequeue() throws QueueUnderflowException{
		if(isEmpty()) {
			throw new QueueUnderflowException("Queue is Empty");
		}
		T data=array[frontIndex];
		if(frontIndex==rearIndex) {
			frontIndex=-1;
			rearIndex=-1;
		}
		else {
			frontIndex=(frontIndex+1)%array.length;
		}
		return data;
	}
	public T peek() throws QueueUnderflowException{
		if(isEmpty()) {
			throw new QueueUnderflowException("Queue is Empty, Cannot peek");
		}
		return array[frontIndex];
	}
}
