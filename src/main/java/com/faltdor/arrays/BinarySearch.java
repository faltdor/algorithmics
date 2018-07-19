package com.faltdor.arrays;

/**
 * Description
 *	Given a sorted array of integers, return the index of the given key. Return -1 if not found.
 *
 */

public class BinarySearch {
	
	private static int binarySearchRecursive(int [] elements, int keyToFind, int lowIndex , int highIndex) {
		if(lowIndex > highIndex) {
			return -1;
		}
		//Calculate the mid index.
		int midIndex = lowIndex + ((highIndex - lowIndex) /2);
		//If element at the mid index is the key, return mid.
		if(elements[midIndex] == keyToFind) {
			return midIndex;
		}else if(keyToFind < elements[midIndex]) {
			/*If element at mid is greater than the key, then reduce the array size such that high 
			becomes mid - 1. Index at low remains the same.*/
			return binarySearchRecursive(elements, keyToFind, lowIndex, midIndex -1);
		}else {
			/*If element at mid is less than the key, then reduce the array size such that low becomes mid + 1. 
			 * Index at high remains the same.*/
			return binarySearchRecursive(elements, keyToFind, midIndex +1, highIndex);
		}
	}
	
	public static int binarySearch(int [] elements, int keyToFind) {
		return binarySearchRecursive(elements, keyToFind, 0, elements.length -1);
	}
	
	
	public static int binarySearchIterative(int [] elements, int keyToFind) {
		int lowIndex = 0;
	    int highIndex = elements.length -1;

	    while (lowIndex <= highIndex) {

	      int mid = lowIndex + ((highIndex - lowIndex) / 2);

	      if (elements[mid] == keyToFind) {
	        return mid;
	      }

	      if (keyToFind < elements[mid]) {
	        highIndex = mid - 1;
	      }
	      else {
	        lowIndex = mid + 1;
	      }
	    }

	    return -1;
	}
}
