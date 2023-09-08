package com.apex.practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Countletters {

	public static void main(String[] args) {
		
		
		countLetters("Hello");

	}
	
	public static void countLetters(String str){
		
		Map<Character ,Integer> letters = new LinkedHashMap<>();
		
		for(int i = 0; i<str.length();i++) {
			
			Character ch = str.charAt(i);
			
			if(letters.containsKey(ch))
			{
				int count = letters.get(ch);
				letters.put(ch, count+1);
				
			}
			else
			{
				letters.put(ch, 1);
			}
			
			
			
		}
		System.out.println(letters);
		
//		for( Map.Entry<Character, Integer> letterCount  : letters.entrySet()) {
//			
//			System.out.println(letterCount.getKey()+ " : " + letterCount.getValue());
//			
//		}
		
		
		
	}

}
