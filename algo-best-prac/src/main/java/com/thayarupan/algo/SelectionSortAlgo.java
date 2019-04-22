package com.thayarupan.algo;

public class SelectionSortAlgo {

	public static void selectionSort(int array[]) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[min_index]) {
					min_index = j;
				}
			}

			if (array[min_index] != array[i]) {
				int temp = array[min_index];
				array[min_index] = array[i];
				array[i] = temp;
			}

		}
	}

}
