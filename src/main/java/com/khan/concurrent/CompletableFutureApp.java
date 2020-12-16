package com.khan.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureApp {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = new CompletableFuture<>();
		System.out.println("after future");
	}
}
