package com.app;

public class StringDuplicateEleminite {
	public static void main(String[] args) {
		String s="koti is the best koti is the ko best";
	String[] a=	s.split(" ");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=null)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					a[j]=null;
				}
			}
			
		}
	}
	for(int k=0;k<a.length;k++)
	{
		if(a[k]!=null)
		{
			System.out.print(a[k]+" ");
		}
	}
	}

}
