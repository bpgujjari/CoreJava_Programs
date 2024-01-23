package com.sathya.ThreadEx;

class MyThread extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("thread.........."+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}}
}

public class ThreadEx {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		}
}
