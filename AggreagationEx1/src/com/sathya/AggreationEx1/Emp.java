package com.sathya.AggreationEx1;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

public class Emp {
	 int eid;
	 String ename;
	 double esal;
	 Address address;
	 Certificiates certificiates;
	 Parents parents;
	public Emp(int eid, String ename, double esal, Address address, Certificiates certificiates, Parents parents) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.address = address;
		this.certificiates = certificiates;
		this.parents = parents;
	}

	
	public static void main(String[] args) {
		Address addr= new Address(100, "Ameerpet", "Hyderabad");
		Certificiates crt = new Certificiates(10, 76, 74);
		Parents prnt = new Parents("GangaPrasad", "VijayaLaxmi");
		Emp emp=new Emp(111,"BhavnaniPrasad", 111.50, addr, crt, prnt);
		System.out.println(emp.eid+" "+emp.ename+" "+emp.esal);
		System.out.println(emp.address.doorno+" "+emp.address.street+" "+emp.address.city);
		System.out.println(emp.certificiates.ssc+" "+emp.certificiates.inter+" "+emp.certificiates.degree);
		System.out.println(emp.parents.fathername+"  "+emp.parents.mothername);
		
		System.out.println("***************************");
		
		Emp emp1= new Emp(222,"Gangaprasad", 250.78,new Address(12, "SRNagar","Hyderabad"), new Certificiates(90, 98, 99), new Parents("BuchiRajam", "Radhamma"));
	
		System.out.println(emp1.eid+" "+emp1.ename+" "+emp1.esal);
		System.out.println(emp1.address.doorno+" "+emp1.address.street+" "+emp1.address.city);
		System.out.println(emp1.certificiates.ssc+" "+emp1.certificiates.inter+" "+emp1.certificiates.degree);
		System.out.println(emp1.parents.fathername+"  "+emp1.parents.mothername);
		
		Set<Emp> emp5=Set.of(new Emp(50, "James", 9090.90,new Address(50,"Panjagutta", "Hyderabad"), new Certificiates(80, 80, 80),new Parents(".........",",,,,,,,,,,,")),emp1);
		emp5.forEach(i->System.out.println(i));
	}
}
