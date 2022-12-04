package com.mapsa.exercise.seriesa;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.mapsa.exercise.seriesa.e.IsAverageWholeNumberAllahdadi;
import org.junit.Test;

import com.mapsa.exercise.seriesa.e.IsAverageWholeNumber;

public class IsAverageWholeNumberTest {	
	@Test 
	public void test1() {
		assertFalse(IsAverageWholeNumberAllahdadi.isAvgWhole(new int[]{3, 5, 9}));
	}
	
	@Test 
	public void test2() {
		assertTrue(IsAverageWholeNumberAllahdadi.isAvgWhole(new int[]{1, 1, 1, 1}));
	}
		
	@Test 
	public void test3() {
		assertTrue(IsAverageWholeNumberAllahdadi.isAvgWhole(new int[]{1, 2, 3, 4, 5}));
	}
	
	@Test 
	public void test4() {
		assertFalse(IsAverageWholeNumberAllahdadi.isAvgWhole(new int[]{5, 2, 4}));
	}
	
	@Test 
	public void test5() {
		assertFalse(IsAverageWholeNumberAllahdadi.isAvgWhole(new int[]{11, 22}));
	}
	
	@Test 
	public void test6() {
		assertFalse(IsAverageWholeNumberAllahdadi.isAvgWhole(new int[]{4, 1, 7, 9, 2, 5, 7, 2, 4}));
	}
}