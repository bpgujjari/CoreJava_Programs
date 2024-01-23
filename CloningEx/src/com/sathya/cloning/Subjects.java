package com.sathya.cloning;

public class Subjects implements Cloneable {
String s1;
String s2;
String s3;
public Subjects(String s1, String s2, String s3) {
	this.s1 = s1;
	this.s2 = s2;
	this.s3 = s3;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
