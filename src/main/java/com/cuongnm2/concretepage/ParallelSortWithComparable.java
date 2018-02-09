package com.cuongnm2.concretepage;

import java.util.Arrays;
import java.util.function.Consumer;

public class ParallelSortWithComparable {
	public static void main(String[] args) {
		Consumer<User> printUser = u -> System.out.println(u.getName() + " - " + u.getAge());
		User[] users = User.getUsers2();
		Arrays.stream(users).forEach(printUser);
		System.out.println("--Sort complete array--");
		Arrays.parallelSort(users);
		Arrays.stream(users).forEach(printUser);
		System.out.println("--Sort array from index 1 to 4--");
		users = User.getUsers2();
		Arrays.parallelSort(users, 1, 5);
		Arrays.stream(users).forEach(printUser);
	}
}
