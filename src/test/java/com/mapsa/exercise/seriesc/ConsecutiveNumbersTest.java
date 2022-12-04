package com.mapsa.exercise.seriesc;

import com.mapsa.exercise.seriesc.f.ConsecutiveNumberAllahdadi;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ConsecutiveNumbersTest {

    @Test
    public void test1() {
        assertEquals(ConsecutiveNumberAllahdadi.cons(new int[]{5,1,4,3,2,8}), false);
    }
    @Test
    public void test2() {
        assertEquals(ConsecutiveNumberAllahdadi.cons(new int[]{5,6,7,8,9,9}), false);
    }
}
