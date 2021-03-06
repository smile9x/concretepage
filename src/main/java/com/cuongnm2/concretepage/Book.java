package com.cuongnm2.concretepage;

public class Book {
	private int id;
	private String name;
	private int price;

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Book(int id, int price, String name) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void print() {
		System.out.println("id:" + id + ", Name:" + name);
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		final Book book = (Book) obj;
		if (this == book) {
			return true;
		} else {
			return (this.name.equals(book.name) && this.price == book.price);
		}
	}

	@Override
	public int hashCode() {
		int hashno = 7;
		hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
		return hashno;
	}
}
