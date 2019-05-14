package com.app;

public class DuplicateArrayElements {
	public static void main(String[] args) {
		int a[]= {52,69,85,45,25,52,69,85,45};
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&& i!=j)
				{
					//System.out.println(a[j]);
					System.out.println("duplicate Elements are: "+a[j]);
			count++;
				}
			}
			
		}
		System.out.println(count);
	}

}
