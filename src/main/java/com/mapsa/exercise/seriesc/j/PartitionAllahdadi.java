package com.mapsa.exercise.seriesc.j;

import java.util.Arrays;

public class PartitionAllahdadi {
    public static boolean canPartition(int[] numbers) {
        Arrays.sort(numbers);
        int p = numbers[0];
        for (int i = 1; i < numbers.length - 1; i++) {
            p *= numbers[i];
        }
        return p == numbers[numbers.length - 1];
    }
}


