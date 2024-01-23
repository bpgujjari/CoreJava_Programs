package com.sathya.coll;

public class Emp {
 public Integer eid;
 public String ename;
 public Double esal;
 public Integer dept;
 public String location;
public Emp(Integer eid, String ename, Double esal, Integer dept, String location) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
	this.dept = dept;
	this.location = location;
}
@Override
public String toString() {
	return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", dept=" + dept + ", location=" + location
			+ "]";
}
}
