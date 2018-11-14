package com.zenika.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

	public String of(int number) {
		String result = "";
		if (number % 3 == 0) result += "fizz";
		if (number % 5 == 0) result += "buzz";
		return result.isEmpty() ? String.valueOf(number) : result;
	}

	public String run(int times) {
		return IntStream.rangeClosed(1, times).mapToObj(this::of).collect(Collectors.joining(" "));
	}

	public static void main(String[] args) {
		System.out.println(new FizzBuzz().run(100));
	}
}
