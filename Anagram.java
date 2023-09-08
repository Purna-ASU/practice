package com.apex.practise;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str = "abc";
		String str1 = "bca";
		System.out.println(anagram(str,str1));
//		if (anagram(str,str1))
//				System.out.println("given strings are anagram");
//		else 
//			System.out.println("given strings are not anagram");
		
	}
	
	public static  boolean anagram(String str ,String str1) {
		
		char[] arr1 = str.toCharArray();
		 char arr2[]  = str1.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 
		 
		if(Arrays.equals(arr1, arr2)) 
			System.out.println("given strings are anagram");
		else 
			System.out.println("given strings are not anagram");
		 
		
		return Arrays.equals(arr1, arr2);
		
		
	}
	

}
