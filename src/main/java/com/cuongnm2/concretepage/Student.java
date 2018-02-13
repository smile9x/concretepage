package com.cuongnm2.concretepage;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int age;
	private String className;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student(String name,Integer age, String className){
        this.name=name;
        this.age=age;
        this.className = className;
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.getName());
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		final Student std = (Student) obj;
		if (this == std) {
			return true;
		} else {
			return (this.name.equals(std.name) && (this.age == std.age));
		}
	}

	@Override
	public int hashCode() {
		int hashno = 7;
		hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
		return hashno;
	}
}
