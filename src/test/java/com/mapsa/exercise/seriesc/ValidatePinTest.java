package com.mapsa.exercise.seriesc;

import com.mapsa.exercise.seriesc.d.ValidatePinAllahdadi;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidatePinTest {

        @Test
        public void test1() {
            assertEquals(ValidatePinAllahdadi.isDigit("121317"), true);
        }
        @Test
        public void test2() {
            assertEquals(ValidatePinAllahdadi.isDigit("1234"), true);
        }
        @Test
        public void test5() {
            assertEquals(ValidatePinAllahdadi.isDigit("900876"), true);
        }


}
