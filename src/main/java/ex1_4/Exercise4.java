package ex1_4;

import java.util.Scanner;

/*
4. HackerRank Birthday Cake Candles challenge.
You are in charge of the cake for a child's birthday.
You have decided the cake will have one candle for each year of their total age.
They will only be able to blow out the tallest of the candles.
Count how many candles are tallest.
*/
public class Exercise4 {

	public static void main(String[] args) {
		System.out.println(
				"Enter number of candles on first line.\nThen enter space-separated heights of candles on next line:");
		Scanner in = new Scanner(System.in);
		// all input is assumed to be valid
		int numCandles = in.nextInt();
		int[] heights = new int[numCandles];
		for (int i = 0; i < numCandles; i++) {
			heights[i] = in.nextInt();
		}
		System.out.printf("The child will blow out %d candles.%n", countHighest(heights));

	}

	public static int countHighest(int[] heights) {
		int maxHeight = 0;
		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] == maxHeight) {
				count++;
			} else if (heights[i] >= maxHeight) {
				maxHeight = heights[i];
				count = 1;
			}
		}
		return count;
	}
}
