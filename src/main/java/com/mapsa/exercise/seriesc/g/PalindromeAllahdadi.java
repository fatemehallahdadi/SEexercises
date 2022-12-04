package com.mapsa.exercise.seriesc.g;

public class PalindromeAllahdadi {
    public static boolean isPalindrome(String text, int halfLength) {
        if (halfLength > text.length() / 2) {
            return true;
        } else {
            return text.charAt(halfLength) == text.charAt(text.length() - halfLength - 1) && isPalindrome(text, halfLength + 1);
        }
    }
}
