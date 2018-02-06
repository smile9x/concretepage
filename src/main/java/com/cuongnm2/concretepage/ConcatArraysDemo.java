package com.cuongnm2.concretepage;

import java.util.stream.Stream;

public class ConcatArraysDemo {
	public static void main(String[] args) {
		Book[] bk1 = new Book[3];
		Book[] bk2 = new Book[3];
		{
			bk1[0] = new Book("1 Core Java", 200);
			bk1[1] = new Book("2 Spring MVC", 300);
			bk1[2] = new Book("3 Learning Freemarker", 150);
			bk2[0] = new Book("1 Core Java", 200);
			bk2[1] = new Book("2 Spring MVC", 300);
			bk2[2] = new Book("4 Learning Hibernate", 400);
		}
		Book[] bks = (Book[]) Stream.concat(Stream.of(bk1), Stream.of(bk2)).toArray(b -> new Book[b]);
		for (Book b : bks) {
			System.out.println(b.getName() + ", " + b.getPrice());
		}

		// Remove duplicates using distinct()
		System.out.println("--Remove duplicates using distinct()--");
		bks = (Book[]) Stream.concat(Stream.of(bk1), Stream.of(bk2)).distinct().toArray(b -> new Book[b]);
		for (Book b : bks) {
			System.out.println(b.getName() + ", " + b.getPrice());
		}
	}
}
