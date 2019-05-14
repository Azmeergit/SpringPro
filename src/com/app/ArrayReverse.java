package com.app;

public class ArrayReverse {
	public static void reverse(int a[],int n)
	{
		int k,t;
		for(int i=0;i<a.length/2;i++)
		{
			
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
			
		}
		System.out.println("reversed array is");
		for(k=0;k<n;k++)
		{
			System.out.println(a[k]);
		}}
	public static void main(String[] args) {
		int arr[]= {10,12,31,34,45};
		reverse(arr,arr.length);
	}
	}



