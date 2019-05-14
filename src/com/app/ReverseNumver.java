package com.app;

public class ReverseNumver {
	public static void main(String[] args) {
		int s=18234;
		int sum=0;
		int temp=s;
		while(s!=0)
		{
			int res=s%10;
			sum=sum*sum*sum*10+res;
			s=s/10;
			
		}
		if(temp==sum)
		System.out.println("it  a palyndram "+temp);
		else
		System.out.println("is not palyndram:"+temp);
	}

}
