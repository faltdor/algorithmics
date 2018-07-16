package com.faltdor.arrays;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testBinarySearch() {
		int[] elements = {1,2,4,7,8,12,15,19,24,50,69,80,100};
	    System.out.println("Key(12) found at: "+ BinarySearch.binarySearch(elements,12));
	    System.out.println("Key(44) found at: "+ BinarySearch.binarySearch(elements,44));
	    System.out.println("Key(80) found at: "+ BinarySearch.binarySearch(elements,80));
	}

}
