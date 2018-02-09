package com.cuongnm2.concretepage;

import java.util.ArrayList;
import java.util.List;

public class User implements Comparable<User> {
	private int id;
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "Dinesh", 20));
		list.add(new User(2, "Kamal", 15));
		list.add(new User(3, "Vijay", 25));
		list.add(new User(4, "Ramesh", 30));
		list.add(new User(5, "Mahesh", 18));
		return list;
	}
	
	public static User[] getUsers2() {
		User[] users = new User[6];
		users[0] = new User ("Ram", 25);
		users[1] = new User ("Shyam", 22);
		users[2] = new User ("Mohan", 21);
		users[3] = new User ("Suresh", 30);
		users[4] = new User ("Ramesh", 20);
		users[5] = new User ("Dinesh", 27);
		return users;
	}
	
	@Override
	public int compareTo(User user) {
		return name.compareTo(user.name);
	}
}
