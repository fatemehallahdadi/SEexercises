package com.mapsa.exercise.seriesc.d;

public class ValidatePinAllahdadi {
    public static boolean isDigit(String p) {
        String[] array = p.split(" ");
        if (p.length() != 6 && p.length() != 4) {
            return false;
        } else {
            return !p.contains(" ");
        }
    }
}
