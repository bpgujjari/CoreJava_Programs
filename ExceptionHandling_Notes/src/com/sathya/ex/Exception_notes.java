package com.sathya.ex;
Exception Handling 

Introduction:
     Exception is an object occurred during runtime to disturb the normal flow of the execution.         
The dictionary meaning of the exception is abnormal termination. 
		st-1
		st-2
		st-3   exception raised 
		st-4 

Compile time we will get only syntax Errors.
In application whenever the exception occurred,
	1.	Program terminated abnormally.
	2.	Rest of the application is not executed.

There are two ways to handle the exception,
	a. try-catch block.
	b. throws keyword.

Once we handle the exception 
	1.	Program terminated normally.
	2.	Rest of the application is executed.

Note: 	The main objective of exception handling is to get the normal termination of the application. In order to execute the application code completely. 

Exception handling keywords:
	1.	try
	2.	catch
	3.	finally
	4.	throws
	5.	throw

Types of Exceptions: 
      As per the sun micro systems standards The Exceptions are divided into 3- types,
		1. Checked Exception
		2. Unchecked Exception
		3. Error  




1. Unchecked Exception:
	The Unchecked Exception are caused due to end-user input problems. 
	The exceptions are not checked by compiler are called Unchecked Exception
			ex : ArithmeticException, 
AIOBE , NPE , NFE...etc  
	These are child class of RuntimeException.

2. Checked Exception:
	The checked exceptions are caused due to developer issues. 
	The Exceptions which are checked by the compiler are called Checked Exceptions.
	ex: FileNotFoundException,SQLException,InterruptedException ……..etc  
	These are child class of Exception.

Checked vs. Unchecked 
1.	un-checked exceptions are caused due to end-user input problems. 
   	checked exceptions are caused due to developer mistake. 

2.	The checked exceptions are safe because the compiler will give some information about the exception at compile time itself. If the application contains checked exception must handle the exception, then only code is compiled. Otherwise compiler generates error message. unchecked exception compiler is not giving any information. Application failed at runtime. 
3.	Whether it is a checked Exception or unchecked exception, the exceptions are raised at runtime but not compile time.
				


						Exception Handling 

Introduction:
     Exception is an object occurred during runtime to disturb the normal flow of the execution.         
The dictionary meaning of the exception is abnormal termination. 
		st-1
		st-2
		st-3   exception raised 
		st-4 

Compile time we will get only syntax Errors.
In application whenever the exception occurred,
	1.	Program terminated abnormally.
	2.	Rest of the application is not executed.

There are two ways to handle the exception,
	a. try-catch block.
	b. throws keyword.

Once we handle the exception 
	1.	Program terminated normally.
	2.	Rest of the application is executed.

Note: 	The main objective of exception handling is to get the normal termination of the application. In order to execute the application code completely. 

Exception handling keywords:
	1.	try
	2.	catch
	3.	finally
	4.	throws
	5.	throw

Types of Exceptions: 
      As per the sun micro systems standards The Exceptions are divided into 3- types,
		1. Checked Exception
		2. Unchecked Exception
		3. Error  




1. Unchecked Exception:
	The Unchecked Exception are caused due to end-user input problems. 
	The exceptions are not checked by compiler are called Unchecked Exception
			ex : ArithmeticException, 
AIOBE , NPE , NFE...etc  
	These are child class of RuntimeException.

2. Checked Exception:
	The checked exceptions are caused due to developer issues. 
	The Exceptions which are checked by the compiler are called Checked Exceptions.
	ex: FileNotFoundException,SQLException,InterruptedException ……..etc  
	These are child class of Exception.

Checked vs. Unchecked 
1.	un-checked exceptions are caused due to end-user input problems. 
   	checked exceptions are caused due to developer mistake. 

2.	The checked exceptions are safe because the compiler will give some information about the exception at compile time itself. If the application contains checked exception must handle the exception, then only code is compiled. Otherwise compiler generates error message. unchecked exception compiler is not giving any information. Application failed at runtime. 
3.	Whether it is a checked Exception or unchecked exception, the exceptions are raised at runtime but not compile time.

