package com.mapsa.exercise.seriesc.m;

public class DigitSumRootAllahdadi {
    public static int digitRoot(long num) {
        int sum;
        for(sum = 0; num > 0 || sum > 9; num /= 10) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }

            sum += num % 10;
        }

        return sum;
    }
}
