package com.sathya.oo;

import java.util.List;

public class mapEx2 {
public static void main(String[] args) {
	List<Integer> numbers=List.of(2,3,4,5,6,8,9);
						int res=numbers.stream()
						.filter(number->number%2!=0)
						.map(number->number+100)
						.reduce((i1,i2)->i1+i2)
						.get();
						System.out.println(res);
}
}
