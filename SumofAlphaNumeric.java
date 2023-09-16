package com.apex.practise;

public class SumofAlphaNumeric {

	public static void main(String[] args) {
		String str = "As17dhfj578";
		String strNum = str.replaceAll("[^0-9]", "");
		System.out.println(strNum);
		int sum =0;
		for(int i =0;i<strNum.length();i++)
		{
			int digitValue  = Character.getNumericValue(strNum.charAt(i));
			sum+= digitValue;
			
		}
		System.out.println(sum);

	}
	
	
	}


