package com.thayarupan.algo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortAlgoTest {
	private static int[] array = null;

	@Before
	public void init() {
		array = new int[] { 7, 3, 2, 4, 9, 6 };
		// 2, 3, 4, 6, 7, 9
	}

	@After
	public void destroy() {
		array = null;
	}

	@Test
	public void testRecursive() {
		System.out.println(Arrays.toString(array));
		BubbleSortAlgo.bubbleRecursive(array, array.length);
		System.out.println(Arrays.toString(array));
		assertNotNull(array);
		assertEquals(6, array.length);
		assertEquals(2, array[0]);
		assertEquals(3, array[1]);
		assertEquals(4, array[2]);
		assertEquals(6, array[3]);
		assertEquals(7, array[4]);
		assertEquals(9, array[5]);
	}

	@Test
	public void testLoop() {
		System.out.println(Arrays.toString(array));
		BubbleSortAlgo.bubbleLoop(array);
		System.out.println(Arrays.toString(array));
		assertNotNull(array);
		assertEquals(6, array.length);
		assertEquals(2, array[0]);
		assertEquals(3, array[1]);
		assertEquals(4, array[2]);
		assertEquals(6, array[3]);
		assertEquals(7, array[4]);
		assertEquals(9, array[5]);
	}

}
