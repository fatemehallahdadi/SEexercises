package com.mapsa.exercise.seriesb;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesb.b.NameShuffleAllahdadi;
import org.junit.Test;



public class NameShuffleTest {
	
	
	  @Test
	  public void test1() {
	    assertEquals("Trump Donald", NameShuffleAllahdadi.nameShuffle("Donald Trump"));
	  }
		
		@Test
	  public void test2() {
	    assertEquals("O'Donnel Rosie", NameShuffleAllahdadi.nameShuffle("Rosie O'Donnel"));
	  }
		
		@Test
	  public void test3() {
	    assertEquals("Butts Seymour", NameShuffleAllahdadi.nameShuffle("Seymour Butts"));
	  }
		
		@Test
	  public void test4() {
	    assertEquals("Greene Ebony", NameShuffleAllahdadi.nameShuffle("Ebony Greene"));
	  }
		
		@Test
	  public void test5() {
	    assertEquals("Kennedy Ken", NameShuffleAllahdadi.nameShuffle("Ken Kennedy"));
	  }
		
		@Test
	  public void test6() {
	    assertEquals("Gonzalez Allison", NameShuffleAllahdadi.nameShuffle("Allison Gonzalez"));
	  }
		
		@Test
	  public void test7() {
	    assertEquals("Frazier Albert", NameShuffleAllahdadi.nameShuffle("Albert Frazier"));
	  }
		
		@Test
	  public void test8() {
	    assertEquals("Hopkins Eloise", NameShuffleAllahdadi.nameShuffle("Eloise Hopkins"));
	  }
		
		@Test
	  public void test9() {
	    assertEquals("Welch Donnie", NameShuffleAllahdadi.nameShuffle("Donnie Welch"));
	  }
		
		@Test
	  public void test10() {
	    assertEquals("Thomas Vernon", NameShuffleAllahdadi.nameShuffle("Vernon Thomas"));
	  }

}
