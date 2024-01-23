package collections3;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
public class Hashmapex {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> objs=new LinkedHashMap<String, Integer>();
	objs.put("gujjri", 2);
	objs.put("Bhavani", 3);
	objs.put("prasad", 4);
	objs.put("india", 0);

	Set<String> names= objs.keySet();
	System.out.println(names);
	
	Collection<Integer> i=objs.values();
	System.out.println(i);
	
	Set<java.util.Map.Entry<String, Integer>> entries =objs.entrySet();
	
	for(java.util.Map.Entry<String,Integer> entry :entries)
	{
		String key=entry.getKey();
		Integer value=entry.getValue();
		System.out.println(key+"  "+value);
	}

}
}
