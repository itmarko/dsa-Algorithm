package com.marko.searching.algo;

public class BinarySearch {

	int BinarySearchRecursive(int arr[], int low, int high, int key) {
				
		 if (high >= low){
				int mid = low+(high-low)/2;

				if(arr[mid]==key) {
					return mid;
				}
				
				else if(arr[mid]<key) {
					return BinarySearchRecursive(arr,mid+1,high, key);
				}else {
					return BinarySearchRecursive(arr,low,mid-1, key);
				}
		 }
		 return -1;
	}
	public static void main(String[] args) {
		BinarySearch ob =new BinarySearch();
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int key = 6;
		int result = ob.BinarySearchRecursive(arr, 0,arr.length-1,key);
		if(result == -1) {
			System.out.println("Element is not Present in this array");
		}else {
			System.out.println("Element is present at index " +result);
		}
	}
}
