package com.test.sort;

public class Insert {

	// 插入排序
	public void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > temp) {
					arr[j] = arr[j - 1];
					arr[j-1] = temp;
				}
			}
		}
	}
}
