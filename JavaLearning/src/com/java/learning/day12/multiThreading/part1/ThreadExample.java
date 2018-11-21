package com.java.learning.day12.multiThreading.part1;

public class ThreadExample extends Thread{
	private Thread t;
	private String threadName;
	
	ThreadExample(String Name){
		threadName= Name;
		System.out.println("creating ---->"+ threadName);
		
	}

    @Override
	public void run() {
    	System.out.println("Running thread--->"+ threadName);
    	for(int i=0;i<5;i++) {
    		System.out.println("Thread"+ threadName + "the value is-->"+i);
    		
    		
    	}

	}

}
