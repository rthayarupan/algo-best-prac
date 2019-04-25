package com.thayarupan;

import java.util.Arrays;

import com.thayarupan.algo.BubbleSortAlgo;
import com.thayarupan.algo.BucketSortAlgo;
import com.thayarupan.algo.CountSortAlgo;
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
    	int[] input = { 0, 3, 2, 3, 3, 0, 5, 2, 3};
    	
    	System.out.println(Arrays.toString(input));
    	int[] output = CountSortAlgo.countSort(input);
    	System.out.println(Arrays.toString(output));
    }
}
