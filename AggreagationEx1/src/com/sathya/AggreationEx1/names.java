package com.sathya.AggreationEx1;

import java.util.Arrays;
import java.util.List;

public class names {
public static void main(String[] args) {
	List<String> names=List.of("gujjari","Bhavani","prasad");
	names.forEach(System.out::println);
	List<Emp> emps=Arrays.asList(new Emp(90,"iiii", 9898, new Address(9, "pppp", "kkkkk"), new Certificiates(9, 9, 9), new Parents("........", ",,,,,.,.")));
	emps.forEach(System.out::println);

}
}
