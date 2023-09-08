package com.apex.practise;

public class MaxMinArr {

	public static void main(String[] args) {
		int arr[] = {1,4 , 8,10};
		
		System.out.println(new MaxMinArr().max(arr));
		System.out.println(new MaxMinArr().min(arr));
		

	}
	public int max(int[] arrNum) {
	    // assume first element of array is biggest number
	    int max = arrNum[0];

	    // loop over the array and test our above assumption
	    for(int i = 0; i < arrNum.length; i++) {
	      // if max was not the biggest number, update it
	      if(max < arrNum[i]) {
	        max = arrNum[i];
	      }
	    }

	    // after the loop max variable will hold the biggest number
	    return max;                  
	  }
	
	public int min(int[] arrNum) {
	    // assume first element of array is the smallest number
	    int min = arrNum[0];

	    // loop over the array and test assumption
	    for(int i = 0; i < arrNum.length; i++) {
	      // if min was not smallest, update it
	      if(min > arrNum[i]) {
	        min = arrNum[i];
	      }
	    }

	    return min;
	  }

}
