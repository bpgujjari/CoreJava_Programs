Java 8-lambda Expression 
			========*******========

interface features with new version: 
	interface Message
	{			java-7 version 
		String name = "ratan";   // public static final  
		void m1();		// abstract method 
				
				java-8 version  
		default void m2(){logics...}	// default method 
		static void m3(){logics....}	// static method 
				
				java-9 version 
		private void m4();				// abstract method 
		private static void m5();		// abstract method 
	}

Functional Interfaces: 
	The Interface contians only one abstract method is called functional interface. 
	The FuncitonalInterface many contains default,static,private, private static methods also. 
		ex: Consumer, Comparator,Runnable...etc 

The lambda expression will provide the implementation of FunctionalInterace method. 

The lambda expression will take the any number of arguments, but takes only one expression that will executed & returned. 
	
	Lambda syntax: 	
		(arguments) -> expression 	

ex-1: 
package com.sathya.lambda;
@FunctionalInterface
interface Greeting
{	void greet();
}
public class LambdaEx1 {
	public static void main(String[] args) {	
		Greeting g1 = () -> System.out.println("Ratna sir Hero..");
		g1.greet();
		
		Greeting g2 = () -> {System.out.println("Ratna sir Hero..");
							  System.out.println("This is lambda...");};
		g2.greet();		
	}
}
When we take the lambda, If we want write more than one print statement take that print statements inside the brases.

ex-2: 
package com.stahya;
@FunctionalInterface
interface Operations
{	void add(int num1,int num2);
}
public class LambdaEx1 {
	public static void main(String[] args) {
		Operations op1 = (int num1,int num2) -> System.out.println("Addition of two numbers.."+(num1+num2));
		op1.add(100, 200);
		
		Operations op2 = (num1,num2) -> System.out.println("Addition of two numbers.."+(num1+num2));
		op2.add(1000, 2000);
	}
}
When we take the lambda arguments, the type of the argument is optional. 
	
ex-3:
package com.sathya;
@FunctionalInterface
interface Service
{	public String login(String username,String password);
}
public class Lambdaex3 {
	public static void main(String[] args) {
Service s1 = (username,password)->{return username.equalsIgnoreCase("Sathya")
						&&password.equals("Sathya@123")?
							"Login Success":"Login Fail";};
		String status1 = s1.login("sathya", "Sathya@123");
		System.out.println("Login Status...."+status1);

Service s2 = (username,password)->
	username.equalsIgnoreCase("ratan")
					&&password.equals("Ratan@123")?
					"Login Success":"Login Fail";
		String status2 = s2.login("ratan", "anu@123");
		System.out.println("Login Status...."+status2);
	}
}
When we take the lambda implementation the return statement is optional. 




Qwrite the java program lambda code for below functional interface? 
	interface Service 
	{	public String voteCheck(String name,int age,String location)
	}
	lambda code check the age>=18 & location=hyderabad 