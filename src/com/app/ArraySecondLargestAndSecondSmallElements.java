package com.app;

public class ArraySecondLargestAndSecondSmallElements {
	public static void main(String[] args) {
		int a[]= {1,5,2,63,85};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<max)
			{
				max=a[i];
			}
			else if(a[i]>min)
			{
				min=a[i];
			}
		}
		System.out.println("Array is the Big elements::"+max);
		
		System.out.println("Array small element::"+min);
		System.out.println(" --------------array secong largest elements------------");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<a[j]){

	int temp =a[i];
	a[i]=a[j];
	a[j]=temp;
	}
}
			}
		System.out.println("second largest elements::"+a[1]);
		
	System.out.println("-----------second smallest elements--------------");
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)

		{

	if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			
	}
	System.out.println("second smallest elements in array::"+a[1]);
	
	}
		
	}


