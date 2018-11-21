package com.java.learning.day9.collection.part1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstExample {

	public static void main(String[] args) {
ArrayList Arraylist=new ArrayList();
Arraylist.add("1");
Arraylist.add("2");
Arraylist.add("3");
Arraylist.add("4");
Arraylist.add("5");
Arraylist.add("2");
Arraylist.add("3");
Arraylist.add("4");
Arraylist.add("5");
Arraylist.add("2");
Arraylist.add("3");
Arraylist.add("4");
Arraylist.add("5");

Iterator Iterator = Arraylist.iterator();
System.out.println("I want element for 3rd location---->"+Arraylist.get(3));

while(Iterator.hasNext()) {
	System.out.println("Elements in the number list are------->" + Iterator.next());
}

System.out.println("Size of the ArrayList---->"+ Arraylist.size());

	}

}
