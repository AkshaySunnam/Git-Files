package com.java.learning.day12.multiThreading.part1;

public class App {

	// main method represent main thread
	public static void main(String[] args) {
		// whatever we write in here will be executed by the main thread
		// Threads will always execute the jobs in a sequence
		//execution context
		
		//job1
		System.out.println("--APPLICATION STARTED--");

		// some code to print the document
		
		//job2
		for (int doc = 1; doc <= 5; doc++) {
			System.out.println("--Printing Document--" + doc);
		}

		//job3 
		System.out.println("--APPLICATION ENDED--");

	}

}
