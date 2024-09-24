package com.QueueUsingArrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws QueueOverFlowException, QueueUnderFlowException{
		Queue<Integer> q=new Queue<>();
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1) Enqueue 2) Dequeue 3) Peek 4) Exit ");
			int entry=sc.nextInt();
			switch(entry) {
			case 1:
				   System.out.println("Enter Number of Elements to Enqueue the                      					Queue: ");
				   int enq=sc.nextInt();
				   for(int i=0;i<enq;i++) {
					System.out.println("Enter Element "+(i+1)+" to Enqueue: ");
					int data=sc.nextInt();
					q.enqueue(data);
				  }
				   break;
			case 2:
				System.out.println("Enter the Number of Elements to Dequeue: ");
				int deq=sc.nextInt();
				for(int i=0;i<deq;i++) {
					q.dequeue();
				}
				break;
			case 3:
				System.out.println("Peek of the Queue is "+q.peek());
				break;
			case 4:
				System.out.println("Queue Operation are Ended ");
				break;
			default: 
				System.out.println("Please enter a valid Input");
				break;
			}
			if(entry==4) {
				break;
			}
		}
		System.out.println("\n Queue Contents are : "+q+"\n Queue Size is : "+q.size());
		

	}

}
