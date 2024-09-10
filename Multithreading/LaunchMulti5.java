package com.Multithreading;

import java.util.Scanner;

class Calc1 implements Runnable{
	@Override
	public void run() {
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
}
class Message1 implements Runnable{
	@Override
	public void run() {
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
public class LaunchMulti5 {
	public static void main(String[] args) {
		System.out.println("Main Thread"); 
		Calc c1 = new Calc();
		Message m1 = new Message();
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(m1);
		
		t1.start();
		t2.start();
	}
}
