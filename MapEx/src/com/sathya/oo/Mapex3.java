package com.sathya.oo;

import java.util.List;
import java.util.Set;
import java.util.stream.*;
public class Mapex3 {
public static void main(String[] args) {
	List<List<Character>> chars=List.of(List.of('s','k','y'),
										List.of('m','a','d','a','m'),
										List.of('s','i','r'),
										List.of('m','a','r','r','i','a','g','e'));
										
	Set<Character>newchars= chars.stream()
					.flatMap(data->data.stream())
					.filter(char1->!(char1=='a'||char1=='e'||char1=='i'||char1=='o'||char1=='u'))
					.collect(Collectors.toSet());
	System.out.println(newchars);
}
}
