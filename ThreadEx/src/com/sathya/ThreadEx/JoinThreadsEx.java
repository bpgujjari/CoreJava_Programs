package com.sathya.ThreadEx;

class Threads1 extends Thread{
	@Override
	public void run() {
		System.out.println("this is thread 1....");
		System.out.println("..................");
	}
}
class Threads2 extends Thread{
	@Override
	public void run() {
		System.out.println("this is thread 2....");
		System.out.println("..................");

	}
}class Threads3 extends Thread{
	@Override
	public void run() {
		System.out.println("this is thread 3....");
		System.out.println("..................");

	}
}
class Threads4 extends Thread{
	@Override
	public void run() {
		System.out.println("this is thread 4....");
		System.out.println("..................");

	}
}
class Threads5 extends Thread{
	@Override
	public void run() {
		System.out.println("this is thread 5....");
		System.out.println("..................");

	}
}
public class JoinThreadsEx 
{
public static void main(String[] args) throws InterruptedException 
{
	Threads1 t1=new Threads1();
	t1.start();
	Threads2 t2=new Threads2();
	t2.start();
	Threads3 t3=new Threads3();
	t3.start();
	Threads4 t4=new Threads4();
	t4.start();
	Threads5 t5=new Threads5();
	t5.start();

}
}
