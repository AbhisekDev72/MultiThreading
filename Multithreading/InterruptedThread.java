package com.Multithreading;

class Example implements Runnable {
	@Override
	public void run() {
		try {
			for(int i=0;i<3;i++){
				System.out.println("Focus is important");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println("Thread Interrupted");
		}	
	}
}
public class InterruptedThread {
	public static void main(String[] args) {
		Example ex = new Example();
		Thread t1 = new Thread(ex);
		t1.start();
		t1.interrupt();
	}
}
