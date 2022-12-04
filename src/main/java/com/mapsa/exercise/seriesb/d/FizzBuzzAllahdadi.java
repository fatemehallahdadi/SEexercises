package com.mapsa.exercise.seriesb.d;

public class FizzBuzzAllahdadi {

	public static String fizzBuzz(int n) {

		if(n%15 == 0){
			return "FizzBuzz" ;
		}
		else if(n%5==0){
			return "Buzz";
		}
		else if(n%3 == 0){
			return "Fizz";
		}
String result=Integer.toString(n);
		return result;


	}


}
