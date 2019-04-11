package com.thayarupan.algo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchAlgoTest {
	private int[] array = null;

	@Before
	public void init() {
		array = new int[] { 2, 3, 4, 6, 7, 9 };
	}
	
	@After
	public void destroy() {
		array = null;
	}	
	
	@Test
	public void testRecursive() {
		assertEquals(-1, BinarySearchAlgo.getElementIndexRecursive(array, 0));
		assertEquals(-1, BinarySearchAlgo.getElementIndexRecursive(array, 1));
		assertEquals(-1, BinarySearchAlgo.getElementIndexRecursive(array, -10));
		assertEquals(-1, BinarySearchAlgo.getElementIndexRecursive(array, 10));
		assertEquals(-1, BinarySearchAlgo.getElementIndexRecursive(array, 11));
		assertEquals(-1, BinarySearchAlgo.getElementIndexRecursive(array, 21));

		assertEquals(0, BinarySearchAlgo.getElementIndexRecursive(array, 2));
		assertEquals(1, BinarySearchAlgo.getElementIndexRecursive(array, 3));
		assertEquals(4, BinarySearchAlgo.getElementIndexRecursive(array, 7));
		assertEquals(5, BinarySearchAlgo.getElementIndexRecursive(array, 9));
	}
	
	@Test
	public void testLoop() {
		assertEquals(-1, BinarySearchAlgo.getElementIndexLoop(array, 0));
		assertEquals(-1, BinarySearchAlgo.getElementIndexLoop(array, 1));
		assertEquals(-1, BinarySearchAlgo.getElementIndexLoop(array, -10));
		assertEquals(-1, BinarySearchAlgo.getElementIndexLoop(array, 10));
		assertEquals(-1, BinarySearchAlgo.getElementIndexLoop(array, 11));
		assertEquals(-1, BinarySearchAlgo.getElementIndexLoop(array, 21));

		assertEquals(0, BinarySearchAlgo.getElementIndexLoop(array, 2));
		assertEquals(1, BinarySearchAlgo.getElementIndexLoop(array, 3));
		assertEquals(4, BinarySearchAlgo.getElementIndexLoop(array, 7));
		assertEquals(5, BinarySearchAlgo.getElementIndexLoop(array, 9));
	}

}
