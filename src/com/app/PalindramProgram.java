package com.app;

public class PalindramProgram {
	public static void main(String[] args) {
		int i=123;
		int trmp=i;
		int sum=0;
		while(i>0)
		{
			int res=i%10;
			sum=sum*10+res;
			i=i/10;
		}
		if(trmp==sum)
		{
			System.out.println("it is the  palindram:"+trmp);
		}
		else
		{
			System.out.println("it is the not polindram"+trmp);
		}
	}

}
