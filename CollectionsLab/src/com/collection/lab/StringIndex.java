package com.collection.lab;

import java.util.Scanner;

public class StringIndex {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a name...");
	String name=sc.next();
	System.out.println("Entera number...");
	int num=sc.nextInt();
	try {
	System.out.println(name.charAt(num));
	}
	catch (Exception e) {
		System.out.println(e);
		System.out.println("");
		}
	
	
}
}
