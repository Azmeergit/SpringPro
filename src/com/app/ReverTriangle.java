package com.app;

public class ReverTriangle {
public static void main(String[] args) {
	int i,j,n=10;
	for (i=0;i<=n;i++)
		
	{
		for(j=0;j<n-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<i;k++)
		{
			System.out.print("*");
		}
		System.out.println("");
		
	}
	for(i=1;i<n;i++)
	{
		
for(int k=0;k<i;k++)
{
	System.out.print("*");
}
	System.out.println(" ");
	}
}
}