4.	whether it is a checked or unchecked exception, better to handle the exception either by using try-catch blocks or by using throws keyword.  
5.	All un-checked exceptions are child class of RuntimeException.
      All checked exceptions are child class of Exception.

3. Errors: 
	The exceptions are occurred due to the fallowing reasons
		a.	Developer mistakes
		b.	End-user input mistakes.
	But errors are caused due to lack of system resources.
		StackOverFlowError, OutOfMemoryError …………etc
	It is possible to handle the exceptions by using try-catch blocks or throws keyword but it is not possible to handle the errors.
	Error is an un-checked type exception.

 
	The root class of both exceptions & errors   : Throwable 
	The root class of only exceptions		     :  Exception 
	The root class of only errors		     :  Error 
	RuntimeExceptions its child classes & Error its child classes are unchecked exceptions, remaining all exceptions are checked type. 
 



Exception handling by using try–catch blocks:
	Syntax:		
		try
		{	Exceptional code : it may or may not raise an exception    
		}
		catch (Exception_Name  reference_variable)
		{ 	logics run if an exception raised in try block.
		}

1)	If the exception raised in try block, then catch is matched so program terminated normally.
2)	If the exception raised in try block, catch is not matched so program Abnormal termination

3)	If there is no exception in try then catch block is not executed.
4)	Only try block declaration is not possible.

5)	In between the try-catch blocks statements are not allowed. 
6)	If the exception raised in try block it will check the catch block. But if the exception raised in catch block it is abnormal termination.

7)	Possible to write the try with multiple catch blocks. 
8)	Using PIPE(|) symbol possible to handle the multiple exception. 
catch(NumberFormatException | NullPointerException | NullpointerException a)

9)	The Exception class catch block will handle all the exceptions. 
•	catch (Exception e) 
10)	 printStackTrace() method will print the complete method calls where the exception raised. 

Try-with resources: 
	When we declare the resource using try block, once the try block is completed the resource is automatically released.
		syntax:	try(Resource-1;resource-2;.....resource-n){		
				}
	How it is release automatically means, every resource internally implementing the AutoCloseable & it contains close() method to close the resources. 
			public interface java.lang.AutoCloseable {
				  public abstract void close() throws java.lang.Exception;
			}
	AutoCloseable interface introduced in java-7
	The close() method is invoked automatically on objects managed by the try-with-resources statement.

Finally Block 

	The finally block code logics executed both normal & abnormal cases. 
	Finally block used to close the resources (Connections, scanner, files…etc) both normal & abnormal cases.
#Application with try-catch-finally block.
	try
	{	connection open 
			tx1
			tx2
	}
	catch (Exception e)
	{	Handle the exception....
	}	
	finally{
		Release the resources:: connection closing. 
	}

Note: The finally block contains the code to release the resources like, 
			file closing. 
			Scanner object closing. 
			Connection closing.
			socket closing.....etc

There are two cases finally block not executed, 
	Whenever the control is entered into try block then only finally block will be executed,otherwise finally is not executed. If exception raised outside the try block, So the finally block not executed. 
	If you stop the Java Virtual machine n try-block, So the finally block not executed.
Stop the JVM: 
		public static void exit(int status)
	Terminates the currently running Java Virtual Machine.

Note : 
1.	If try-catch-finally blocks contains exceptions, then JVM will raise only one exception most recently raised (finally block) exception.
2.	If try-catch-finally blocks contains return statement, then it will return the finally block value. 


Write the valid & Invalid cases:

try-catch			:    ________	 
	try-with resources		:    _______	 
	try-finally			:    _______

	only try			:    _______	 
	only catch			:   _______	  
	only finally			:  _______	 

	try-catch			:   _______
	try-finally			:  _______	
	try-catch-finally		:  _______
	try-catch-catch		:  _______
	
	try-catch-catch-finally	:  _______

	catch-finally			:  _______ 
	try-finally-finally		:  _______ 
	try-finally-catch		:   _______ 
	try-catch-finally-catch 	:   _______ 
	
	catch-try-finally		:    _______ 
	try-catch-finally-finally	:   _______ 
	try-try-catch-finally		:   _______


















important built-in exceptions in Java. 
ArithmeticException:
 It is thrown when an exceptional condition has occurred in an arithmetic operation(10/0).
