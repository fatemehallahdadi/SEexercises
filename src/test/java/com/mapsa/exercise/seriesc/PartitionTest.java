package com.mapsa.exercise.seriesc;

import com.mapsa.exercise.seriesc.e.RecursionAllahdadi;
import com.mapsa.exercise.seriesc.j.PartitionAllahdadi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PartitionTest {
    @Test
    public void test1() {
        assertEquals(PartitionAllahdadi.canPartition(new int[]{2,8,4,1}), true);
    }
    @Test
    public void test2() {
        assertEquals(PartitionAllahdadi.canPartition(new int[]{-1,-10,-2,20,1}), false);
    }

}
