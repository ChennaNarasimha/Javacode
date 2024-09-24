package com.StackUsingArrays;

import java.util.Arrays;

public class Stack<T> {

	public static final int MAX_SIZE=10;
	public Object array[];
	public int index=-1;
	public Stack(){
		array=new Object[MAX_SIZE];
	}
	
	public boolean isEmpty() {
		return index==-1;
	}
	public boolean isFull() {
		return index==MAX_SIZE-1;
	}
	public int size() {
		return index+1;
	}
	public String toString() {
		return Arrays.toString(array); 
	}
	public void push(T element) throws StackOverFlowException{
		if(isFull()) {
			throw new StackOverFlowException("Stack is Full, Cannot add Elements ");
		}
		index++;
	    array[index]=element;	
	}
	
	public T pop() throws StackUnderflowException{
		if(isEmpty()) {
		   throw new StackUnderflowException("Stack is Empty, Cannot PoP");
		}
		@SuppressWarnings("unchecked")
		T remove=(T)array[index];
		index--;
		return remove;
	}
	
	public T peek() throws StackUnderflowException{
		if(isEmpty()) {
			throw new StackUnderflowException("Stack is Empty, Cannot Peek");
		}
		@SuppressWarnings("unchecked")
		T topElement=(T)array[index];
		return topElement;
	}

	public static void main(String args[]) throws StackOverFlowException ,StackUnderflowException {
		Stack<String> s=new Stack<>();
		s.push("Java");
		s.push("Python");
		s.push("C++");
		s.push("R");
		s.push("Chenna");
		s.push("Flask");
		System.out.println("Stack Contents: "+s);
		System.out.println("Peek of the Stack: "+s.peek());
	}
	
	
}