ArrayIndexOutOfBoundsException: 
It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.

ClassNotFoundException: 
This Exception is raised when we try to access a class whose definition is not found

FileNotFoundException: 
This Exception is raised when a file is not accessible or does not open.

IOException: 
It is thrown when an input-output operation failed or interrupted

InterruptedException: 
It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.

NoSuchFieldException: 
It is thrown when a class does not contain the field (or variable) specified.

NoSuchMethodException: 
It is thrown when accessing a method that is not found.

NullPointerException: 
This exception is raised when referring to the members of a null object. Null represents nothing

NumberFormatException: 
This exception is raised when a method could not convert a string into a numeric format.

StringIndexOutOfBoundsException: 
It is thrown by String class methods to indicate that an index is either negative or greater than the size of the string.

IllegalArgumentException : This exception will throw the error or error statement when the method receives an argument which is not accurately fit to the given relation or condition. It comes under the unchecked exception. 
Throws Keyword 
	
There are two ways to handle the exceptions,
1.	using try-catch 
		   To write the exception handling logics in try-catch blocks.
2.	 Using throws
		   To delegate the exception handling responsibility to caller method.

	The method can throw single exception, 
		void studentInfo()throws FileNotFoundException

	One method can throws multiple exceptions
void m2()throws FileNotFoundException,InterruptedException

	use the root class to throws all exceptions.
void m2()throws Exception

	The method can throws parent & child exceptions but it is not recommended. It is recommended to throws only parent exception it can handle the all exceptions.
void info() throws FileNotFoundException,Exception

Note:  
	The checked exceptions are propagated using throws keyword. But unchecked exceptions are automatically propagated. 

	Using throws it is possible to propagate unchecked exceptions also but it is not recommended. Because unchecked exceptions are automatically propagated.














			Throw Keyword 

	Throw keyword used to throw the exception to end-user.
	The Java throw keyword is used to throw an exception explicitly.
	Using throw keyword, we can throw predefined exceptions & user-defined exception.   But throwing predefined exceptions are not recommended because predefined exceptions are having fixed meaning.
throw new ArithmeticException("your not eligible for voting...");


User-defined exception(Custom Exceptions) 

There are two types of user-defined exceptions, 
	1) user-defined un-checked exception
Our normal java class becomes un-checked exception by extending RuntimeException class. 
			class InvalidAgeException extends RuntimeException 
			{	Logics Here 	
			}
		There are two ways give the exception message, 
			a.  Default constructor    : Exception without description  
			b.  Params constructor   : Exception with description. 
		
	2) user defined checked exception.
Our normal java class becomes un-checked exception by extending RuntimeException class.
			class InvalidAgeException extends Exception {
				Logics Here….
			}
	
There are two ways give the exception message,
			a.  default constructor   	 : Exception without description  
			b.  params constructor	  : Exception with description. 	
		
Note: When we create the user defined exceptions, The coding convention is the user defined exception name suffix with word "Exception".
		ex: InvalidAgeException
			SleepingException 
			IrregularStudentException
			InvalidAccountException



			Exception Handling INTERVIEW QUESTIONS 
	
Q1. Define the exception? 
Ans:  Exception is an object occurred during runtime to disturb the normal flow of 
the execution.
	  If the application contains exception, then program terminated abnormally. 
	  The dictionary meaning of the exception is abnormal termination. 

Q2. What are the different ways to handle the exception?
Ans: There are two ways to handle the exceptions in java,
		a. using try-catch blocks 
		b. using throws  

Q3. What is the main objective of exception handling? 
Ans: The objective of exception handling is to get the normal termination of the application in order to execute the complete application smoothly. 

Q4. What is the root class of Exception handling? 
Ans: The root class of Exception handling(exceptions,errors)is:  Throwable 
	  The root class of only exceptions is:  Exception 
	  The root class of only erros is:  Error 

Q5. How many type of exceptions in java? 
Ans: As per the "sun micro systems" There are 3-types of exceptions in java. 
		a. Checked exceptions
		b. Un-checked exceptions
		c. Error 

Q6. Define Checked exception? 
Ans: The checked Exceptions are caused to developer mistake. 
	 Compiler will give the information.
	 All checked exceptions are child classes of Exception class. 

