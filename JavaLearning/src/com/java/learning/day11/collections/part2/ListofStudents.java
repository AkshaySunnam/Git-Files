package com.java.learning.day11.collections.part2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListofStudents {

	public static void main(String[] args) {
		
		ArrayList<Student> studentlist = new ArrayList<Student>();


		//ArrayList studentlist = new ArrayList();

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Akshay");
		student1.setCity("Hyderbad");
		studentlist.add(student1);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Kavya");
		student2.setCity("Vikarabad");
		studentlist.add(student2);

		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Chukku");
		student3.setCity("LH");
		studentlist.add(student3);

		Iterator it = studentlist.iterator();
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println(
					"Student details are " + student.getId() + "   " + student.getName() + "    " + student.getCity());

		}

	}

}
