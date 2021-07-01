package ex1_4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/*
3.	The enclosing characters in a program must be balanced. In other words for every
opening parenthesis, brace, bracket or similar type there must be a corresponding closing type.
Examples { }, [ ], ( ), < >. From a file or string input determine a good data structure to use
to test for balanced enclosing characters. Input a file or string with any of these characters
and determine if all the opening and closing characters match. Create a method that takes a String
parameter and returns a boolean equal to the result of the test
*/
public class Exercise3 {

	public static final HashMap<Character, Character> bracketPairs;

	static {
		bracketPairs = new HashMap<>();
		bracketPairs.put(')', '(');
		bracketPairs.put(']', '[');
		bracketPairs.put('}', '{');
		bracketPairs.put('>', '<');
	}

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		if (checkEnclosingCharacters(input)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}

	public static boolean checkEnclosingCharacters(String s) {
		LinkedList<Character> stack = new LinkedList<>();
		char[] chars = s.toCharArray();
		for (char c : chars) {
			if (bracketPairs.containsValue(c)) {
				stack.push(c);
			} else if (bracketPairs.containsKey(c)) {
				if (stack.isEmpty() || bracketPairs.get(c) != stack.pop()) {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
