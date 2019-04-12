package com.thayarupan.algo;

import java.util.Arrays;

public class BinarySearchAlgo {
 
	public static int getElementIndexRecursive(final int[] array, final int x) {
		if (array == null || array.length == 0) {
			System.out.println("Invalid Array");
			return -1;
		}
		return search(array, x, 0, array.length-1);
	}
	
	public static int getElementIndexLoop(final int[] array, final int x) {
		if (array == null || array.length == 0) {
			System.out.println("Invalid Array");
			return -1;
		}
		return searchInLoop(array, x);
	}

	/**
	 * RECURSIVE 
	 * Binary search works - find middle index element 
	 * if it is equal => return middle index
	 * if less than middle => search in left half
	 * if greater or equal than middle => search in right half 
	 * ==> it continue until find a match
	 * Least complexity, 1st attempt is success ==> O(1), 
	 * Worse case => O(log(n)) - n is number of elements in array
	 * 
	 * Space complexity => O(1) - it does not require any additional space
	 *  
	 */
	private static int search(final int[] array, final int x, final int leftIndex, final int rightIndex) {
		if(leftIndex>rightIndex) {
			return -1;
		}		
		int middle = (leftIndex + rightIndex) / 2;		

		if (x==array[middle]) {
			return middle;  
		} else if (x>=array[middle]) {
			return search(array, x, middle + 1, rightIndex);
		} else if (x<array[middle]) {
			return search(array, x, leftIndex, middle - 1);
		}
		return -1;
	}
	
	/**
	 * LOOP
	 */
	private static int searchInLoop(final int[] array, final int x) {		
		int leftIndex = 0;
		int rightIndex =array.length-1;
		int middle = 0;			
		while(leftIndex<=rightIndex) {			
			middle = (leftIndex + rightIndex) / 2;	
			if (x==array[middle]) {
				return middle;  
			} else if (x>=array[middle]) {
				leftIndex = middle + 1;
			} else if (x<array[middle]) {
				rightIndex = middle-1;
			}
		}		
		return -1;
	}
	
}
