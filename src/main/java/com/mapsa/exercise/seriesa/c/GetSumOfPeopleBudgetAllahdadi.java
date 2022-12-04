package com.mapsa.exercise.seriesa.c;

import java.util.Scanner;

public class GetSumOfPeopleBudgetAllahdadi {

	public static double getBudgets(Person[] persons) {

		int sum = 0;
		for (int j = 0; j < persons.length; j++) {
			sum += persons[j].getBudget();
		}
		return sum;
	}

}

