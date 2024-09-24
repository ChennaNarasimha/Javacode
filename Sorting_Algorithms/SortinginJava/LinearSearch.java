package com.SortinginJava;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter any 5 integers");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element to search: ");
		int search=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==search) {
				System.out.println("Element found: "+search+" at index "+i);
				flag=true;	
			}
			
			}
		
	if(!flag) {
		System.out.println("Element not found");
	}
	}
}
