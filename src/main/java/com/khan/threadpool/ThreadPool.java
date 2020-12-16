package com.khan.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

	private List<WorkerThread> threadPool;

	private BlockingQueue<Runnable> taskQueue;

	private boolean isStopped = false;

	public ThreadPool(long noOfThreads, int maxTasks) {
		threadPool = new ArrayList<>();
		taskQueue = new ArrayBlockingQueue<>(maxTasks);
		for (int i = 1; i <= noOfThreads; i++) {
			WorkerThread thread = new WorkerThread(taskQueue);
			threadPool.add(thread);
			thread.start();
		}
	}

	public synchronized void execute(Runnable task) throws InterruptedException {
		if (this.isStopped)
			throw new IllegalStateException("Thread Pool is stopped!");
		else
			taskQueue.put(task);
	}

	public synchronized void shutdown() {
		for (WorkerThread thread : threadPool) {
			thread.stopThread();
		}
		this.isStopped = true;
	}

}
