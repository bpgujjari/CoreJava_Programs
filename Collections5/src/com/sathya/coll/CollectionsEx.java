package com.sathya.coll;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CollectionsEx {
public static void main(String[] args) {
	List<Emp> emps=Arrays.asList(new Emp(11,"kannababu",10000.90,10,"Hyderabad"),
			new Emp(12,"ratan",20000.90,20,"Banglore"),
			new Emp(13,"Ranjith",30000.90,10,"Chennai"),
			new Emp(14,"Naresh",40000.90,10,"Warangal"));
	Scanner sc=new Scanner(System.in);
	while(true)
	{
		System.out.println("Enter your id");
		int id=sc.nextInt();
		
		emps.stream()
		.filter(e->e.eid==id)
		.forEach(System.out::println);
		
		System.out.println("Do you want one more record...yes/no");
		String option=sc.next();
		if(option.equals("no"))
			break;
	}	
}
}
