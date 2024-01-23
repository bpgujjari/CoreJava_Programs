package com.collection.lab;

public class ThrowKeyword {
public static void check (int age) {
	if(age<18)
		throw new TooYoungException("youre not eligible now....");
	else if(age>30)
		throw new TooOldException("youre time out try in next janma...");
	else
		System.out.println("congratulations dont marry....");
}
public static void main(String[] args) {
	ThrowKeyword.check(12);
}
}
