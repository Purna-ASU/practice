package com.apex.practise;

import java.util.Stack;

public class BalanceBrackets {

	public static void main(String[] args) {

		String str = "{}[]";
		if(balanceBrakets2(str))
			System.out.println(str + "  is balanced");
		else

			System.out.println(str + "  is not balanced");
	}

	private static boolean balanceBrakets(String str) {
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == '{'|| ch == '['|| ch =='(')
			{
				st.push(ch);
			}
			else if (ch == '}'|| ch == ']'|| ch ==')') 
			{
				if(st.isEmpty())
				{
					return false;
				}
				char popedChar = st.pop();
				System.out.println("closed character : " + ch);
				System.out.println("popped char : " + popedChar);
				
				if(ch=='}' && popedChar!='{') {
					//System.out.println(" not balanced");
					return false;
				}
				else if(ch==']' && popedChar!='[' ) {
					return false;
				}
				else if(ch==')' && popedChar!='(' ) {
					return false;
				}
			}
			
				
		}
		System.out.println(st.isEmpty());
		
		return st.isEmpty();
	}
	
	public void dummy()
	{
		
	}
private static boolean balanceBrakets2(String str) {
		
		Stack<Character> st = new Stack<Character>();
		
		for(char ch :str.toCharArray())
		{
			
			if(ch == '{'|| ch == '['|| ch =='(')
			{
				st.push(ch);
			}
			else if (ch == '}'|| ch == ']'|| ch ==')') 
			{
				if(st.isEmpty())
				{
					return false;
				}
				char popedChar = st.pop();
				System.out.println("closed character : " + ch);
				System.out.println("popped char : " + popedChar);
				
				if(ch=='}' && popedChar!='{') {
					//System.out.println(" not balanced");
					return false;
				}
				else if(ch==']' && popedChar!='[' ) {
					return false;
				}
				else if(ch==')' && popedChar!='(' ) {
					return false;
				}
			}
			
				
		}
		System.out.println(st.isEmpty());
		
		return st.isEmpty();
	}
	
	

			}



				

				

