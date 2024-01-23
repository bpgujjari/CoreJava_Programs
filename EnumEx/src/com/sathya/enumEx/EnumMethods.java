package com.sathya.enumEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

enum Pizzas{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}
public class EnumMethods {
	public static void main(String[] args) {
//		Pizzas[] pizzas=Pizzas.values();
//		List<Pizzas> p= List.of(pizzas);
//		p.forEach(i->System.out.println(i));
//		
//		Pizzas p1=Pizzas.SMALL;
//		Pizzas p2=Pizzas.LARGE;
//		Pizzas p3=Pizzas.MEDIUM;
//		Pizzas p4=Pizzas.EXTRALARGE;
//		System.out.println(p1+" "+p2+" "+p3+" "+p4);

		Pizzas [] pz=Pizzas.values();
		for(Pizzas pz1:pz)
		{
			System.out.println( pz1.ordinal()+"   "+pz1);
	
		}
		
		
		
		
		
		Integer[] ar1= {1,2,3,3,3,3,4,4,5,5,5,};
		Set<Integer> ar= new HashSet<Integer>(Arrays.asList(ar1));
		ar.forEach(z->System.out.println(z));
			
	}
}
