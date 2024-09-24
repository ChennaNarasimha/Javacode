//Adaptive Sort and Stable sort
package com.SortinginJava;

import java.util.Arrays;

public class BubbleSort {

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
	public static void main(String args[]) {
		int unSortedList[]= new int[] {
				1,2,3,4,5,6,7,8,9
		};
		System.out.println(Arrays.toString(unSortedList));
		bubbleSort(unSortedList);
	}
}
