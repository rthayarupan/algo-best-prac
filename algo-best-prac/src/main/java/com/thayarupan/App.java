package com.thayarupan;

import java.util.Arrays;

import com.thayarupan.algo.BubbleSortAlgo;
import com.thayarupan.algo.BucketSortAlgo;
import com.thayarupan.algo.InsertionSortAlgo;
import com.thayarupan.algo.MergeSortAlgo;
import com.thayarupan.algo.SelectionSortAlgo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int[] input = { 80, 50, 30, 10, 90, 60, 0, 70, 40, 20, 50 };
    	MergeSortAlgo.mergeSort(input);
    	
    	System.out.println(Arrays.toString(input));
    }
}
