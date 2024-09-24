package com.CircularQueue;

public class Main {

	public static void main(String[] args) throws QueueUnderflowException,QueueOverflowException {
		
		CircularQueue<String> queue=new CircularQueue<>(String.class);
		queue.enqueue("java");
		queue.enqueue("pyton");
		queue.enqueue("Golang");
		queue.enqueue("javaScript");
		queue.dequeue();
		
		System.out.println("Queue content: "+queue);
		System.out.println("Peek Element : "+queue.peek());
		queue.dequeue();
		System.out.println(queue);
		queue.enqueue("R");
		System.out.println(queue);
		
	}

}
