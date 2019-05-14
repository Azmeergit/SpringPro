package com.app;

public class StringPolydream {
	public static void main(String[] args) {
		String str="iti";
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--) {
		rev =rev+str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.println("it is the palindram");
		}
		else
		{
			System.out.println("it is note palindram");
		}
		
	}	

}
