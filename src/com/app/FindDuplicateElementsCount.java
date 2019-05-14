package com.app;

public class FindDuplicateElementsCount {
	public static void main(String[] args) {
		String s="sdsdjoihiufgdgdgioggigg";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					
					count++;
				}
			}
			System.out.println(s.charAt(i)+" "+count);

		}
		
	}

}
