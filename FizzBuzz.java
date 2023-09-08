package com.apex.practise;

public class FizzBuzz {

	public static void main(String[] args) {

		for(int i = 1 ; i <=100;i++) {

			if(i%3 ==0 && i%5 ==0) 
			{
				System.out.println(i + "is FizzBuzz");
			}
			else if(i%5 == 0){
				System.out.println(i + "is Buzz");
			}

			else if(i%3 ==0 ) {
				System.out.println(i + "is Fizz");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
