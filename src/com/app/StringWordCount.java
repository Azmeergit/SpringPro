package com.app;

public class StringWordCount {
	public static void main(String[] args) {
		String s="hello ddd gdgghfh fhggj hjhkjkjkj jllk;k; o; hdfdsdsfafa world world it is the my thing";
		String a[]=s.split(" ");
		int count =1;
	for(int i=0;i<a.length;i++)
	{
		
		for(int j=i+1;j<a.length;j++)
			
		{
			if(a[i].equals(a[j]))
			{
				count =count+1;
				a[j]="0";
			}
			
		}
		if(a[i]!="0")
			
		{
			System.out.println(a[i]+"..........."+count);
			count=1;
		}
	}
	}

}
