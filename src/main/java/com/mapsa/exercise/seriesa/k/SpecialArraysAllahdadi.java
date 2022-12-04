package com.mapsa.exercise.seriesa.k;

public class SpecialArraysAllahdadi {
	public static boolean isSpecialArray(int[] arr) {
		for(int i=0; i<arr.length; i++){
			if(!((i%2==0 && arr[i]%2==0) || (i%2==1 && arr[i]%2==1))) {
				return false;
			}
		}
		return true;
	}
}