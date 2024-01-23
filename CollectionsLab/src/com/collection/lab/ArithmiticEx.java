package com.collection.lab;

import java.util.Scanner;

public class ArithmiticEx {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number...");
	int num=sc.nextInt();
	try 
	{
	System.out.println(10/num);
	}
	catch (ArithmeticException e) {
		System.out.println("Enter a valid number...");
	}
}
}
