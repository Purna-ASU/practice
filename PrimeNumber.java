package com.apex.practise;

public class PrimeNumber {

	public static void main(String[] args) {
	
System.out.println(isPrime(6));
	}
	public static boolean isPrime(int n) {
		
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		
		return true;
		
	}

}
