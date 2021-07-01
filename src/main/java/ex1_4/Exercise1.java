package ex1_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1.	Create a Java program. It contains a method called maxCharacter(String).
Say you pass a string to this function and the String is ‘aaafbbbdeeeda’, you need to return
the 1st index of the maximum character. In this case it is ‘a’ and first index is ‘0’.
Another example is  ‘eeddfssses’; the value is ‘s’ and the first index is ‘5’.
*/
public class Exercise1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = in.nextLine();
		System.out.println("The most frequent character first occurs at index " + maxCharacter(input));
	}

	public static int maxCharacter(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}
		Map<Character, Integer[]> countsAndIndices = new HashMap<Character, Integer[]>();
		char[] chars = s.toCharArray();
		char mostCommon = s.charAt(0);
		int maxFreq = 1;
		for (int i = 0; i < chars.length; i++) {
			if (!countsAndIndices.keySet().contains(chars[i])) {
				countsAndIndices.put(chars[i], new Integer[] { 1, i });
			} else {
				int newFreq = ++countsAndIndices.get(chars[i])[0];
				if (newFreq > maxFreq) {
					mostCommon = chars[i];
					maxFreq = newFreq;
				}
			}
		}
		return countsAndIndices.get(mostCommon)[1];
	}
}
