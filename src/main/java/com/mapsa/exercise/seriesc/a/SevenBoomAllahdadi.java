package com.mapsa.exercise.seriesc.a;

public class SevenBoomAllahdadi {
    public static String findSeven(String[] array) {

        char[] chNumbers=new char[array.length];
        for (int i = 0; i < array.length; i++) {
            String sArray = array[i];

            for (int j = 0; j < sArray.length(); j++) {
                chNumbers[j]=sArray.charAt(j);
                if (chNumbers[j]=='7'){
                    return "Boom";
                }
            }

        }
        return "there is no 7 in the array";
    }
}
