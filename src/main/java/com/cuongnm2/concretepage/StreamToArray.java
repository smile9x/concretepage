package com.cuongnm2.concretepage;

import java.util.Arrays;
import java.util.List;

public class StreamToArray {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "D");
		Object[] array = list.stream().toArray();
		System.out.println("Length of array: " + array.length);
	}
}
