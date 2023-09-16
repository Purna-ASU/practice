package com.apex.practise;

import java.util.HashMap;
import java.util.Map;

public class DupWords {
	public static void main(String[] args) {
		String str = "This is a program to find duplicate words in a string, again! a program";
		String cleanedStr = str.replaceAll("[^a-zA-Z]", " ").toLowerCase();
		System.out.println(cleanedStr);
		String words[] = cleanedStr.split(" ");
		Map<String,Integer> answer = new HashMap<String,Integer>();

		for(int i =0;i<words.length;i++)
		{
			String word = words[i];
			if(answer.containsKey(word)) {
				int wordcount = answer.get(word);
				answer.put(word,wordcount+1);
			}
			else {
			answer.put(word, 1);
			//System.out.println(answer);
			}
		
		}

		for(int i = 0;i<words.length;i++)
		{
			String word = words[i];
			if(answer.get(word)>1) {
				System.out.println("word is " + word + "repeated  " + answer.get(word) + " times");


				answer.put(word, 0);
			}
		}
		



	}

}
