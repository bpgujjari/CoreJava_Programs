package com.sathya.gujjari;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsEx1 {
public static void main(String[] args) {
	Set<Bottle> bottles=Set.of(new Bottle(111,"kinley", 90),
								new Bottle(222,"bislerey",80),
								new Bottle(333,"tata",95));
		 bottles.stream()
		 .filter(bottle->bottle.bname.equals("kinley"))
		 .collect(Collectors.toList())
		 .forEach(bottle->System.out.println(bottle.bid+" "+bottle.bname+" "+bottle.bcost));
		 System.out.println("*****************");
		bottles.stream()
		.filter(bottle->bottle.bcost>=90)
		 .forEach(bottle->System.out.println(bottle.bid+" "+bottle.bname+" "+bottle.bcost));
		 System.out.println("*****************");
			 
}
}
