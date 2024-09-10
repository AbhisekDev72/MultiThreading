package com.Multithreading;

class Printing implements Runnable{
	@Override
	public void run() {
		try {
			for(int i=0;i<2;i++) {
				System.out.println("Focus is important");
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			System.out.println("Some problem");
		}
	}
}
public class JoinAlive {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread started");
		Printing p = new Printing();
		Thread t1 = new Thread(p);
		System.out.println(t1.isAlive()); //t1 is not alive until start() method will invoke
		
		t1.start();
		System.out.println(t1.isAlive());
		t1.join();          //Main thread will wait until or unless t1 thread finished his work
		
		System.out.println("Main Thread task finished");
	}
}
