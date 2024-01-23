package com.sathya.Aggregation;

public class Student {
int sid;
String sname;
Marks m;
public Student(int sid, String sname, Marks m) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.m = m;
}
public static void main(String[] args) {
	Marks m1= new Marks(100, 99, 98);
	Student s1= new Student(111, "Bhavani",m1);
	System.out.print(s1.sid+" "+s1.sname+" ");
	System.out.println(s1.m.science+" "+s1.m.social+" "+s1.m.maths);
	
	Student s2=new Student(222,"Rathan",new Marks(200, 230, 250));
	System.out.print(s2.sid+" "+s2.sname+" ");
	System.out.println(s2.m.science+" "+s2.m.social+" "+s2.m.maths);
	
}



}
