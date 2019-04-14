package com.thayarupan.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSortAlgo {

	public static void bucketSort(int[] array) {

		int max= max(array);
		
		// We need to find better way
		List<Integer>[] bucket = new List[max+1];

		for(int i=0; i<bucket.length;i++) {
			bucket[i] = new ArrayList<>();
		}
		
		for(int i=0; i< array.length; i++) {
			bucket[hash(array[i], max+1)].add(array[i]);
		}
		
		for (List list : bucket) {
			Collections.sort(list);
			
		}
		
		int index = 0;
		for(int i=0; i<bucket.length;i++) {
			System.out.println(bucket[i]);
			 for (int list : bucket[i]) {
				 System.out.println(list);
				 System.out.println(index);
				 array[index++] = list;
			}
		}

	}

	public static int max(int[] input) {
		int max = input[0];
		for (int i : input) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	//TODO: How to select a efficient hash
	private static int hash(int i, int max) {
		return i%max;
	}

}
