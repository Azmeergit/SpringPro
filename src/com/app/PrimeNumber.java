package com.app;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		for(int i=1;i<100;i++)
		{
		int m=i/2;
		int flog=0;
		for(int j=2;j<m;j++)
		{
			if(i%j==0)
			{
				//System.out.println("it is the not prime number"+i);
				flog=flog+1;
				break;
			}
		}
		if(flog==0)
		{
			System.out.println("it i sthe prim number"+i);
		}
		}
		
		
		
	}

}
