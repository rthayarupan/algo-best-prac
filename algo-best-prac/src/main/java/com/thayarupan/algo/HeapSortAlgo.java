package com.thayarupan.algo;

public class HeapSortAlgo {

	public static void heap(int[] array) {
		int n = array.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}

		for (int i = n - 1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			//Heepify again from top
			heapify(array, i, 0);
		}
	}

	private static void heapify(int[] array, int n, int i) {
		// tree i parent, 2*i+1 is left child and 2*i+2 is right child
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && array[l] > array[largest]) {
			largest = l;
		}
		if (r < n && array[r] > array[largest]) {
			largest = r;
		}
		if (largest != i) {
			int temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;

			heapify(array, n, largest); // affected tree.
		}
	}

}
