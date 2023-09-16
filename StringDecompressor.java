package com.apex.practise;

public class StringDecompressor {
    public static void main(String[] args) {
        String input = "a3b2c1d2";
        String decompressed = decompressString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + decompressed);
    }

    public static String decompressString(String input) {
		
    	
    	StringBuilder result = new StringBuilder();
    	int i =0;
    	int sum =0;
    	while(i<input.length())
    	{
    		char currentChar = input.charAt(i);
    		i++;
    		int count = 0;
    		while(i<input.length()&&Character.isDigit(input.charAt(i))) {
    			count = count*10 +Character.getNumericValue(input.charAt(i));
    			i++;
    			
    			
    		}
    		
    		for(int j = 0;j<count;j++)
    		{
    			result.append(currentChar);
    		}
    		
    	}
    	
    	
    	return result.toString();
	
    
}
}
