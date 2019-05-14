package com.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ReversLogicString {
public static void main(String[] args) {
	
	
	//this the String value is reverprocess
	
	
	/*String s="my name is Koteswararao";
	String reverse = " ";
	for(int j=s.length()-1;j>=0;j--)
	{
		reverse =reverse+s.charAt(j);
		
	}
	System.out.println(reverse);*/


//reverse the collection elements
	
	ArrayList a=new ArrayList();
	a.add("koti");
	a.add("raju");
	a.add("teja");
	System.out.println(a);
	Collections.reverse(a);
	System.out.println(a);

	Collection c=new ArrayList();
	c.add(12);
	c.add(23);
	c.add(12);
	System.out.println(c);
	System.out.println(c.contains(14));
	Iterator a1=c.iterator();
	while(a1.hasNext())
		
	{
		
	
	if(c.contains(12))
	{
		c.remove(12);
	}
	else {
		c.add(13);
		break;
		
	}
	}
	System.out.println(c);
	
	System.out.println(c);
	
}
}
