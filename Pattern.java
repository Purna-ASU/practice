package com.apex.practise;

public class Pattern {

	public class NumPattern {

		 public static void main(String[] args) {
		  int max=4;
		  
		  // First four lines
		  for(int i=1; i <= max;i++) {
		   printBlanks(max, i);
		   printNums(i);
		   System.out.println();
		   
		  }
		  // last 3 lines
		  for(int i=max-1; i >=1 ;i--) {
		   printBlanks(max, i);
		   printNums(i);
		   System.out.println();
		   
		  }

		 }

		 private static void printNums(int i) {
		  for(int nums=i;nums>=1;nums--)
		       System.out.print(nums);
		  for(int nums=2;nums<=i;nums++)
		       System.out.print(nums);
		 }
		 
		 
		 private static void printBlanks(int max, int i) {
		  for(int blank= max-i;blank >=1;blank--)
		   System.out.print(" ");
		 
		 }

		}
}



