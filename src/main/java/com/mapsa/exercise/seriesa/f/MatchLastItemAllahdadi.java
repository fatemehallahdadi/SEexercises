package com.mapsa.exercise.seriesa.f;

public class MatchLastItemAllahdadi {
	public static boolean matchLastItem(String[] t) {
		String finalText = "";
		for (int i = 0; i < t.length - 1; i++) {
			finalText += t[i];
		}
		if (finalText.equals(t[t.length - 1]))
			return true;
		else
			return false;
	}

}