package grokking.sorting.tests;

import static org.testng.Assert.assertEquals;

import java.util.Queue;

import org.testng.annotations.Test;

import grokking.sorting.*;

public class SortingTests {

	Integer[] arrayToSort, arrayResult;
	static Queue<Integer> queueToSort;

	// static Queue<Integer> queueResult = addArrayToQueue(arrayResult);

	@Test(description = "Veryfy BubbleSort" , groups = "Positive")
	public static void bubbleSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		BubbleSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Optimised Bubble Sort", groups = "Positive")
	public static void bubbleSortOptimisedTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		BubbleSortOptimised.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Bucket Sort", groups = "Positive")
	public static void bucketSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		BucketSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify comb Sort", groups = "Positive")
	public static void combSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		CombSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Cocktail Sort", groups = "Positive")
	public static void cocktailSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		CocktailSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Counting Sort", groups = "Positive")
	public static void countingSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		CountingSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Gnome Sort", groups = "Positive")
	public static void gnomeSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		GnomeSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Heap Sort", groups = "Positive")
	public static void heapSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		HeapSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Insertion Sort", groups = "Positive")
	public static void insertionSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		InsertionSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Merge Sort", groups = "Positive")
	public static void mergeSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayExpected = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		Integer[] actualResult = MergeSort.sort(arrayToSort);
		assertEquals(actualResult, arrayExpected);
	}

	@Test(description = "Verify Bottom Up Merge Sort", groups = "Positive")
	public static void mergeSortBottomUpTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		MergeSortBottomUp.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Merge Sort Natural", groups = "Positive")
	public static void mergeSortNaturalTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };

		Integer[] arrayExpected = { 24, 18, 13, 9, 7, 6, 5, 4, 2, 1 };

		Queue<Integer> queueToSort, expectedQ, actualQ;
		queueToSort = HelperFunctions.addArrayToQueue(arrayToSort);

		actualQ = MergeSortNatural.sort(queueToSort);

		expectedQ = HelperFunctions.addArrayToQueue(arrayExpected);
		assertEquals(expectedQ, actualQ);
	}

	@Test(description = "Verify Od Even Sort", groups = "Positive")
	public static void oddEvenSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		OddEvenSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Quick Sort", groups = "Positive")
	public static void quicksortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		QuickSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Radix Sort", groups = "Positive")
	public static void radixsortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		RadixSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

	@Test(description = "Verify Selection Sort", groups = "Positive")
	public static void selectionSortTest() {
		Integer[] arrayToSort = { 13, 4, 2, 6, 5, 7, 18, 1, 9, 24 };
		Integer[] arrayResult = { 1, 2, 4, 5, 6, 7, 9, 13, 18, 24 };
		SelectionSort.sort(arrayToSort);
		assertEquals(arrayToSort, arrayResult);
	}

}
