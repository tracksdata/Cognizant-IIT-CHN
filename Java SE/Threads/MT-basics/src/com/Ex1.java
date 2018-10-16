package com;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class House {

	private static Object key = new Object();

	public void m1() {
		synchronized (key) {

			String name = Thread.currentThread().getName();
			System.out.println(name + " House (m1)");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + " exiting (m1)");
		}
	}

	public void m2() {
		synchronized (key) {

			String name = Thread.currentThread().getName();
			System.out.println(name + " House (m2)");
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " exiting (m2)");
		}
	}
}

public class Ex1 {
	public static void main(String[] args) {

		House house1 = new House();
		House house2 = new House();
		Runnable task1 = () -> house1.m1();
		Runnable task2 = () -> house2.m2();

		ExecutorService executorService = Executors.newFixedThreadPool(4);
		executorService.execute(task1);
		executorService.execute(task1);
		executorService.execute(task2);

	}

}
