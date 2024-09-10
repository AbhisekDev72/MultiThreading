package com.Multithreading;

class Demo implements Runnable{
	@Override
	public void run() {
		System.out.println("Child thread Executing"); // Thread is in Runnable state
		try {
			Thread.sleep(3000);                       //Thread is in Blocked state
		} catch (Exception e) {
			System.out.println("Some problem");
		}
		System.out.println("Child thread task executed"); //Thread Dead after this
	}
}
public class ThreadCycle {
	public static void main(String[] args) {
		System.out.println("Main Thread Started");
		Demo d = new Demo();
		Thread t1 = new Thread(d); //Thread is in New state
		t1.start();                //Thread is in Running state
	}
}
