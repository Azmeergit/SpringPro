package com.app;

public class DimandType {
	public static void main(String[] args) {
		int n=10;
		int scope=n-1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<scope;j++)
			{
				System.out.print(" ");
			}
	for(int k=0;k<=i;k++)
	{
		System.out.print("* ");
	}
	System.out.println("");
		scope--;
		
		}
	
	
	
	scope=0;
	for(int i=n;i>0;i--)
	{
		for(int j=0;j<scope;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<i;k++)
		{
			System.out.print("* ");
		}
		System.out.println(" ");
		scope++;
	}
	
	

	}
	}
