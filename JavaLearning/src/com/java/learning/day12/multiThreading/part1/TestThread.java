package com.java.learning.day12.multiThreading.part1;

public class TestThread {

	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample("Thread1");
		t1.start();
		ThreadExample t2 = new ThreadExample("Thread2");
		t2.start();

	}

}
