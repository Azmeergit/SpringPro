package com.app;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class StringArrayReverse {
	
	public static void main(String[] args) {
		String s[]= {"google","yahoo","opera"};
		System.out.println(Arrays.toString(s));
		List<String> sa=Arrays.asList(s);
		Collections.reverse(sa);
		Object[] ad=sa.toArray();
		System.out.println(Arrays.toString(ad));
	}	
}
