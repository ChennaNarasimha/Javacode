package com.TreeDataStructure;

public class Node<T> {
	
	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;
	
	public Node(T data) {
		this.data=data;
	}
	public T getData() {
		return data;
	}
	public void setLeftChild(Node<T> leftChild){
		this.leftChild=leftChild;
	}
	public Node<T> getLeftChild(){
		return leftChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild=rightChild;
	}
	public Node<T> getRightChild(){
		return rightChild;
	}
	public String toString() {
		return data.toString();
	}

}
