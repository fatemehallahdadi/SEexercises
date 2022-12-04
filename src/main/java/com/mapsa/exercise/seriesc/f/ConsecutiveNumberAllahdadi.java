package com.mapsa.exercise.seriesc.f;

import java.util.Arrays;
import java.util.Objects;

public class ConsecutiveNumberAllahdadi {
    public static boolean cons(int[] input) {
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            if (!Objects.equals(input[i], i)) {
                return false;
            }
        }
        return true;
    }

}
