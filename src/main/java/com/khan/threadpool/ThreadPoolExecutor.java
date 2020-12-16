package com.khan.threadpool;

public class ThreadPoolExecutor {
	public static void main(String[] args) throws InterruptedException {

		ThreadPool threadPool = new ThreadPool(2, 2);
		for (int i = 1; i <= 10; i++) {
			Task task = new Task(i);
			threadPool.execute(task);
		}
		threadPool.shutdown();
	}
}
