package com.mapsa.exercise.seriesa.h;

public class ValidZipCodeAllahdadi {
    public static boolean isValid(String zip) {
        String[] splited = zip.split("(?!^)");
        if (splited.length > 5) {//most not be greater than 5 digits in length
            System.out.println("most not be greater than 5 digits");
            return false;
        }
        int c = 0;
        for (int i = 0; i < splited.length; i++) {
            if (splited[i].equals("0") ||
                    splited[i].equals("1") ||
                    splited[i].equals("2") ||
                    splited[i].equals("3") ||
                    splited[i].equals("4") ||
                    splited[i].equals("5") ||
                    splited[i].equals("6") ||
                    splited[i].equals("7") ||
                    splited[i].equals("8") ||
                    splited[i].equals("9"))
                c += 0;
            else
                c += 1;
        }
        if (c > 0) {
            System.out.println("plese enter just numbers without any other character or space");
            return false;
        } else
            return true;


    }
}
