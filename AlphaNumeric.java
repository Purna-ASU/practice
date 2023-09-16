package com.apex.practise;

public class AlphaNumeric {
	public static void main(String[] args) {
		convert("a3b1d2");
	}


public static String convert(String str) {
	
	StringBuilder bs = new StringBuilder();
	
	for(int i =0;i< str.length();i++) {
		char curChar = str.charAt(i);
		if(Character.isLetter(curChar)) {
			int count = Character.getNumericValue(str.charAt( i+1));
			
			for(int j =0;j<count;j++) {
				bs.append(curChar);
			}
			i++;
		}
	
	}
	
	
	System.out.println(bs.toString());
	
	return bs.toString();
	
	
}
}
