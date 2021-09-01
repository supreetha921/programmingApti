package com.linearsearch.linearsearchapp;

public class LinearSearch {
	public static void main(String []a) {
		int numbers[]= {2,4,1,9};
		int num=9;
		String S[]= {"supreetha","Anitha"};
		String value="Anitha";
		LinearSearch.linear(numbers,num);
		LinearSearch.linears(S,value);
	
	}
	static void linear(int numbers[],int num) {
		boolean found=false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]==num) {
				found=true;
				System.out.println("Number found At index"+i);
				break;
			}
			else
				System.out.println("Number not found at index"+i);
				
		}
	}
		
	
	static void linears(String S[],String value) {
		boolean found=false;
		for (int j = 0; j < S.length; j++) {
			if (S[j]==value) {
				found=true;
				System.out.println("String found At index"+j);
				break;
			}
			else
				System.out.println("String not found at index"+j);
				
		}
	}
	
	
}
