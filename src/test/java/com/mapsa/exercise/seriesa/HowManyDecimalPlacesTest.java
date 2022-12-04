package com.mapsa.exercise.seriesa;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesa.d.HowManyDecimalPlacesAllahdadi;
import org.junit.Test;

import com.mapsa.exercise.seriesa.d.HowManyDecimalPlaces;

public class HowManyDecimalPlacesTest {

	 @Test
	  public void test1() {
	    assertEquals(2, HowManyDecimalPlacesAllahdadi.getDecimalPlaces("3.22"));
	  }

		@Test
	  public void test2() {
	    assertEquals(0, HowManyDecimalPlacesAllahdadi.getDecimalPlaces("400"));
	  }

		@Test
	  public void test3() {
	    assertEquals(2, HowManyDecimalPlacesAllahdadi.getDecimalPlaces("43.50"));
	  }

		@Test
	  public void test4() {
	    assertEquals(0, HowManyDecimalPlacesAllahdadi.getDecimalPlaces("100,000,000"));
	  }

		@Test
	  public void test5() {
	    assertEquals(4, HowManyDecimalPlacesAllahdadi.getDecimalPlaces("3.1415"));
	  }

		@Test
	  public void test6() {
	    assertEquals(0, HowManyDecimalPlacesAllahdadi.getDecimalPlaces("0"));
	  }

		@Test
	  public void test7() {
	    assertEquals(0, HowManyDecimalPlacesAllahdadi.getDecimalPlaces("01"));
	  }

		@Test
	  public void test8() {
	    assertEquals(5, HowManyDecimalPlacesAllahdadi.getDecimalPlaces("00010.00010"));
	  }

		@Test
	  public void test9() {
	    assertEquals(3, HowManyDecimalPlacesAllahdadi.getDecimalPlaces("3,141.592"));
	  }
}