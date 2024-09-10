package com.Multithreading;
/*
 It is possible to Achieve Multi-threading using single run() method...
*/
import java.util.Scanner;

class MyThread1 extends Thread{
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		if (tName.equals("Calc")) {
			calc();
		}
		else {
			importantMesg();
		}
	}
	public void calc(){
		System.out.println("Calculation task started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println(res);
		System.out.println("Calculation task ended");
		System.out.println("*****************************************");
	}
	public void importantMesg() {
		System.out.println("Displaying important Message task");
		try {
			for(int i=0;i<4;i++) {
				System.out.println("Focus is important to master skills");
				Thread.sleep(2000);
			}
		}
		catch (Exception e) {
			System.out.println("Somethhing wentb wrong");
		} 
		System.out.println("Displaying important Message task ended");
	}
}

public class LunchMulti6 {
	public static void main(String[] args) {
		System.out.println("Main Thread");
		MyThread1 thread1 = new MyThread1();
		MyThread1 thread2 = new MyThread1();
		
		thread1.setName("Calc");
		thread2.setName("Print");
		thread1.start();
		thread2.start();
	}
}
