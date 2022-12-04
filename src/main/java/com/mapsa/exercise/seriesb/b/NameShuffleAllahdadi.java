package com.mapsa.exercise.seriesb.b;

public class NameShuffleAllahdadi {

	public static String nameShuffle(String s) {
		int ioSpace = s.indexOf(" ") ;
		String fName = s.substring(0 , ioSpace) ;
		String lName = s.substring(ioSpace+1 , s.length()) ;
		return String.format("%s %s" , lName , fName ) ;

	}

}
