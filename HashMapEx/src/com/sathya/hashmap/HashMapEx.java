package com.sathya.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapEx {
	 
	public static void main(String[] args) throws InterruptedException {
		ConcurrentHashMap<Integer, String> hashmap=new ConcurrentHashMap<>();
		hashmap.put(22, "aaa");
		hashmap.put(33, "bbb");
		hashmap.put(44, "ccc");
		HashMapEx hm=new HashMapEx();
		 
		for(Entry<Integer, String> i:hashmap.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
			Thread.sleep(2000);
			hashmap.put(55, "cccs");
		}
		System.out.println(hashmap);
	}
	
}
