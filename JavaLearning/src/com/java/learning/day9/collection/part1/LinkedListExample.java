package com.java.learning.day9.collection.part1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
LinkedList namelist=new LinkedList();
namelist.add("Akshay");
namelist.add("kavya");
namelist.add("rintu");
namelist.add("chukku");

namelist.add(1,"chukku");
namelist.remove("rintu");
namelist.add(null);


System.out.println("the size of the name list----->"+namelist.size());

Iterator iterator = namelist.iterator();
while(iterator.hasNext()) {
	System.out.println("the namelist is ---->"+iterator.next());
	
}

	}

}
