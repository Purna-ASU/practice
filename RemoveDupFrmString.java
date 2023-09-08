package com.apex.practise;

public class RemoveDupFrmString {

	public static void main(String[] args) {
		System.out.println(removeDup("APPLE"));

	}
	
	public static String removeDup(String str)
	{
		
		String noDupstr = "";
		for(int i = 0 ; i<str.length();i++) {
			char x =  str.charAt(i);
			if(!noDupstr.contains(String.valueOf(x))) {
				
				noDupstr = noDupstr+x;
				
			}
			
		}
		return noDupstr;
		
	}

}
