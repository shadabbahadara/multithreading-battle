package com.khan.thread;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread t1 = new MyThread();
//		t1.start();
//		Thread t2 = new Thread(new RunnableThread());
//		t2.start();
		Thread t3 = new Thread(() -> {
			System.out.println(Thread.currentThread());
			System.out.println("inside runnable using lambda...");
		});
		System.out.println(t3.getPriority());
		t3.start();
	}
}
