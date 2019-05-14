package com.app;

public class Test {
	public static void reverse(int a[],int n)
	{
		for(int i=0;i<a.length/2;i++)
		{
			int t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		for(int k=0;k<n;k++)
		{
			System.out.println(a[k]);
		}
	}
	public static void main(String[] args) {
		int arra[]= {15,36,63,86,96,52};
reverse(arra,arra.length);		
	}
}
