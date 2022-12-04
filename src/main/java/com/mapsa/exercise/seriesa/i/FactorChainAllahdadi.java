package com.mapsa.exercise.seriesa.i;

public class FactorChainAllahdadi {
	public static boolean factorChain(int[] numbers){
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[numbers.length-1]%numbers[i]!=0){
				return false;
			}
		}
		return true;

	}
}