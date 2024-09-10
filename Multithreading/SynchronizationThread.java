package com.Multithreading;

class Car implements Runnable{
// synchronized method
/*	@Override
	synchronized public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" Has entered to the parking lot");
			Thread.sleep(2000);	
			System.out.println(Thread.currentThread().getName()+" Found Car and got into it to drive");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" Started to drive the Car");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" Came back and park");
			Thread.sleep(2000);
		} 
*/
//synchronized block
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" Has entered to the parking lot");
			Thread.sleep(2000);	
			synchronized (this)
			{
				System.out.println(Thread.currentThread().getName()+" Found Car and got into it to drive");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" Started to drive the Car");
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName()+" Came back and park");
			}
		}
		catch (Exception e) {
			System.out.println("Some problem");
		}
	}
}
public class SynchronizationThread {
	public static void main(String[] args) {
		Car c = new Car();
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		
		t1.setName("Son-1");
		t2.setName("Son-2");
		t3.setName("Son-3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
