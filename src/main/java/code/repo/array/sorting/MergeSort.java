package code.repo.array.sorting;

import java.util.Random;

public class MergeSort {

	public static Integer[] crunchifyArray = new Integer[10];;
	public static int iteration = 1;

	// Divide and Merge
	public static void crunchifyMergeSort(Integer[] crunchifyArray) {
		Integer[] tempArray = new Integer[crunchifyArray.length];

		// recursively perform merge sort
		crunchifyMergeSort(crunchifyArray, tempArray, 0, crunchifyArray.length - 1);

	}

	// Idea is simple:
	// First divide whole array into 2 part
	// Divide each array into another 2 part
	// Once it reaches to only 1 elements in each side tree, just sort it
	// Merge backward the same way to get complete sorted array
	private static void crunchifyMergeSort(Integer[] crunchifyArray, Integer[] tempArray, int myLeft, int myRight) {

		if (myLeft < myRight) {
			int center = (myLeft + myRight) / 2;
			crunchifyMergeSort(crunchifyArray, tempArray, myLeft, center);
			crunchifyMergeSort(crunchifyArray, tempArray, center + 1, myRight);
			crunchifyMerge(crunchifyArray, tempArray, myLeft, center + 1, myRight);
		}
	}

	// Merge Sort Algorithm
	private static void crunchifyMerge(Integer[] crunchifyArray, Integer[] tempArray, int left, int myRight,
			int rightMost) {
		int leftEnd = myRight - 1;
		int k = left;
		int num = rightMost - left + 1;

		while (left <= leftEnd && myRight <= rightMost)
			if (crunchifyArray[left].compareTo(crunchifyArray[myRight]) <= 0)
				tempArray[k++] = crunchifyArray[left++];
			else
				tempArray[k++] = crunchifyArray[myRight++];

		while (left <= leftEnd)
			tempArray[k++] = crunchifyArray[left++];

		while (myRight <= rightMost)
			tempArray[k++] = crunchifyArray[myRight++];

		for (int i = 0; i < num; i++, rightMost--)
			crunchifyArray[rightMost] = tempArray[rightMost];

		System.out.print("Iteration # " + iteration + " ===> ");
		crunchifyPrint();
		iteration++;

	}

	// Get Random Integer in Java
	public static Integer getRandomIntegers() {

		Random crunchifyRandom = new Random();
		int myNumber = crunchifyRandom.nextInt(150);
		return myNumber;
	}

	// Simply Print Arrays
	public static void crunchifyPrint() {
		for (int n : crunchifyArray) {
			System.out.print(" " + n + "  ");
		}
		System.out.print("\n");
	}

	// Main Method
	public static void main(String[] args) {

		for (int i = 0; i < crunchifyArray.length; i++) {
			crunchifyArray[i] = getRandomIntegers();
		}

		System.out.print("Here is our initial array: ");
		crunchifyPrint();
		System.out.println();

		// Perform actual sorting
		crunchifyMergeSort(crunchifyArray);

		System.out.println();
		System.out.print("Here is an array after Merge Sort: ");
		crunchifyPrint();
	}
	
	
}
