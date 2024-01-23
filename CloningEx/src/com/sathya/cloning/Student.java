package com.sathya.cloning;

public class Student implements Cloneable {
int id;
String name;
Subjects subjects;
public Student(int id, String name, Subjects subjects) {
	this.id = id;
	this.name = name;
	this.subjects = subjects;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
	
		Student student = (Student)super.clone();
		student.subjects=(Subjects)subjects.clone();
		return student;
	}


public static void main(String[] args) throws CloneNotSupportedException {
	Student st1= new Student(11, "Bhavani", new Subjects("java", "python", "sql"));
	Student st2=(Student)st1.clone();
	System.out.println("student 1"+st1.subjects.s1);
	System.out.println("student 2"+st2.subjects.s1);
	
	st1.subjects.s1="corejava";
	
	System.out.println("student changed the subject.......");
	System.out.println("student 1"+st1.subjects.s1);
	System.out.println("student 1"+st2.subjects.s1);
	
	
}


}
