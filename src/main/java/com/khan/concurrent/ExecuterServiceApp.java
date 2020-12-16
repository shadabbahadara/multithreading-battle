package com.khan.concurrent;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterServiceApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> future = service.submit(() -> {
			System.out.println(Thread.currentThread().getName() + "running");
			return new Random().nextInt();
		});

//		System.out.println(future.get());
		System.out.println("unrelated ");
		Thread.sleep(500);
		System.out.println("main thread");
		service.shutdown();

	}

}
