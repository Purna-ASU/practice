package com.apex.practise;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fibonacci(8)));
		System.out.println(Arrays.toString(fibonacci(0)));
		System.out.println(Arrays.toString(fibonacci(1)));
		System.out.println(Arrays.toString(fibonacci(2)));
		
		
		fib(0);  // 0 1 1
        fib(5);  // 0 1 1 2 3
        fib(6);  // 0 1 1 2 3 5
        fib(10); // 0 1 1 2 3 5 8 13 21 34

	}

	public static int[] fibonacci(int n ) {//n= 7 { 0,1,1,2,3,5,8}
		if(n<1) {
			return null ;
		}
		if(n==1) {
			return new int[] {0};
		}
		if (n==2)
		{
			return new int[] {0,1};
		}
		int a[] = new int [n];

		a[0] = 0;
		a[1] = 1;
		for(int i = 2;i< n ;i++)
		{
			a[i]= a[i-1] +a[i-2];
		}



		return a;
	}

		public static void fib(int n) {
	        int numOne = 0;
	        int numTwo = 1;

	        for (int i = 0; i < n; i++) {
	            System.out.print(numOne + " ");

	            int sum = numOne + numTwo;
	            numOne = numTwo;
	            numTwo = sum;
	        }
	        System.out.println();
	    


	}
}
