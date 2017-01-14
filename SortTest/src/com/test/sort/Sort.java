package com.test.sort;

public class Sort {

	private static int[] nums = { 10, 8, 4, -1, 2, 6, 7, 3 };

	public static void main(String[] args) {
		// new Bubble().bubbleSort(nums);
		// new Heap().heapSort(nums);
		// new Insert().insertSort(nums);
		// new Merge().MergeSort(nums);
		// new Quick().quickSort(nums);
		// new Select().selectSort(nums);
		new Shell().shellSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}

}
