import java.util.Arrays;
import java.util.Scanner;

public class ReversedWord {

	public static void main(String[] args) {

		ReversedWord reverseWord = new ReversedWord();

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a word: ");
		String word = scanner.next();

		int n = word.length();

		/*
		 * A string is an array of characters .
		 */

		char newWord;
		String reversedWord;
		char[] charArray = word.toCharArray();

		for (int i = 1; i <= n; i++) {
			newWord = charArray[n - i];

			reversedWord = String.valueOf(newWord);
			System.out.print(reversedWord);

		}

		System.out.println();
		System.out.println("Is " + "'" + word + "'" + " a palindrom word? : " + reverseWord.isPalindrom(word));
	}

	boolean isPalindrom(String s) {
		boolean isPalindrom = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(s.length() - (i + 1))) {
				isPalindrom = true;
			} else {
				isPalindrom = false;
			}
		}
		return isPalindrom;

	}

}
