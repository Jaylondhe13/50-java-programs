package com.jsl.programs;

public class FibonacciUsingRecursion {
	 

	
	private static int fibSeries(int num) {
		
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		
		return fibSeries(num-2)+fibSeries(num-1);
	}

	public static void main(String[] args) {
		
		for(int i=0;i<6;i++)
		System.out.print(fibSeries(i));
		
		
		

	}

	

}


