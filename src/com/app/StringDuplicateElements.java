package com.app;

import java.util.HashMap;

public class StringDuplicateElements {
	public static void main(String[] args) {
		
String s="hello World my name is koti";
HashMap<Character,Integer> a=new HashMap<Character,Integer>();
        char []aa= s.toCharArray();
        int count =0;
		for(char aaa:aa)
		{
		if(Character.isAlphabetic(aaa))
		{
			if(a.containsKey(aaa))
			{
				a.put(aaa,a.get(aaa)+1);
				count++;
			}else {
				a.put(aaa,1);
			}
		}
		
		}
	System.out.println(a);
	System.out.println(count);
	
	}

}
