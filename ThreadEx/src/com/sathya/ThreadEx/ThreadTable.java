package com.sathya.ThreadEx;

class ThreadTable1 extends Thread
{	int n;
	public ThreadTable1(int n) {
		this.n=n;
	}
	@Override
		public synchronized void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadTable {
	public static void main(String[] args) {
		ThreadTable1 t= new ThreadTable1(5);
		t.setPriority(10);
		t.start();
		
		ThreadTable1 t1= new ThreadTable1(10);
		t1.setPriority(1);
		t1.start();
	
	}	
}
