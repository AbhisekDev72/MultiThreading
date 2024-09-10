package com.Multithreading;

class Library implements Runnable{
	String res1 = new String("JAVA");
	String res2 = new String("SQL");
	String res3 = new String("DSA");
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("Student1")) {
			try {
				Thread.sleep(3000);
				synchronized (res1) {
					System.out.println("Student1 has acquired "+res1);
					Thread.sleep(3000);
					synchronized (res2) {
						System.out.println("Stydent1 has acquired "+res2);
						Thread.sleep(3000);
						synchronized (res3) {
							System.out.println("Student1 has acquired "+res3);
							Thread.sleep(3000);
						}
					}
				}
			} catch (Exception e) {
				System.out.println("Some Problem");
			}
		}
		else {
			try {
				Thread.sleep(3000);
				synchronized (res3) {
					System.out.println("Student2 has acquired "+res3);
					Thread.sleep(3000);
					synchronized (res2) {
						System.out.println("Stydent2 has acquired "+res2);
						Thread.sleep(3000);
						synchronized (res1) {
							System.out.println("Student2 has acquired "+res1);
							Thread.sleep(3000);
						}
					}
				}
			} catch (Exception e) {
				System.out.println("Some Problem");
			}
		}
	}
}
public class DeadLock {
	public static void main(String[] args) {
		Library lib = new Library();
		Thread t1 = new Thread(lib);
		Thread t2 = new Thread(lib);
		
		t1.setName("Student1");
		t2.setName("Student2");
		
		t1.start();
		t2.start();
	}
}
