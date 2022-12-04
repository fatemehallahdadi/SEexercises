package com.mapsa.exercise.seriesc.k;

public class HarshadNumberAllahdadi {
    public static int sumOfDigits(int number) {
        int sum;
        for(sum = 0; number > 0; number /= 10) {
            int digit = number % 10;
            sum += digit;
        }

        return sum;
    }
}
