package com.sathya.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Seriliazation {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Emp emp=new Emp(11,"Chimtu", 900.8);
	FileOutputStream outputStream = new FileOutputStream("abc.txt");
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
	objectOutputStream.writeObject(emp);
	System.out.println("..........");
	FileInputStream fileInputStream=new FileInputStream("abc.txt");
	ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
	Emp e=(Emp)inputStream.readObject();
	System.out.println(e.eid+"  "+e.ename+"  "+e.esal );
}
}
