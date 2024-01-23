package com.collection.lab;

public class StackOverFlowEx {
	
	//			StackOverflowError
	static void m1()
	{StackOverFlowEx.m2();}
	static void m2()
	{StackOverFlowEx.m1();}
	public static void main(String[] args) {
		StackOverFlowEx.m1();
	}
}
