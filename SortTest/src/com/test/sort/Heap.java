package com.test.sort;

public class Heap {

	// 堆排序
	public void heapSort(int[] arr) {
		initHeap(arr);
		int currentSize = arr.length-1;
		while(currentSize>0){
			int temp = arr[0];
			arr[0] = arr[currentSize];
			arr[currentSize] = temp;
			currentSize--;
			chooseMax(arr, 0, currentSize+1);
		}
	}
	
	private void chooseMax(int[] arr,int parent,int heapSize){
		if(heapSize<=0){
			return;
		}else{
			int l = 2*parent+1;
			int r = 2*parent+2;
			int max = parent;
			if(l<heapSize){
				max = arr[max]>arr[l]?max:l;
			}
			if(r<heapSize){
				max = arr[max]>arr[r]?max:r;
			}
			if(max!=parent){
				int temp = arr[parent];
				arr[parent] = arr[max];
				arr[max] = temp;
				chooseMax(arr,max,heapSize);
			}
		}
	}
	
	private void initHeap(int[] arr){
		int parent = (arr.length-1)/2;
		if(arr.length>1){
			while(parent>0){
				chooseMax(arr, parent, arr.length);
				parent--;
			}
		}
	}
	
	
}
