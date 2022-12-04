package com.mapsa.exercise.seriesc;

import com.mapsa.exercise.seriesc.e.RecursionAllahdadi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionTest {
    @Test
    public void test1() {
        assertEquals(RecursionAllahdadi.count(318), 3);
    }
    @Test
    public void test2() {
        assertEquals(RecursionAllahdadi.count(-92563), 5);
    }
    @Test
    public void test3() {
        assertEquals(RecursionAllahdadi.count(4666), 4);
    }
}
