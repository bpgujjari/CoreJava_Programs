package com.sathya.ThreadEx;

class Greeting{
	static  synchronized void  greet(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Good morning ....."+name);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
	}
}
class MyThread1 extends Thread
{
	@Override
	public void run() {
		Greeting.greet("gujjari");
	}
}

class MyThread2 extends Thread
{
	@Override
	public void run() {
		Greeting.greet("bhavani");
	}
}

class MyThread3 extends Thread
{
	@Override
	public void run() {
		Greeting.greet("prasad");
	}
}
public class SynchronizedTest {
public static void main(String[] args) {
	MyThread1 t1= new MyThread1();
	t1.setPriority(9);
	t1.setName("thread............1");
	t1.start();
	MyThread2 t2= new MyThread2();
	t2.setName("thread............2");
	t2.setPriority(6);
	t2.start();
	MyThread3 t3= new MyThread3();
	t3.setPriority(3);
	t3.setName("thread............3");
	t3.start();
	
	Thread.currentThread().setName("main Thread...");
	Thread.currentThread().setPriority(10);
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
	
}
}
