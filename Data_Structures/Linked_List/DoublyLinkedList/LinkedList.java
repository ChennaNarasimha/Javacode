package com.DoublyLinkedList;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	
	public LinkedList() {
		
	}
	public Node<T> getHead(){
		return head;
	}
	public Node<T> getTail(){
		return tail;
	}
	public void insertAtHead(T data) {
		Node<T> node=new Node<T>(data);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		node.setNext(head);
		head.setPrevious(node);
		head=node;
		
	}
	public void insertAtTail(T data) {
		Node<T> node=new Node<T>(data);
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		tail.setNext(node);
		node.setPrevious(tail);
		tail=node;
	}
	public String toString() {
		if(head==null) {
			return "";
		}
		return head.toString();
	}
	public void delete(T data) {
		Node<T> curr=head;
		while(curr!=null) {
			if(curr.getData().equals(data)) {
				Node<T> prev=curr.getPrevious();
				Node<T> next=curr.getNext();
				if(prev==null) {
					head=head.getNext();
					head.setNext(null);
				}else {
					prev.setNext(next);
					if(next!=null) {
						next.setPrevious(prev);
					}
				}
				break;
			}
			curr=curr.getNext();
		}
		if(tail==curr && curr!=null) {
	         tail=curr.getPrevious();		
		}
	}
}
