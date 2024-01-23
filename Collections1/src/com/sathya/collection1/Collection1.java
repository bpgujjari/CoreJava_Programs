package com.sathya.collection1;

import java.util.ArrayList;

public class Collection1 {
public static void main(String[] args) {
	ArrayList objs= new ArrayList();
	objs.add(new Studend(100, "Gujjari"));
	objs.add(new Emp(201, "Bhavani"));
	objs.add("Prasad");
	Emp e= (Emp)objs.get(1);
	System.out.println(e.eid+"  "+e.ename);
	Studend s=(Studend)objs.get(0);
	System.out.println(s.sid+"---"+s.sname);
	System.out.println(objs.get(2));
	
	ArrayList<Emp>emp=new ArrayList<Emp>();
	emp.add(new Emp(105, "India"));
	emp.add(new Emp(104,"Telangana"));
	emp.add(new Emp(106,"Telugu"));
	Emp e1 = emp.get(1);
	System.out.println(e1.eid+" ---"+e1.ename);
	
}
}
