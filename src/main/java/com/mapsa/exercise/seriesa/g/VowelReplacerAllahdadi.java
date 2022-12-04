package com.mapsa.exercise.seriesa.g;

public class VowelReplacerAllahdadi {
	public static String replaceVowels(String str, char ch) {
		String[] spilted = str.split("(?!^)");
		for (int i = 0; i < spilted.length; i++) {
			if (spilted[i].equals("a") ||
					spilted[i].equals("e") |
							spilted[i].equals("i") ||
					spilted[i].equals("o") ||
					spilted[i].equals("u"))
				spilted[i] = String.valueOf(ch);
		}
		String newText = "";
		for (int i = 0; i < spilted.length; i++) {
			newText += spilted[i];
		}
		return newText;


	}
}