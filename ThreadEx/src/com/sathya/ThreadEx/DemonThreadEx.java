package com.sathya.ThreadEx;

class MyThreadDmon extends Thread
{
	@Override
	public void run() {
		for (int i=1;i<=10;i++)
		{
			System.out.println("This is daemon thread...."+Thread.currentThread().isAlive()+"...."+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DemonThreadEx {
public static void main(String[] args) {
	MyThreadDmon t1= new MyThreadDmon();
	t1.setName("demon Thread..");
	t1.setDaemon(true);
	t1.start();
	for(int i=1;i<2;i++)
	{
		System.out.println("Thread.currentThread().isAlive()");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}
