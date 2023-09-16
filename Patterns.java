package com.apex.practise;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern(4);
	}

	public static void pattern(int n) {
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k = i ;k>=1;k--) {
				System.out.print("*");
			}
			for(int l = 2;l<=i ;l++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i =n-1;i>=1;i--) {
			for(int j = 1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k = i ;k>=1;k--) {
				System.out.print("*");
			}
			for(int l = 2;l<=i ;l++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

		
}
}
