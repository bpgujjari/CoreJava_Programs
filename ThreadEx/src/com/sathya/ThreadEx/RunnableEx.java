package com.sathya.ThreadEx;
class RunnableExm implements Runnable
{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Runnable Thread..."+Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableEx {
public static void main(String[] args) {
	//Thread t= new Thread(new RunnableExm());
	//t.start();
	//new Thread(()->System.out.println("Thread...........")).start();
	new Thread(new RunnableExm ()).start();
}
}
