package com.sathya.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex2 {
public static void main(String[] args) {
	List<String> names=List.of("india","telangana","hyderabad","nagaram");
	System.out.println(names);

//	String name=names.stream()
//	.findFirst()
//	.get();
//	System.out.println(name);
	
	List names1 = names.stream().sorted().collect(Collectors.toList());
	System.out.println(names1);
	List names2 = names.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
	System.out.println(names2);
	
	Map<String,Integer > count=Map.of(
										"bhavni",10,
										"gujjari",20,
										"prasd",30,
										"india",35);
				System.out.println(count.keySet());
				System.out.println(count.values());

			
	




}
}
