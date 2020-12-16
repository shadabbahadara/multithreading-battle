package com.khan.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceApp {
	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
		service.scheduleAtFixedRate(new Task(), 10, 10, TimeUnit.SECONDS);
	}
}

class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("executing task..");
	}

}
