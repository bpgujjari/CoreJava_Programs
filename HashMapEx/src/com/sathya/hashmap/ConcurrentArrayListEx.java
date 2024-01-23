package com.sathya.hashmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayListEx extends Thread {
	static CopyOnWriteArrayList<String> l= new 
									CopyOnWriteArrayList<String>();
public void run()
{	l.add("D");}
public static void main(String[] args)throws InterruptedException
{	l.add("A");
    l.add("B");
    l.add("c");
    ConcurrentArrayListEx t = new ConcurrentArrayListEx();
    t.start();
    Iterator<String> itr = l.iterator();
    while (itr.hasNext()) {
        String s = (String)itr.next();
        System.out.println(s);
    }
    System.out.println(l);
}
}
