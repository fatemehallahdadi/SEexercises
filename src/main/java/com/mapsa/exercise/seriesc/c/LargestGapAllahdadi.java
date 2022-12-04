package com.mapsa.exercise.seriesc.c;

import java.util.Arrays;

public class LargestGapAllahdadi {
    public static int largestGap(int[] num) {
        Arrays.sort(num);
        int maxGap = num[1] - num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] - num[i - 1] > maxGap) {
                maxGap = num[i] - num[i-1];
            }
        }
        return maxGap;
    }
}
