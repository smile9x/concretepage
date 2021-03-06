package com.cuongnm2.concretepage.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparing {
	public static void main(String[] args) {
		List<Student> list = Student.getStudentList();
		Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);
		Collections.sort(list, ageComparator);
		list.forEach(s -> System.out.println("Name:" + s.getName() + " Age:" + s.getAge()));
		//Using reversed order for sorting
		System.out.println("--Using reversed order for sorting--");
		Collections.sort(list, ageComparator.reversed());
		list.forEach(s -> System.out.println("Name:" + s.getName() + " Age:" + s.getAge()));
	}
}
