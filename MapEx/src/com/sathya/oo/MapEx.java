package com.sathya.oo;

import java.util.Arrays;
import java.util.List;

public class MapEx {
public static void main(String[] args) {
	List<String> names =List.of("Ratan","Ravi","Rani");
	String fnames=names.stream()
				.filter(name->name.startsWith("R"))
				.map(name->name+"Soft")
				.reduce((name1,name2)-> name1+name2)
				.get();
	System.out.println(fnames.length());
	
	
		List<Integer> nums=Arrays.asList(6,7,8,2,4,65,90);
		int r=nums.forEach(num->System.out.println(num));
		.min((m1,m2)->m1.compareTo(m2.valu));
		System.out.println(r);
}
}
