package com.faltdor.arrays;

import org.junit.Test;

public class BinarySearchTest {
	
	int[] elements = {1,2,4,7,8,12,15,19,24,50,69,80,100};
	
	@Test
	public void testBinarySearch() {
		System.out.println("Binary Search Recursive");
	    System.out.println("Key(12) found at: "+ BinarySearch.binarySearch(elements,12));
	    System.out.println("Key(44) found at: "+ BinarySearch.binarySearch(elements,44));
	    System.out.println("Key(80) found at: "+ BinarySearch.binarySearch(elements,80));
	}
	
	@Test
	public void testBinarySearchInteractive() {
		System.out.println("Binary Search Interactive");
		System.out.println("Key(12) found at: "+ BinarySearch.binarySearchIterative(elements,12));
		System.out.println("Key(44) found at: "+ BinarySearch.binarySearchIterative(elements,44));
		System.out.println("Key(80) found at: "+ BinarySearch.binarySearchIterative(elements,80));
	}
}