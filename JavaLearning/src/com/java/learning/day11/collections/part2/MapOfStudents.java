package com.java.learning.day11.collections.part2;

import java.util.HashMap;

public class MapOfStudents {

	public static void main(String[] args) {
HashMap<Integer,Student> studentmap = new HashMap<Integer,Student>();

Student student1 = new Student();
student1.setId(1);
student1.setName("Akshay");
student1.setCity("Hyderbad");
studentmap.put(1,student1);

Student student2 = new Student();
student2.setId(2);
student2.setName("Kavya");
student2.setCity("Vikarabad");
studentmap.put(2,student2);

Student student3 = new Student();
student3.setId(3);
student3.setName("Chukku");
student3.setCity("LH");
studentmap.put(3,student3);
	}

}
