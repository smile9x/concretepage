package com.cuongnm2.concretepage;

import java.util.Arrays;
import java.util.List;

public class StreamCollect {
	public static void main(String[] args) {
		/*
		List<Integer> list = Arrays.asList(3,5,6);
		int sum = list.stream().collect(Collectors.summingInt(i -> i));
		System.out.println("Sum: "+ sum);
		*/
		
		List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");
		String result = list.parallelStream().collect(StringBuilder::new,
				(response, element) -> response.append(" ").append(element),
				(response1, response2) -> response1.append(",").append(response2.toString())).toString();
		System.out.println("Result: " + result);
	}
}
