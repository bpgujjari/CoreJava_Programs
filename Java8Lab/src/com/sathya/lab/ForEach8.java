package com.sathya.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class ForEach8 {
	
	public static ArrayList<String> method()
	{
		ArrayList<String>country=new ArrayList<>();
				
		country.add("india");
		country.add("pak");
		country.add("srilanka");
		country.add("england");
		
		return country;
	}
	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Ratan","kannababu","Yakub","Chimtu");
		names.forEach(System.out::println);
		System.out.println("***************************");
		List<String>fruits=Arrays.asList("apple","banana","mango","watermelon");
		for(String fruit:fruits)
		{
			System.out.println(fruit);
		}
		System.out.println("***************************");

		
		List<Integer> numbers=Arrays.asList(2,3,5,7,11);
		 long count=numbers.stream().count();
		 System.out.println(count);
			System.out.println("***************************");
	 
		int first= numbers.stream()
		 .findFirst()
		 .get();
		System.out.println(first);
		
		
		System.out.println("***************************");
	
		int last=numbers.stream()
				.sorted((s1,s2)->-s1.compareTo(s2))
				.findFirst()
				.get();
		        System.out.println(last);
		
				System.out.println("***************************");

		int third=numbers.stream()
		.skip(2)
		.findFirst()
		.get();
		System.out.println(third);
		
	String msg=	names.contains("Chimtu")?"Element found":"Element not found";
		System.out.println(msg);
		
		ArrayList<Character> chs=new ArrayList<>();
		chs.add('A');
		chs.add('B');
		chs.add('c');
		chs.add(1, 'k');
		System.out.println(chs);
		System.out.println("****");
		chs.set(2,'x');
		System.out.println(chs);
		chs.remove(0);
		System.out.println(">>>>>>>>");
		System.out.println(chs);
		
		System.out.println("**********");
		
		
		boolean flag=chs.isEmpty()?true:false;
		if(flag)
		{
			System.out.println("empty");
		}
		else
		{
			chs.clear();
		}
		
		System.out.println(chs);
		
		
		
		ArrayList<String>country=ForEach8.method();
		System.out.println(country);
		
		List<String>list=Collections.nCopies(10, "Chimtu");
		System.out.println(list);
		
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum=nums.stream()
		.reduce((i,j)->i+j)
		.get();
		System.out.println("Sum is----->"+sum);
		
		long cnt=nums.stream()
				.count();
		System.out.println("count is---------->"+cnt);
		
		double avg=sum/cnt;
		
		System.out.println("Average is----------->"+avg);
				
		
		String[]names1= {"Ratan","Chimtu","ioioio"};
		ArrayList<String>c=new ArrayList<>();
		
	for(int i=0;i<names1.length;i++)
	{
		c.add(names1[i]);
		
	}
	System.out.println(c);	
		
	}
	
	
	

}
