package com.mapsa.exercise.seriesa.d;

public class HowManyDecimalPlacesAllahdadi {

    public static int getDecimalPlaces(String number) {
        int numberOfDecimal = 0;
        if (!number.contains(".")) {
            return 0;
        } else {
            int index = number.indexOf('.');
            String test = number.substring(index + 1);
            numberOfDecimal = test.length();

        }
        return numberOfDecimal;
    }
}