Q7. Define un-checked exception?
Ans: The exceptions are caused due to end-user input issues. 
      Compiler will not check this exceptions(compiler will not give the information).
	 All unchecked exceptions are child of RuntimeException. 

Q8. Define exception vs. error? 
Ans:  Exceptions are caused to developer mistakes or end-user input problems. It can be handle using try-catch or throws. 
	  Errors are caused due to lack system resources. It can not be handle. 

Q9. can we handle errors? 
Ans:  no, not possible. 

Q10. What are the checked exceptions in java?
Ans:  The class Exception and any sub-classes that are not also subclasses of RuntimeException are checked exceptions. 

Q11. What are the unchecked exceptions in java? 
Ans: RuntimeExceptions its child classes & Error its child classes are unchecked exceptions.

Q12. When the catch blocks are executed? 
Ans: When exception raised in try blocks.

Q13. Independent try blocks are allowed or not? 
Ans: only try blocks are not allowed. 
	 You must take, 
	 		try-catch
			try-with-resources
			try-finally

Q14. When we have the multiple catch blocks, What is the order of catch block? 
Ans:  When we have the multiple catch blocks the catch blocks order should Child to Parent. If we write the catch block order is parent to child we will get error message. 

Q15. What is the purpose pipe(|) symbol? 
Ans: pipe(|) symbol used to handle the multiple exceptions using single catch. 
		 Using pipe we can take only un-checked exceptions. 
		 Using pipe we can take only checked exceptions. 
		 Using pipe we can take both checked & un-checked exceptions.
		 Using pipe it is not possible to take the both parent & child.

Q16. what is the purpose of try-with resources? 
Ans: When we declare the resource using try block, once the try	block is completed the resource is	automatically released. How it is release automatically means, every resource internally	implementing the AutoCloseable & it contains close()	method to close the resources. 
	The close() method is invoked automatically on objects managed by the try-with-resources statement.




Q17. What are the different ways to print the exception message? 
Ans:		prining rereference varaible. (it calls toString())
		using getMessage() method. 
		using printStackTrace() method. 

Q18. Internally JVM uses what mechanism to print the exception message? 
Ans: JVM uses printStackTrace() method to print the exception information. 

Q19. java supports nested try-catch block?
Ans: Yes, possible 

Q20. what is the use of AutoCloseable interface? 
Ans:	It contains close() method which is invoked automatically on objects managed by the	 try-with-resources statement.

Q21. What is the purpose of finally block?
Ans: The finally block code always executed both normal & abnormal cases. 
	 finally block used to release the resources(Connection,scanner,file...) both normal & abnormal cases. 

Q22. what are the cases finally block not executed? 
Ans:  If the exception handling not started(try block not started....)
	  when we stop the JVM using exit() method. 

Q23. Define final vs. finally vs. finalize? 
Ans: final is a modifier, 
		final varaibles are re-initialization not possible. 
		final methods are overriding not possible 
		final classes are can not be inherited. 

	finally is a block, This code will be executed both normal & abnormal cases. 

	finalize is a method, This method is called by garbage collection before destroying the object. 

Q24. If the try-catch-finally blocks contains exceptions at runtime which exception is displayed?
Ans:  At runtime the JVM will display only one exception that is Finally block exception. 

Q25. Can we write try-finally without catch? 
Ans: Yes, possible

Q26. what is the difference between finally vs. Autocloseable? 
Ans: In finally block programmer is responsible to close the resources. 
	 In Autocloseable the close method is automatically called when we have try-with-resources. 

Q27. what is the purpose of throws?
Ans: used to propagate the exception handling responsibilities to caller method. 
	 using throws keyword we can throw multiple exceptions. 

Q28. How can we propagate the checked exception?
Ans: We can we propagate the checked exception by using throws keyword. 

Q29. can we propagate unchecked exception using throws keyword?
Ans: Yes possible, but not recommended because unchecked exceptions are automatically propagated. 

Q30. What is the difference between try-catch & throws? 
Ans:  try-catch : used to write the Handling code. 
      throws    : Just propagate the exception handling responsibilities to caller method.

