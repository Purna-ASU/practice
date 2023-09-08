package com.apex.practise;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		
		ReverseWords rw = new ReverseWords();
		String sc = "welcome to java ";
		System.out.println(rw.revWords(sc));
		

	}
	
	public String revWords(String str) {
	    StringBuilder reversedWords = new StringBuilder();

	    // split input string by " " space to get each word as String[]
	    String[] words = str.split(" ");
	    System.out.println(Arrays.toString(words));

	    // loop over the array from back
	    for(int i = words.length - 1; i >= 0; i--) {
	      // add words to reversedWords with space
	      reversedWords.append(words[i] + " ");
	    }

	    // trim needed to remove last space in the end
	    return reversedWords.toString().trim();
	  }

}
