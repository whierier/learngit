package com.test.sort;

public class Quick {
	// 快速排序
	public void quickSort(int[] arr) {
		splitArray(arr, 0, arr.length - 1);
	}

	private void splitArray(int[] arr, int begin, int end) {
		if (begin >= end) {
			return;
		}

		int front = begin, back = end, temp = arr[begin];
		while (front != back) {
			while (back > front) {
				if (arr[back] > temp) {
					back--;
				} else {
					arr[front] = arr[back];
					break;
				}
			}
			while (front < back) {
				if (arr[front] < temp) {
					front++;
				} else {
					arr[back] = arr[front];
					break;
				}
			}
		}
		arr[front] = temp;
		splitArray(arr, begin, front - 1);
		splitArray(arr, front + 1, end);
	}

}
