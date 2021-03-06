package com.concretepage.lambda;

import java.util.ArrayList;
import java.util.List;

public class FunctionDemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ram", 20));
		list.add(new Student("Shyam", 22));
		list.add(new Student("Kabir", 18));
		for (Student st : list) {
			System.out.println(st.customShow(s -> s.getName() + ": " + s.getAge()));
		}
	}
}
