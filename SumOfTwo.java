package com.apex.practise;

import java.util.Arrays;
import java.util.List;

public class SumOfTwo {

	public static void main(String[] args) {
		int A[] = {2,4,5,8};
		sumInArray(9, A);
		sumInArray(4,new int[]{1, 2, 3, 5}); // [1, 3]
	}

	public static void sumInArray(int sum ,int arr[])//{2,4,5,8},sum =9
	{
		outer: for(int i = 0;i<arr.length;i++)

		{
			System.out.println("outter");

			for(int j = i+1; j<arr.length;j++) {
				System.out.println("inner");

				if(arr[i]+arr[j] == sum ) {
					System.out.println(arr[i] + "," + arr[j]);
					break outer;

				}

			}

		}
	}
	
	

}
