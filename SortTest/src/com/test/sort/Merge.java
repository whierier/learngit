package com.test.sort;

public class Merge {

	// 归并排序
	public void MergeSort(int[] arr) {
		mergeArrays(arr);
	}

	private void mergeArrays(int[] arr) {
		if (arr.length <= 1) {
			return;
		}
		int count1 = 0, count2 = 0, count = 0;
		int arr1[] = new int[arr.length / 2], arr2[] = new int[arr.length
				- arr.length / 2];
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length / 2) {
				arr1[i] = arr[i];
			} else {
				arr2[i - arr.length / 2] = arr[i];
			}
		}
		mergeArrays(arr1);
		mergeArrays(arr2);
		while (count1 < arr1.length && count2 < arr2.length) {
			if (arr1[count1] < arr2[count2]) {
				arr[count++] = arr1[count1++];
			} else {
				arr[count++] = arr2[count2++];
			}
		}
		while (count1 < arr1.length) {
			arr[count++] = arr1[count1++];
		}
		while (count2 < arr2.length) {
			arr[count++] = arr2[count2++];
		}
	}
}
