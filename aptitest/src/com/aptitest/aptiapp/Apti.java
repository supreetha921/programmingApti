package com.aptitest.aptiapp;
import java.util.*;

import java.util.Arrays;

public class Apti {
	
	int Binarysearch(int numbers[],int number) {
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
			
		}
		boolean found=false;
		int mid=(numbers.length)/2;
		int start=0;
		int end=numbers.length;
		
		while(start<end) {
			mid=start+end/2;
			if(number == numbers[mid]) {
				
				found = true;
				break;
			}else if(number<numbers[mid]) {
				end=mid;
				
			}else {
				start = mid+1;
			}
		}
		
		return 0;
		
	}
	

	 public void bubbleSort(int arr[]) {
		   
			   for(int i=0;i<arr.length-1;i++) {
				   if(arr[i]>arr[i+1]) {
					   int temp=arr[i];
					   arr[i]=arr[i+1];
					   arr[i+1]=temp;
				   }
				  
	

}
	 }
	  boolean PrimeNumbers(int num) {
			int temp = 0;
			for (int i = 2; i <=num-1 ;i++) {
				if(num%i==0) {
				temp= temp+1;
				}
			}
				if(temp==0){
					
	System.out.println(num+ "prime number");
				}
				PrimeNumbers(num);
				return false;
				
			
				
			}


void StarPattern(int row){
	int temp=1;
	
	while(temp%2!=0) {
	for(int r=1;r<=row;r++){
		for(int c=1;c<=row;c++) {
			if(c<=r||r+c>=row+1||c==1&&c!=r){
			   System.out.print(temp+"\t");
			   temp++;
				
			}else 
				System.out.print("\t");
				
		}
		
	
		System.out.println();
		
	}
	}
}
	  void PatternOne(int row){
		  int temp=1;
			
			for(int r = 1;r <= row;  r++){
			 for(int c = 1;c<= row;  c++) {
				
		         if(r+c>=(row+1)&&c<=r) {
			
					System.out.print(""+temp+"\t");
					 temp++;
		         }
		        
			     else {
			         System.out.print("\t");
		         temp++;
			 }
			 }
					
					System.out.println();
				}
			
			}
}







	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
