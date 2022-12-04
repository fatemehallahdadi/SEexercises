package com.mapsa.exercise.seriesa;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesa.i.FactorChainAllahdadi;
import org.junit.Test;

import com.mapsa.exercise.seriesa.i.FactorChain;

public class FactorChainTest {
	@Test
	public void test1() {
		assertEquals(FactorChainAllahdadi.factorChain(new int[] { 1, 2, 4, 8, 16, 32 }), true);
	}

	@Test
	public void test2() {
		assertEquals(FactorChainAllahdadi.factorChain(new int[] { 1, 1, 1, 1, 1, 1 }), true);
	}

	@Test
	public void test3() {
		assertEquals(FactorChainAllahdadi.factorChain(new int[] { 2, 4, 6, 7, 12 }), false);
	}

	@Test
	public void test4() {
		assertEquals(FactorChainAllahdadi.factorChain(new int[] { 10, 1 }), false);
	}

	@Test
	public void test5() {
		assertEquals(FactorChainAllahdadi.factorChain(new int[] { 10, 20, 30, 40 }), false);
	}

	@Test
	public void test6() {
		assertEquals(FactorChainAllahdadi.factorChain(new int[] { 10, 20, 40 }), true);
	}

	@Test
	public void test7() {
		assertEquals(FactorChainAllahdadi.factorChain(new int[] { 1, 1, 1, 1, 7, 49 }), true);
	}
}