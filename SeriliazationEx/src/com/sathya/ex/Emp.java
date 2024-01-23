package com.sathya.ex;

import java.io.Serializable;

public class Emp implements Serializable{
	transient int eid;
	transient String ename;
	transient double esal;
public Emp(int eid, String ename,double esal)
{
this.eid=eid;
this.ename=ename;
this.esal=esal;
}
}
