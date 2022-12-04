package com.mapsa.exercise.seriesb;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesb.d.FizzBuzzAllahdadi;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test1() {
		assertEquals(FizzBuzzAllahdadi.fizzBuzz(3), "Fizz");
	}

	@Test
	public void test2() {
		assertEquals(FizzBuzzAllahdadi.fizzBuzz(5), "Buzz");
	}

	@Test
	public void test3() {
		assertEquals(FizzBuzzAllahdadi.fizzBuzz(15), "FizzBuzz");
	}

	@Test
	public void test4() {
		assertEquals(FizzBuzzAllahdadi.fizzBuzz(10), "Buzz");
	}

	@Test
	public void test5() {
		assertEquals(FizzBuzzAllahdadi.fizzBuzz(98), "98");
	}

}
