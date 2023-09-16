package com.apex.practise;

import java.util.Arrays;

public class SumOfLargestNum {

	public static void main(String[] args) {
		int a[] = {1,4,6,7}; //6+7+8+10
		System.out.println(sum(a));
	}
public static int sum(int[] arr)
{
  	Arrays.sort(arr);
  	int sum = 0;
  	int length = arr.length;
  	
  	for(int i = Math.max(0,length-4);i<length;i++) {
  		sum = sum+arr[i];
  		
  		
  	}
	
	return sum;
	
}
}
