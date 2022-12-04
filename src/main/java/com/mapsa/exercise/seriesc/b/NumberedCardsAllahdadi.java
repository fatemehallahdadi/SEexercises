package com.mapsa.exercise.seriesc.b;

public class NumberedCardsAllahdadi {
    public static boolean checkWinner(int[] yArray, int[] oArray) {
        int yourMax = find2Maximum(yArray);
        int opponentMax = find2Maximum(oArray);
        return yourMax > opponentMax;
    }

    public static int find2Maximum(int[] numbers) {
        int maxOne = 0;
        int maxTwo = 0;
        int[] var3 = numbers;
        int var4 = numbers.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int num = var3[var5];
            if (maxOne < num) {
                maxTwo = maxOne;
                maxOne = num;
            } else if (maxTwo < num) {
                maxTwo = num;
            }
        }

        int concated2MaxNumber = maxOne + maxTwo;
        return concated2MaxNumber;
    }
}
