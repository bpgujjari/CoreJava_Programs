package com.sathya.ThreadEx;
class DomenThread2 extends Thread
{
@Override
public void run()
{
	for (int i=1;i<=5;i++)
	{
		System.out.println("Thread is running ..."+Thread.currentThread().isAlive());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
 }	
}
public class DemonThreadEx1 {
public static void main(String[] args) throws InterruptedException {
	DomenThread2 t=new DomenThread2();
	System.out.println(t.isAlive());
	t.start();
	Thread.sleep(10000);
	System.out.println("Thread after 10 sec..."+t.isAlive());

}
}
