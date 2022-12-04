package com.mapsa.exercise.seriesc;

import com.mapsa.exercise.seriesc.g.PalindromeAllahdadi;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    @Test
    public void test1() {
        assertEquals(PalindromeAllahdadi.isPalindrome("madam", 0), true);
    }
    @Test
    public void test2() {
        assertEquals(PalindromeAllahdadi.isPalindrome("adieu", 0), false);
    }
    @Test
    public void test3() {
        assertEquals(PalindromeAllahdadi.isPalindrome("rotor", 0), true);
    }
}
