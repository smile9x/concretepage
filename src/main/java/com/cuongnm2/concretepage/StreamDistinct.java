package com.cuongnm2.concretepage;

import java.util.Arrays;
import java.util.List;

public class StreamDistinct {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 6, 6, 4);
		System.out.println("Distinct Count: " + list.stream().distinct().count());
	}
}
