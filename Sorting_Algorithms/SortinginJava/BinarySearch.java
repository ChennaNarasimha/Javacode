package com.SortinginJava;

import java.util.Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void swap(int[] list,int iIndex,int jIndex) {
		int temp=list[iIndex];
		list[iIndex]=list[jIndex];
		list[jIndex]=temp;
	}
	public static void bubbleSort(int[] listToSwap) {
		for(int i=listToSwap.length-1;i>0;i--) {
			System.out.println("\ni="+i);
			boolean swapped=false;//Early Stopping
			for(int j=0;j<i;j++) {
				if(listToSwap[j]>listToSwap[j+1]) {
					swap(listToSwap,j,j+1);
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println("\n"+Arrays.toString(listToSwap));
	}
	public static int binarySearch(int[] list,int element) {
		int low=0;
		int high=list.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			System.out.println("Low="+low+" High="+high+" Mid="+mid+" Mid Element="+list[mid]);
			if(list[mid]==element) {
	         System.out.println("Element found: "+list[mid]);
	         return mid;
			}
			else if(list[mid]<element) {
	        	low=mid+1; 
	         }
			else {
				high=mid-1;
			}
		}
		System.out.println("Element not found: "+element);
		return -1;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 Elements ");
		int sortedList[]=new int[5] ;
		for(int i=0;i<sortedList.length;i++) {
			sortedList[i]=sc.nextInt();
		}
		bubbleSort(sortedList);
		System.out.println("Enter the element that you want to find: ");
		int found=sc.nextInt();
		binarySearch(sortedList,found);
	}
}
