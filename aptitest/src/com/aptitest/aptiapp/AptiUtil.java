package com.aptitest.aptiapp;

import java.util.*;

public class AptiUtil {
	public static void main(String[] args) {
		Apti apti = new Apti();
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		
		apti.StarPattern(row);
		int numbers[]={12,43,126,34,25,64,43,11,1,45,87,78,56,3};
		int number=64;
		int arr[] ={12,43,126,34,25,64,43,11,1,45,87,78,56,3};
		
	apti.PrimeNumbers(7);
		
		apti.Binarysearch(numbers, number);
		apti.bubbleSort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		apti.PatternOne(row);
	}
	

}
