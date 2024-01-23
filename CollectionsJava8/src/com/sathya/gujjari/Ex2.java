package com.sathya.gujjari;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
public static void main(String[] args) {
	List<String>names=Arrays.asList("Sravya","Sathya","Sourav","Gangooli");
	names.sort((s,t)->s.compareTo(t));
	System.out.println(names);
	Collections.sort(names,Comparator.reverseOrder());
	System.out.println(names);
	names.sort((s,t)->-s.compareTo(t));
	System.out.println(names);
	List<Integer> numbers=Arrays.asList(8,7,9,70,4,5,3,23,212);
	numbers.sort((m,n)->m.compareTo(n));
	System.out.println(numbers);
	numbers.sort((m,n)->-m.compareTo(n));
	System.out.println(numbers);
	Collections.sort(numbers);
	System.out.println(numbers);
	Collections.sort(numbers,Comparator.reverseOrder());
	System.out.println(numbers);
	List<String> n= names.stream()
			.filter(name->name.startsWith("S"))
		.collect(Collectors.toList());
	System.out.println(n);
	 String m= names.stream()
			 .sorted((i,j)->i.compareTo(j))
			 .skip(1)
			.findFirst()
			.get();
	System.out.println(m);
	 names.stream()
	.collect(Collectors.toList())
	.forEach(System.out::println);

}
}
