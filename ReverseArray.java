package com.apex.practise;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		ReverseArray revArray = new ReverseArray() ;
		int arrA[] = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arrA));
		revArray.revArr2(arrA);
		
	}
	
	public void revArr(int[] arrNum) {
	    // we will use two 'pointers'. One pointer will start from the beginning
	    // another one from the back and we will swap their values

	    // pointer that will start from the back
	    int j = arrNum.length - 1;

	    // our loop will go till half of our input array
	    // 'i' is a pointer that will start from the beginning
	    for(int i = 0; i < arrNum.length / 2; i++) {
	      // swap elements using positions of i and (j - i)
	      int tmp = arrNum[i];
	      arrNum[i] = arrNum[j - i];
	      arrNum[j - i] = tmp;
	      System.out.println(Arrays.toString(arrNum));
		    
	    }
	    System.out.println(Arrays.toString(arrNum));
	    
	    
	  }
	
	public void revArr2(int[] arrNum) {
		int length = arrNum.length ;
		int arRev[] = new int[length] ;
	int j = 0;	
	for(int i = length-1;i>= 0;i--) {
		arRev[j] = arrNum[i];
		j++;
		System.out.println(Arrays.toString(arRev));
	}
	System.out.println(Arrays.toString(arRev));
	}

}
