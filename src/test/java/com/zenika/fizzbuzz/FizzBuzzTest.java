package com.zenika.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {
	private FizzBuzz fizzBuzz;
	
	@BeforeEach
	void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@DisplayName("fizzbuzz of")
	@ParameterizedTest(name = "{0} should be \"{1}\"")
	@CsvSource({"1, 1", "2, 2", "3, fizz", "5, buzz", "6, fizz", "10, buzz", "15, fizzbuzz"})
	void of_number_should_be_expected(int number, String expected) {
		assertEquals(expected, fizzBuzz.of(number));
	}
	
	@Test
	void run_100_times() {
		assertEquals("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz fizz 22 23 fizz buzz 26 fizz 28 29 fizzbuzz "
				+ "31 32 fizz 34 buzz fizz 37 38 fizz buzz 41 fizz 43 44 fizzbuzz 46 47 fizz 49 buzz fizz 52 53 fizz buzz 56 fizz 58 59 fizzbuzz "
				+ "61 62 fizz 64 buzz fizz 67 68 fizz buzz 71 fizz 73 74 fizzbuzz 76 77 fizz 79 buzz fizz 82 83 fizz buzz 86 fizz 88 89 fizzbuzz "
				+ "91 92 fizz 94 buzz fizz 97 98 fizz buzz", fizzBuzz.run(100));
	}
}