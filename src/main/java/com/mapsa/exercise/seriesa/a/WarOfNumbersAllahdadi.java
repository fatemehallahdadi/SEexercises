package com.mapsa.exercise.seriesa.a;

public class WarOfNumbersAllahdadi {
	public static int warOfNumbers(int[] numbers) {
		int numbersOfOdd = 0;
		int numbersOfEven = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				numbersOfEven++;
			} else
				numbersOfOdd++;

		}
		int[] odds = new int[numbersOfOdd];
		int[] evens = new int[numbersOfEven];
		int j = 0;
		int x = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evens[j] = numbers[i];
				j++;

			} else {
				odds[x] = numbers[i];
				x++;
			}
		}

		int sumOfOdds = 0;

		for (int i = 0; i < odds.length; i++) {
			sumOfOdds += odds[i];
		}
		int sumOfEvens = 0;

		for (int i = 0; i < evens.length; i++) {
			sumOfEvens += evens[i];
		}
		System.out.println("sum of evens:" + sumOfEvens);
		System.out.println("sum of odds:" + sumOfOdds);
		int finalValue=sumOfEvens-sumOfOdds;
		return Math.abs(finalValue);

	}
}