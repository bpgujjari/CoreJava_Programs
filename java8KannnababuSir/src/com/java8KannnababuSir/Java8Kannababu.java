package com.java8KannnababuSir;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Kannababu {
public static void main(String[] args) {
	List<Student>students=Arrays.asList(new Student(1, "chimtu", "maths", 90.0),
			new Student(2, "Ratan", "science", 60.0),
			new Student(3, "gujjari", "social",80.0),
			new Student(4, "raju", "maths", 40.0),
			new Student(5, "ram", "physics", 70.0),
			new Student(5, "ram", "physics", 70.0));

	List<Integer> numbers=Arrays.asList(2,4,5,6,7,7,3,2);
	Set<Integer> num=numbers.stream()
			.distinct()
			.collect(Collectors.toSet());	
	System.out.println(num);
	
	
	
  students.stream() .filter(i->i.percentage>60) .collect(Collectors.toList())
  .forEach(System.out::println);
  
  System.out.println("*********");
  
  students.stream() .sorted((s1,s2)->-s1.percentage.compareTo(s2.percentage))
  .limit(3) .collect(Collectors.toList()) .forEach(System.out::println);
  
  
  long count= students.stream() .count(); System.out.println(count);
  
  
  students.stream() .filter(i->i.name.startsWith("R"))
  .collect(Collectors.toSet()) .forEach(System.out::println);
  
  System.out.println("*************"); students.stream()
  .sorted((s1,s2)->-s1.percentage.compareTo(s2.percentage))
  .collect(Collectors.toList()) .forEach(System.out::println);
  
  System.out.println("***********"); String subject="maths"; students.stream()
  .filter(i->i.getSubject().contains(subject)) .collect(Collectors.toSet())
  .forEach(System.out::println);
 
}
}
