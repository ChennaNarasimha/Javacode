
package com.LinkedList;

public class Node<T> {
	
	private T data;
	private Node<T> next;
	
	public Node(T data) {
		this.data=data;
		setNext(null);
	}
	public T getData() {
		return data;
	}
	public void setNext(Node<T> next) {
		this.next=next;
	}
	public Node<T> getNext(){
		return next;
	}
	public String toString() {
		return String.valueOf(data)+"->"+((next==null)? "null": next.toString());
	}
}

public class LinkedList<T extends Comparable <T>> {

	public Node<T> head;
	public LinkedList() {
		
	}
	public void insertAtHead(T data) {
		Node<T> node=new Node<T>(data);
		if(head!=null) {
			node.setNext(head);
		}
		head=node;
	}
	public String toString() {
		if(head==null) {
			return "";
		}
		return head.toString();
	}
	public int countNode() {
		Node<T> curr=head;
		int count=0;
		while(curr!=null) {
			curr=curr.getNext();
			count++;
		}
		return count;
	}
	public void insertAtTail(T data) {
		Node<T> node=new Node<T>(data);
		if(head==null) {
			head=node;
			return;
		}
		Node<T> curr=head;
		while(curr.getNext()!=null) {
			curr=curr.getNext();
		}
		curr.setNext(node);
	}
	public void insert(T data, int index) {
		if(index<=0) {
			insertAtHead(data);
			return;
		}
		Node<T> curr=head;
		int currIndex=1;
		while(curr.getNext()!=null && currIndex<index) {
			curr=curr.getNext();
			currIndex++;
		}
		Node<T> next=curr.getNext();
		Node<T> newNode=new Node<T>(data);
		newNode.setNext(next);
		curr.setNext(newNode);
	}
	public T pop() {
		if(head==null) {
			return null;
		}
		Node<T> first=head;
		head=head.getNext();
		return first.getData();
	}
	//Delete
	public void delete(T data) {
		Node<T> curr=head;
		Node<T> prev=null;
		while(curr.getNext()!=null) {
			if(curr.getData().equals(data)){
				if(prev==null) {
					head=head.getNext();
				}
				else {
					prev.setNext(curr.getNext());
				}
				break;
			}
			prev=curr;
			curr=curr.getNext();
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=new LinkedList<>();
		System.out.println("\nLinkedList Node Count(empty) "+linkedList.countNode());
		System.out.println();
		linkedList.insertAtHead(100);
		linkedList.insertAtHead(200);
		linkedList.insertAtHead(300);
		System.out.println(linkedList);
		System.out.println("\nLinkedList Count : "+linkedList.countNode());
		linkedList.insertAtTail(50);
		System.out.println(linkedList);
		System.out.println("\nLinkedList Count : "+linkedList.countNode());
		System.out.println();
		linkedList.insert(400, 0);
		System.out.println(linkedList);
		System.out.println("\nLinkedList Count : "+linkedList.countNode());
		System.out.println();
		linkedList.insertAtHead(600);
		linkedList.insert(500,1);
		System.out.println(linkedList);
		System.out.println("\nLinkedList Count : "+linkedList.countNode());
		linkedList.delete(300);
		System.out.println(linkedList);
		System.out.println("\nLinkedList Count : "+linkedList.countNode());
		
	}

}

