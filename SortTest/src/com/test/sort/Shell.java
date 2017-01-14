package com.test.sort;

public class Shell {

	// 冒泡排序
	public void shellSort(int[] arr) {

		int gap = arr.length;
		while (gap / 2 > 0) {
			gap /= 2;
			for (int i = 0; i < gap; i++) {
				for (int j = i + gap; j < arr.length; j += gap) {
					int temp = arr[j];
					for (int k = j; k > i; k -= gap) {
						if (arr[k - gap] > temp) {
							arr[k] = arr[k - gap];
							arr[k - gap] = temp;
						}
					}
				}
			}
		}
	}
}
