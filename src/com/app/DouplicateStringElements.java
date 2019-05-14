package com.app;

public class DouplicateStringElements {

	public static void main(String[] args) {
		String a="kotikoti";
		int count=0;
		char[] s=a.toCharArray();
		
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				if(s[i]==s[j])
				{
					
					System.out.println(" duplicate elements:"+s[j]);
					count++;
					break;
				}
				
			}
		}
		
		System.out.print("\n");
		System.out.println("it is the duplicate:"+count);
		
		
		
	}

}
