package com.sathya.hashmap;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx3 extends Thread{
	static ConcurrentHashMap<Integer, String> names = new ConcurrentHashMap<>();
	@Override
	public void run() {
		names.put(1, "Gorang");
		names.put(2, "Vijay");
		names.put(3, "Prem");
	}
	public static void main(String[] args) {
		ConcurrentHashMapEx3 c = new ConcurrentHashMapEx3();
		c.start();
		names.put(4, "Ratan");
		names.put(5, "Sathya");
		names.put(6, "Anu");
		for(Entry<Integer, String> entry:names.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
