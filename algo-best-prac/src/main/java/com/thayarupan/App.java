package com.thayarupan;

import java.util.Arrays;

import com.thayarupan.algo.BubbleSortAlgo;
import com.thayarupan.algo.BucketSortAlgo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int[] input = { 80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50 };
    	BucketSortAlgo.bucketSort(input);
    	
    	System.out.println(Arrays.toString(input));
    }
}
