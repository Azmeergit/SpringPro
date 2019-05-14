package com.app;

public class ArrayBigAndSmallNumber {
	public static void main(String[] args) {
		
		int a[]= {15,25,85,29,68,55,69,45,1,96,36,55};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]> max)
			{
				max =a[i];
				
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Array Larget no is"+max);
		
		System.out.println("Array smallest Elements"+min);
	}

}
