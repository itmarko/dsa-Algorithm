package com.marko.searching.algo;

public class LinearSearch {
	
	public static int Search(int arr[],int key , int size){
				for(int i =0; i<size; i++) {
					if(key==arr[i]) {
						return i;
					}
				}
				return -1;
	}
//				int Search(int arr[],int key , int size){
//					for(int i =0; i<size; i++) {
//						if(key==arr[i]) {
//							return i;
//						}
//					}
//					return -1;
//			}
	public static void main(String[] args) {
//		LinearSearch ob = new LinearSearch();
		int arr[] = {10,20,45,75,86,45,16};
		int key = 99;
//		int result = ob.Search(arr, key, arr.length);
		int result = Search(arr, key, arr.length);
		 
		if(result ==-1) {
			System.out.println("Element is not present in this array" );
		}
		else {
			System.out.println("Element is present at index "+result);
		}
	}
}
