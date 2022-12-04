package com.mapsa.exercise.seriesa.m;

public class SpacesBetweenCharacterAllahdadi {
	public static String spaceMeOut(String str) {
		String[] splited = str.split("(?!^)");
		String newText = "";
		for (int i = 0; i < splited.length; i++) {
			newText += splited[i];
			if (i < splited.length - 1)
				newText += " ";
		}
		return newText;
	}
}