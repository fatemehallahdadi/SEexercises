package com.mapsa.exercise.seriesa.n;

public class RepeatingLettersNTimesAllahdadi {
    public static String repeat(String str, int n) {
        String[] splited = str.split("(?!^)");
        String finalText = "";
        for (int i = 0; i < splited.length; i++) {
            for (int j = 0; j < n; j++) {
                finalText += splited[i];
            }
        }
        return finalText;
    }
}