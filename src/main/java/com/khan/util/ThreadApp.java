package com.khan.util;

public class ThreadApp {
	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + " started");

		Thread thread = new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " started");
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + " finished");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		thread.start();

		System.out.println(Thread.currentThread().getName() + " finished");

	}
}
