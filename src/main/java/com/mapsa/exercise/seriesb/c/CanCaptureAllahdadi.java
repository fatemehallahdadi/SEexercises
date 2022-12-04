package com.mapsa.exercise.seriesb.c;

public class CanCaptureAllahdadi {

	public static Boolean canCapture(String[] rooks) {


		if(rooks[0].charAt(0)==rooks[1].charAt(0)){
			return true ;
		}
		else if(rooks[0].charAt(1)==rooks[1].charAt(1)){
			return true ;
		}

		return false  ;

	}
}
