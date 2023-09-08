package com.apex.practise;

public class DemoProgram {

	public static void main(String[] args) {
		
	DemoProgram dp = new DemoProgram();
	String strRev	= dp.reverseStr("madame");
	System.out.println(strRev);
		
//		String str = "123456";
//		StringBuilder reverse = new StringBuilder();
//
//	    // iterate over input string from the back with charAt
//	    for(int i = str.length() - 1; i >= 0; i--) {
//	      // add chars to reversed variable
//	      reverse.append(str.charAt(i));
//	      System.out.println(reverse.toString());
//	    }
//	    System.out.println(reverse.toString());
	
	

	}
	
	public String reverseStr(String str) {
	    // create variable to store reversed version of str
	    StringBuilder reverse = new StringBuilder();

	    // iterate over input string from the back with charAt
	    for(int i = str.length() - 1; i >= 0; i--) {
	      // add chars to reversed variable
	      reverse.append(String.valueOf(str.charAt(i)));
	    }
if (str.equals(reverse.toString())) {
	System.out.println("string is palindrome");
}
else 
{
	System.out.println("string is not palindrome");
}
	    // convert to string and return reversed version 
	    return reverse.toString();
	  }

}
