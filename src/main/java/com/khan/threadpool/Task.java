package com.khan.threadpool;

public class Task implements Runnable {
	private int taskNumber;

	public Task(int taskNumber) {
		this.taskNumber = taskNumber;
	}

	@Override
	public void run() {
		System.out
				.println(Thread.currentThread().getName() + "->" + "TASK[" + taskNumber + "]: " + "executing task...");
	}

}
