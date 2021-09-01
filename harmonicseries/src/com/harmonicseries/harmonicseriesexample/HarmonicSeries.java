package com.harmonicseries.harmonicseriesexample;

public class HarmonicSeries {
	public static void main(String[] a) {
		printHarmonicSeries(10);
	}
	static void printHarmonicSeries(int num) {
		double sum=0.0;
		for (int i = 1; i <=num; i++) {
		
			sum=sum+(double)1/i;
			System.out.println(sum+"\t"+i);
			
		}
		System.out.println(sum);
	}

}
