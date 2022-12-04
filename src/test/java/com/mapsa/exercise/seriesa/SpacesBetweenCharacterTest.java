package com.mapsa.exercise.seriesa;

import static org.junit.Assert.assertEquals;

import com.mapsa.exercise.seriesa.m.SpacesBetweenCharacterAllahdadi;
import org.junit.Test;

import com.mapsa.exercise.seriesa.m.SpacesBetweenCharacter;

public class SpacesBetweenCharacterTest {
	@Test
	public void test1() {
		assertEquals("s p a c e", SpacesBetweenCharacterAllahdadi.spaceMeOut("space"));
	}

	@Test
	public void test2() {
		assertEquals("f a r   o u t", SpacesBetweenCharacterAllahdadi.spaceMeOut("far out"));
	}

	@Test
	public void test3() {
		assertEquals("e l o n g a t e d   m u s k", SpacesBetweenCharacterAllahdadi.spaceMeOut("elongated musk"));
	}

	@Test
	public void test4() {
		assertEquals("l o n g", SpacesBetweenCharacterAllahdadi.spaceMeOut("long"));
	}

	@Test
	public void test5() {
		assertEquals("1 2 3", SpacesBetweenCharacterAllahdadi.spaceMeOut("123"));
	}

	@Test
	public void test6() {
		assertEquals("a 1 b 2 c 3", SpacesBetweenCharacterAllahdadi.spaceMeOut("a1b2c3"));
	}
}