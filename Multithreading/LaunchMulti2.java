package com.Multithreading;

public class LaunchMulti2 {
	public static void main(String[] args) {
		System.out.println("Main Thread");
		System.out.println("Before changing");
		String name = Thread.currentThread().getName();
		System.out.println("The name of the thread is : "+ name);
		System.out.println("The priority of main is "+Thread.currentThread().getPriority());
		
		System.out.println("After changing");
		Thread t = Thread.currentThread();
		t.setName("PW");
		t.setPriority(1);
		String name1 = Thread.currentThread().getName();
//	or
//		String name1 = t.getName();
		System.out.println("The name of the thread is : "+ name1);
		System.out.println("The priority of the thread is "+Thread.currentThread().getPriority());		
//	or
//		System.out.println("The priority of the thread is "+t.getPriority());		
	}
}
