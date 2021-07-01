package ex1_4;

import java.util.Scanner;

/*
3.	The enclosing characters in a program must be balanced. In other words for every
opening parenthesis, brace, bracket or similar type there must be a corresponding
closing type. Examples { }, [ ], ( ), < >. From a file or string input determine a
good data structure to use to test for balanced enclosing characters. Input a file or
string with any of these characters and determine if all the opening and closing characters
match. Create a method that takes a String parameter and returns a boolean equal to the
result of the test
*/
public class Exercise2 {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.printf("The string is %sa palindrome.%n", isPalindrome(input) ? "" : "not ");

	}

	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
