package com.mapsa.exercise.seriesb.f;

public class FormatPhoneNumberAllahdadi {

	public static String formatPhoneNumber(int[] nums) {
		String text=nums.toString();
		String number = text.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		return number;
	}
}
