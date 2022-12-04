package com.mapsa.exercise.seriesa;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesa.n.RepeatingLettersNTimesAllahdadi;
import org.junit.Test;

import com.mapsa.exercise.seriesa.n.RepeatingLettersNTimes;

public class RepeatingLettersNTimesTest {
	  @Test
	  public void test1() {
	    assertEquals("mmmmmiiiiiccccceeeee", RepeatingLettersNTimesAllahdadi.repeat("mice", 5));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("hhheeellllllooo", RepeatingLettersNTimesAllahdadi.repeat("hello", 3));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("stop", RepeatingLettersNTimesAllahdadi.repeat("stop", 1));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("ttoommaattoo", RepeatingLettersNTimesAllahdadi.repeat("tomato", 2));
	  }
}