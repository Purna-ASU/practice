package com.apex.practise;

import java.util.Arrays;

public class SortAraay {

	public static void main(String[] args) {
		bubbleSort(new int[] { 5,6,1,4,3});

	}
	
	public static void bubbleSort(int ar[])// { 5,6,1,4,3} = {1,3,4,5,6}
	{
		int swapcount = -1;
		while (swapcount != 0)
			
		{
			swapcount =0;
			for(int i = 0; i < ar.length-1;i++)
			{
						
			if(ar[i]>ar[i+1])
			{

				int temp = ar[i] ;
				ar[i] = ar[i+1];
				ar[i+1] = temp;
				swapcount++;
				
			}
			System.out.println(Arrays.toString(ar));
			
			}
			System.out.println();
			
			
		}
	}
	
	public static void sSort(int[] arr) {
        // loop over each element of array
        for (int i = 0; i < arr.length; i++) {
            int mIndex = i;
            int min = arr[i];

            // find smallest index
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    mIndex = j;
                }
            }

            // swap the values of i and smallest element.
            int tmp = arr[i];
            arr[i] = arr[mIndex];
            arr[mIndex] = tmp;
        }
    }



}
