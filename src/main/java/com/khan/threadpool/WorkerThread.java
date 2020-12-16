package com.khan.threadpool;

import java.util.concurrent.BlockingQueue;

public class WorkerThread extends Thread {
	private BlockingQueue<Runnable> taskQueue;
	private boolean isStopped = false;

	public WorkerThread(BlockingQueue<Runnable> taskQueue) {
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		while (!isStopped) {
			Runnable task = null;
			try {
				task = taskQueue.take();
				task.run();
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	public void stopThread() {
		isStopped = true;
		this.interrupt();
	}
}
