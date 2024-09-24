package com.DoublyLinkedList;

public class Node<T> {

	private T data;
	private Node<T> previous;
	private Node<T> next;
	
	public Node(T data) {
	this.data=data;
	setPrevious(null);
	setNext(null);
	}
	public Node<T> getPrevious(){
		return previous;
	}
	public void setPrevious(Node<T> previous) {
		this.previous=previous;
	}
	public Node<T> getNext(){
		return next;
	}
	public void setNext(Node<T> next) {
		this.next=next;
	}
	public T getData() {
		return data;
	}
	public String toString() {
		return String.valueOf(data)+"<->"+(next==null?"null":next);
	}
}
