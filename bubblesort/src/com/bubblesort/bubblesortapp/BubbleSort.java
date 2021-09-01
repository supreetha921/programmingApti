package com.bubblesort.bubblesortapp;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {11,5,22,90,76};
		BubbleSort sort= new BubbleSort();
		
		sort.bubbleSort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
	
   public void bubbleSort(int arr[]) {
	   for(int j=0;j<arr.length;j++) {
		   for(int i=0;i<arr.length-1;i++) {
			   if(arr[i]>arr[i+1]) {
				   int temp=arr[i];
				   arr[i]=arr[i+1];
				   arr[i+1]=temp;
			   }
		   }
		   
	   }
   }
  
   
}
