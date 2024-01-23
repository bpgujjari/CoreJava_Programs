package com.sathya.coll;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Empex {
public static void main(String[] args) {
	List<Emp> emps=Arrays.asList(
			new Emp(101,"Kannababu",10000.90,10,"Hyderabad"),
			new Emp(102,"Ratan",20000.90,20,"Banglore"),
			new Emp(103,"Ranjith",30000.90,10,"Chennai"),
			new Emp(104,"Naresh",40000.90,20,"Warangal"),
			new Emp(105,"Yakoob",50000.90,30,"Karimnagar"));
	
	emps.forEach(System.out::println);
	System.out.println("**********");
	
	emps.stream()
	.filter(e->e.eid==105)
	.forEach(System.out::println);
	
	System.out.println("******");
	
	
	emps.stream()
	.filter(e->e.dept==20)
	.collect(Collectors.toList())
	.forEach(System.out::println);
	
	System.out.println("**********");
	emps.stream()
	.filter(e->e.location!="Hyderabad")
	.forEach(System.out::println);
	
	
	System.out.println("*************");
	
	emps.stream()
	.filter(e->e.esal>40000&&e.esal<45000)
	.forEach(System.out::println);
	
	System.out.println("***********");
	emps.stream()
	.filter(e->e.location.equals("Hyderabad"))
	.forEach(System.out::println);
	
	
	System.out.println("***********");
	Emp e1= emps.stream()
	.sorted((s1,s2)->-s1.esal.compareTo(s2.esal))
	.findFirst()
	.get();
	System.out.println(e1);
	
	System.out.println("***********");
	Emp e2= emps.stream()
	.sorted((s1,s2)->s1.esal.compareTo(s2.esal))
	.findFirst()
	.get();
	System.out.println(e2);
	
	
	System.out.println("***********");
	emps.stream()
	.filter(e->e.ename.startsWith("R"))
	.forEach(System.out::println);

	
}
}
