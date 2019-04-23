package com.thayarupan.algo;

import java.util.Arrays;

public class MergeSortAlgo {

	public static void mergeSort(int[] array) {
		//System.out.println("D Given Array: "+Arrays.toString(array));
		int n = array.length;
		if(n<=1) {
			return;
		}
		
		int mid = n / 2;

		int[] leftArray = new int[mid];
		int[] rightArray = new int[n - mid];
		int i = 0;
		for (; i < mid; i++) {
			leftArray[i] = array[i];
		}
		 
		for (; i < n; i++) {
			rightArray[i-mid] = array[i];
		}
//		System.out.println("D Left Array: "+Arrays.toString(leftArray));
//		System.out.println("D Right Array: "+Arrays.toString(rightArray));
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(array, leftArray, rightArray);
	}

	private static void merge(int[] array, int[] leftArray, int[] rightArray) {
//		System.out.println("M Array: "+Arrays.toString(array));
//		System.out.println("M Left Array: "+Arrays.toString(leftArray));
//		System.out.println("M Right Array: "+Arrays.toString(rightArray));
		
		
		int left = leftArray.length;
		int right = rightArray.length;

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if(leftArray[i]<=rightArray[j]) {
				array[k++] = leftArray[i++];
			}else {
				array[k++] = rightArray[j++];
			}
		}
		
		while(i < left) {
			array[k++] = leftArray[i++];
		}
		
		while(j < right) {
			array[k++] = rightArray[j++];
		}
		
		//System.out.println("Merged Array: "+Arrays.toString(array));
	}
}
