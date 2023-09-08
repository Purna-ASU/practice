package com.apex.practise;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer number : ");
		int i = sc.nextInt();
		evenOdd(i);
//		if(isEven(i))
//		{
//			System.out.println(i + " :  is even ");
//		}
//		else 
//		{
//			System.out.println(i + " :  is odd ");
//		}
	}
	public static boolean isEven(int i ) {

		if(i%2 == 0)

			return true;
		else
			return false;

	}
	
	public static  void evenOdd(int i )
	{
		if(i%2 == 0)
		{
			System.out.println(i + "  is even ");
		}
		else 
		{
			System.out.println(i + "   is odd ");
		
		}
	}

}
