package com.app;

public class CountOFString {
	public static void main(String[] args) {
		String s="it is the best Student";
		int count =1;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)==' ') &&(s.charAt(i+1)!=' ')  )
			{
				
				count++;
				
			}System.out.print(s.charAt(i));
		}
		System.out.println(" ");
		System.out.println(count);
	}

}
