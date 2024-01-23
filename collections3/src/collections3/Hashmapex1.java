package collections3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapex1 {
public static void main(String[] args) {
	LinkedHashMap<Integer, Customer> objs=new LinkedHashMap<Integer, Customer>();
	objs.put(1, new Customer(111, "Bhavani", "bpgujjari@123", 9099987879l));
	objs.put(2, new Customer(121, "Bhavani1", "11bpgujjari@1234", 9898989898l));
	objs.put(3, new Customer(101, "Bhavani2", "bpgujjari@12345", 90999878709l));
	objs.put(4, new Customer(191, "Bhavani3", "bpgujjari@123456", 909998780098l));
	
	Set<Entry<Integer, Customer>> entries = objs.entrySet();
	for(Entry<Integer, Customer> entry : entries)
	{
		Integer slno=entry.getKey();
		Customer cust =entry.getValue();
		System.out.println(slno+"--->"+cust.cid+" "+cust.cname+" "+cust.email+" "+cust.mblno);
	}
}
}
