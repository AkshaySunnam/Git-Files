package com.java.learning.day12.multiThreading.part1;

public class A {
	private int i;

	A(int a, int b) {
		System.out.println("A and B values are " + a + " " + b);
	}
	public void printName() {
		System.out.println("im in printname method---->");
	}


		

	public static void main(String[] args) {
A a=new A(10,11);
	System.out.println("I value is "+a.i);
	a.printName();
	}
}
	




