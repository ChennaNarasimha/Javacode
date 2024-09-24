package com.DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> dl=new LinkedList<>();
		dl.insertAtHead(100);
		dl.insertAtHead(200);
		dl.insertAtTail(300);
		System.out.println(dl);
		System.out.println("Head : "+dl.getHead().getData()+" Tail:   "+dl.getTail().getData());

	}

}
