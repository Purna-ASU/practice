package com.apex.practise;

public class AplhaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(converted("a1b2c3"));
	}
	
	public static String converted(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ;i<str.length();i++) {
			char curChar = str.charAt(i);
			if(Character.isLetter(curChar)) {
				int count = Character.getNumericValue(str.charAt(i+1));
				
				for(int j =0;j<count;j++) {
					sb.append(curChar);
				}
			}
			
			
					
		}
		
		return sb.toString();
		
	}

}