Q31. is it method can throws multiple exception?
Ans:  yes, possible

Q32. what is the purpose of throw keyword?
Ans:throw keyword used to throw the exception to end user. 
Using throw keyword it is possible to throw predefined & user-defined exceptions. 
	But throwing the predefined exceptions not recommended because those are having fixed meanings. But it is recommended to throw user defined exceptions. 

Q33. How to create user-defined unchecked exception? 
Ans: Take the normal java class by extending RuntimeException. 
			class InvalidException extends RuntimeException
			{	Logics Here....
			}
Q34. What are the coding convention we have to fallow while creating user defined exception? 
Ans:  The exception name should suffix with exception. When we create the userdefined exceptions,The codeing convention is the userdefined exception name suffix with word "Exception".
		ex: InvalidAgeException
			SleepingException 
			IrregularStudentException
			InvalidAccountException 
Q35. How to create userdefined checked exception? 
Ans: Take the normal java class by extending Exception. 
			class InvalidException extends Exception
			{	Logics Here....
			}

Q36. what is the difference between ClassNotFoundException vs. NoClassDefFoundError.
Ans: ClassNotFoundException is an exception that occurs when you try to load a class at run time using Class.forName() 
	NoClassDefFoundError is an error that occurs when a particular class is present at compile time, but was missing at run time.

Q37. Can we create custom exception description?
Ans: Possible to create the custom Exceptions in two formats, 
		i.	Without description	it uses default constructor.  
		ii. With description it uses parametarized constructor. 

Q38. When we will get NullPointerException?
Ans: When we are trying to get the data from the object, but that object contains null in this	case you will get NullPointerException. 

Q39. Explain any 5-exceptions in java?
Ans: ArithmeticException:		10/0	: division by zero 
 ArrayIndexOutOfBoundsException :we are trying to get the array index but it is not present. 
	 FileNotFoundException : If the file is not present 
	 ClassNotFoundException : If the class is not presnet 
	 ClassCastException : If the type casting of the object is not possible. 

Q40. Can we throw the predefined exceptions with custom messages?
Ans: we can throw the predefined exceptions with custom messages but it is not recommanded, because the predefined exceptions are having some fixed meaning. 










				Lab Activities 

1.	Write a java program If an error occur in try-block, use try...catch to catch the error and execute some code to handle it.

2.	Write the java program, complete the code. 
try{
	logics here
	}
	catch(InputMissmatchException ae){	
		logics here
	}
catch(ArithmeticException ae){	
		logics here
}

3.	Write a program to Show the below exceptions.  
		java.lang.NoClassDefFoundError vs  java.lang.ClassNotFoundException
	
4.	Write the java program, complete the code. 
try{
	logics here
	}
	catch(){	
		logics here
	}
fianlly{	
		logics here
}

5.	Write the java program, 
findFile() method throws FileNotFoundException so handle the excpetion in main method using try-catch blocks. 
	
class Main {
	  public static void findFile() throws FileNotFoundException {
			write the logics here to raise exception 
		}
	  public static void main(String[] args) {
		  findFile();
	  }
	}
6.	Write a java program to demonstrate use of PIPE symbol. 
7.	create the user-defined un-checked exception. 
	TooYoungException	 :  with description : 
"your kid not eligible for marriage try after some time"
	TooOldException	 :  with description :
 "your old man not eligible to marriage" 
		
		In Application Take the input from end user 
				age <18  : throw TooYoungException
				age >35  : throw TooOldException 
				age b/w 18 to 30 : eligible for mrg enjoy the life.....

8.	Write a java program to demonstrate the Try-with-resources concept? 

9.	Write a java program to demonstrate exception rethowing? 

10.	When we will get below exception write examples for All exceptions.

1.	ArithmeticException 

2.	StringIndexOutOfBoundsException. 

3.	ArrayIndexOutOfBoundsException.
4.	InputMissMatchException. 
5.	NullPointerException. 

6.	ClassNotFoundException. 
7.	NoClassDefFoundError.

8.	NumberFormatException. 
9.	IllegalArgumentException. 
10.	NegativeArraySizeException. 

11.	ClassCastException.
12.	StackOverflowError.
13.	OutOfMemoryError. 
