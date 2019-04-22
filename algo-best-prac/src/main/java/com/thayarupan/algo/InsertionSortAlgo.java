package com.thayarupan.algo;

public class InsertionSortAlgo {

	/**
	 * Data structure:  Array
	 * Worst-case performance: О(n2) comparisons and swaps
	 * Best-case performance: O(n) comparisons, O(1) swaps
	 * Average performance: О(n2) comparisons and swaps
	 * Worst-case space complexity: О(n) total, O(1) auxiliary
	 */
	public static void insertionSort(int[] array){	
		int n = array.length;
		//Loop
		for(int i=1; i<n;i++) {
			int key = array[i];
			int j = i-1;
			//Swap
			while(j>=0 && array[j]>key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;			
		}
	}
	
}
