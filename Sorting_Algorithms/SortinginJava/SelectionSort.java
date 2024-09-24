package com.SortinginJava;

import java.util.Arrays;

public class SelectionSort {

	public static void swap(int list[],int iIndex,int jIndex) {
		int temp=list[iIndex];
		list[iIndex]=list[jIndex];
		list[jIndex]=temp;
	};
	public static void selectionSort(int[] unSortedList) {
		for(int i=0;i<unSortedList.length;i++) {
			for(int j=i+1;j<unSortedList.length;j++) {
				if(unSortedList[i]>unSortedList[j]) {
					swap(unSortedList,i,j);
					
				}
			}
		}
		System.out.println(Arrays.toString(unSortedList));
	}
	public static void main(String args[]) {
		int unSortedList[]= new int[] {
				10,40,60,4,5,25,71,15,1,36,55
		};
		System.out.println(Arrays.toString(unSortedList));
		selectionSort(unSortedList);
	}
}
