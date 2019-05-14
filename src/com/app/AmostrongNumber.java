package com.app;

public class AmostrongNumber {
	public static void main(String args[])
	{
		int i=153;
		int temp=i;
		int sum=0;
		int res;
		while(i>0)
		{
			res=i%10;
			sum=(res*res*res)+sum;
		i=i/10;
		
		}
		if(temp==sum)
		{
			System.out.println("it is the amstrong number::"+temp);
		}
		else
		{
			System.out.println("it is the non amstrong number::"+temp);
		}
	
	}

}
