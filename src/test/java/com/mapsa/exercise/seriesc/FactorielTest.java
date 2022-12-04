package com.mapsa.exercise.seriesc;

import com.mapsa.exercise.seriesc.c.LargestGapAllahdadi;
import com.mapsa.exercise.seriesc.h.FactorielAllahdadi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorielTest {
    @Test
    public void test1() {
        assertEquals(FactorielAllahdadi.isFactorial(2), true);
    }
    public void test2() {
        assertEquals(FactorielAllahdadi.isFactorial(27), false);
    }
    public void test3() {
        assertEquals(FactorielAllahdadi.isFactorial(24), true);
    }
}
