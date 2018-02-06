package com.cuongnm2.concretepage;

import java.util.Arrays;

public class StreamReduce {
	public static void main(String[] args) {
		int[] array = { 3, 7 };
		int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
		System.out.println("Sum:" + sum);
	}
}
