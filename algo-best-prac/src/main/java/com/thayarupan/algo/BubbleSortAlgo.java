package com.thayarupan.algo;

public class BubbleSortAlgo {

	/**
	 * Worst case time complexity - O(n*n)
	 * Best case time complexity - O(n)
	 * Average complexity: O(n^2)
	 * Space complexity: O(1)
	 * 
	 */
	public static int[] bubbleLoop(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean swap = false; // Does it have swap on first iteration, if no, the array is sorted
			for (int j = 0; j < array.length - i - 1; j++) {
				// swap
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					swap = true;
				}
			}
			if (!swap) {
				break;// Make sure sorted array complexity in O(n)
			}
		}
		return array;
	}

	/**
	 * Recursive does not have any performance benefit but just to understand the concept.
	 * 
	 * 
	 */
	public static void bubbleRecursive(int[] array, int n) {
		if (n == 1) {
			return;
		}
		boolean swap = false;
		for (int j = 0; j < n - 1; j++) {
			// swap
			if (array[j] > array[j + 1]) {
				int temp = array[j + 1];
				array[j + 1] = array[j];
				array[j] = temp;
				swap = true;
			}
		}
		if (swap) {
			bubbleRecursive(array, n - 1);
		}
	}

}
