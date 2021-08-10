package com.apti.aptiapp;
import java.util.Scanner;

public class NumberExample {
	
	public static void main(String []args) {
		
		
		NumberExample number=new NumberExample();
		number.printNumber();
	}
     
	 public void printNumber() {
		 Scanner se=new Scanner(System.in);
		 int num=se.nextInt();
	
		 int i,sum=0;
		 
		for(i=1;i<=num;i++) {
		
			
				
			 /* sum=sum+i;*/
			  sum=sum+(2*i-1);
			
				
			  
				
				
			
		}
			System.out.println(sum);
		}
}
		
	

