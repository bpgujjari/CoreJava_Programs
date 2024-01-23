package com.sathya.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctoinalEx1 
{
public static void main(String[] args)
	{
	List<String> names=List.of("india","telangana","hyderabad","nagaram");
//	String name=names.stream()
//	.reduce((m1,m2)->m1+m2)
//	.get()
//	System.out.println(name);
	
/*	
			To List
	List<String>names1= names.stream()
	.collect(Collectors.toList());
	System.out.println(names1);
	*/
	
	/*		To Set
	Set<String> name1=names.stream()
	.filter(name->name.startsWith("n"))
	.collect(Collectors.toSet());
	System.out.println(name1);
*/
	
/*			map,reduce
	List<Integer> numbers=List.of(2,6,98,7,6,43,4);
	int  num=numbers.stream()
	.filter(n->n%2==0)
	.map(n->n*10)
	.reduce((n1,n2)->n1+n2)
	.get();
	System.out.println(num);
	*/
	}
}
