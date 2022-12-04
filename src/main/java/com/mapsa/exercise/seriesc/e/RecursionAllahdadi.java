package com.mapsa.exercise.seriesc.e;

public class RecursionAllahdadi {
        public static int count(long input) {
            if (input == 0) {
                return 1;
            } else {
                return 1 + count((int) input / 10);
            }
        }
}
