package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
public static void main(String[] args) {
	ArrayList<Emp> objs=new ArrayList<Emp>();
	objs.add(new Emp(12, "Rathan"));
	objs.add(new Emp(13, "Dhoni"));
	objs.add(new Emp(14, "Virat"));
	objs.add(new Emp(15, "Rudra"));
	
	Iterator<Emp> itr=objs.iterator();
	
	while(itr.hasNext())
	{
		Emp obj=itr.next();
		System.out.println(obj.eid+"  "+obj.ename);
	}
}
}
