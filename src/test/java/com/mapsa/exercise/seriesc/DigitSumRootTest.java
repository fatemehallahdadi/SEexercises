package com.mapsa.exercise.seriesc;

import com.mapsa.exercise.seriesc.m.DigitSumRootAllahdadi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitSumRootTest {
    @Test
    public void test1() {
        assertEquals(DigitSumRootAllahdadi.digitRoot(123), 6);
    }

    @Test
    public void test2() {
        assertEquals(DigitSumRootAllahdadi.digitRoot(999888777L), 9);
    }

    @Test
    public void test3() {
        assertEquals(DigitSumRootAllahdadi.digitRoot(1238763636555555555L), 9);
    }
}
