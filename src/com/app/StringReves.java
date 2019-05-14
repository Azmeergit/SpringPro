package com.app;

public class StringReves {
	public static void main(String[] args) {
		String res="koti is the best";
		//res.trim();
		String ress=" ";
		for(int i=res.length()-1;i>=0;i--)
		{
			
			System.out.print(res.charAt(i));
		}
	}

}
