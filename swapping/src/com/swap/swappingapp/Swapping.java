package com.swap.swappingapp;

public class Swapping {
	public static void main(String []args) {
		int a = 10;
		int b=20;
		swap(a,b);
	}
		
		
		
		
		static void swap(int a,int b) {
			int temp=a;//temp=10,a=10,b=20
			a=b;
			b=temp;
			
			System.out.println("value of a="+a);
			System.out.println("value of b="+b);
			
			
		}
	}


