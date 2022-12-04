package com.mapsa.exercise.seriesc.h;

public class FactorielAllahdadi {
    public static boolean isFactorial(int n) {
        for(int i = 1; n % i == 0; ++i) {
            n /= i;
        }

        return n == 1;
    }
}
