package com.mapsa.exercise.seriesc;

import com.mapsa.exercise.seriesc.b.NumberedCardsAllahdadi;
import com.mapsa.exercise.seriesc.c.LargestGapAllahdadi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestGapTest {
    @Test
    public void test1() {
        assertEquals(LargestGapAllahdadi.largestGap(new int[]{9,4,26,26,0,0,5,20,6,25,5}), 11);
    }
    public void test2() {
        assertEquals(LargestGapAllahdadi.largestGap(new int[]{14,13,7,1,4,12,3,7,7,12,11,5,7}), 4);
    }
    public void test3() {
        assertEquals(LargestGapAllahdadi.largestGap(new int[]{13,3,8,5,5,2,13,6,14,2,11,4,10,8,1,9}), 2);
    }
}
