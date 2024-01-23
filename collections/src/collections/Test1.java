package collections;

import java.util.Enumeration;
import java.util.Vector;

public class Test1 {
public static void main(String[] args) {
	Vector<String> objs=new Vector<String>();
	objs.add("Nagaram");
	objs.add("Bhimaram");
	objs.add("Pocharam");
	objs.add("Nacharam");
	Enumeration<String> etr=objs.elements();
	while(etr.hasMoreElements())
	{
		String village =etr.nextElement();
		System.out.println(village);
		
	}

}
}
