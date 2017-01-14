package com.test.sort;

public class Select {

	// 选择排序
	public void selectSort(int[] arr) {

		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int min = arr[i];
			int minIndex = i;
			for (int j = i+1; j <len; j++) {
				if(min>arr[j]){
					min = arr[j];
					minIndex = j;
				}
			}
			arr[minIndex]=arr[i];
			arr[i] = min;
		}

	}
}
