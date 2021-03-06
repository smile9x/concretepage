package com.cuongnm2.concretepage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RemoveIfDemo {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();    	
		list.add(new Person(1, "Mahesh"));
		list.add(new Person(2, "Ram"));
		list.add(new Person(3, "Krishna"));
		
		Consumer<Person> style = (Person p) -> System.out.println("id:" + p.getId() + ", Name:" + p.getName());
		System.out.println("---Before delete---");
		list.forEach(style);
		int pid = 2;
		Predicate<Person> personPredicate = p -> p.getId() == pid;
		list.removeIf(personPredicate);
		System.out.println("---After delete---");
		list.forEach(style);
	}
}
