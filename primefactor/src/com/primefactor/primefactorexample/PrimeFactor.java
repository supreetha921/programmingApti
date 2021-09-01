package com.primefactor.primefactorexample;

public class PrimeFactor {
	public static void main(String []a) {
		printPrimeFactor(21);
		
	}
    static void printPrimeFactor(int num) {
    	for (int i = 2; i <num; i++) {
    		while(num%i==0) {
    			num=num/i;
    			System.out.println(i);
    		}
			
		}
    	if(num>1)
    	System.out.println(num);
    	
    }
}
