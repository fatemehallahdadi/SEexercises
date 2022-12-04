package com.mapsa.exercise.seriesa.e;

public class IsAverageWholeNumberAllahdadi {
	public static boolean isAvgWhole(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		double avg=0;
		avg=(double) sum/nums.length;
		if(avg == Math.round(avg)){
			return true;
		}else
			return false;

	}
}