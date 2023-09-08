package com.apex.practise;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num = 12321;
		NumberPalindrome np = new NumberPalindrome();
		boolean numpal = np.isPalNum(num);
		if (numpal)
			System.out.println("num is  palindrome");
		else
			System.out.println("num is not palindrome");

	}
	
	public boolean isPalNum(int num) {
	    // there are two most important things to remember
	    // to get most right number, we can do 'num % 10'
	    // to remove most right number, we can do 'num / 10'
	    // both will work for any numbers

	    int copyOfOriginal = num;
	    int reversedNumber = 0;
	    int remainder;

	    while(num > 0) {
	      // get most right number
	      remainder = num % 10;
	      System.out.println("Remainder:" + remainder);

	      // multiply by 10 to concat, not to add(plus)
	      reversedNumber = (reversedNumber * 10) + remainder;
	      System.out.println("ReversedNumber:" + reversedNumber );

	      // remove most right number from num. 
	      num = num / 10;
	      System.out.println("num:" + num ); 
	    }

	    // if reversed version and original are equal so it's palindrome
	    return reversedNumber == copyOfOriginal;
	  }

	  

}
