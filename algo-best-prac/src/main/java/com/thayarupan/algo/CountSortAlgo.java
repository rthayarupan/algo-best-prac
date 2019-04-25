package com.thayarupan.algo;

import java.util.Arrays;

public class CountSortAlgo {

	public static int[] countSort(int[] array) {
		int n = array.length;

		//Find maximum 
		int max = Arrays.stream(array).max().getAsInt();

		//count array
		int[] count = new int[max + 1];

		for (int i = 0; i < count.length; i++) {
			count[i] = 0;
		}

		for (int i = 0; i < array.length; i++) {
			++count[array[i]];
		}

		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}

		int[] output = new int[n];

		for (int i = array.length - 1; i >= 0; i--) {
			output[count[array[i]] - 1] = array[i];
			--count[array[i]];
		}

		return output;

	}

}
