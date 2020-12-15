package logicalQuestions;

import java.util.HashMap;

public class String_Questions {
	String strTest = "Testing";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Questions o = new String_Questions();
		o.reverseSentence_notCharacters("reverese my string");
	}

	public void CheckCharacter_AlphabetorNot(char c) {
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is an alphabet.");
		else
			System.out.println(c + " is not an alphabet.");
	}

	public void print_all_UPPERCASE() {
		for (char c = 'A'; c <= 'Z'; ++c)
			System.out.print(c + ", ");
	}

	public void print_all_lowercase() {
		for (char c = 'a'; c <= 'z'; ++c)
			System.out.print(c + ", ");
	}

	public void countNumof_TotalChar_String(String strTest) {

	}

	public void countNumof_duplicateChar_String(String strTest) {

	}

	public void countNumof_UniqueChar_String(String strTest) {

	}

	public void countNumof_Words_SentenCe(String strTest) {

	}

	public void countNumof_Lines_Paragraph(String strTest) {

	}

	public void eachCharCountInString(String inputString) {
		// Creating a HashMap containing char as a key and occurrences as a value

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array

		char[] strArray = inputString.toCharArray();

		// checking each char of strArray

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				// If char 'c' is present in charCountMap, incrementing it's count by 1

				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				// If char 'c' is not present in charCountMap,
				// putting 'c' into charCountMap with 1 as it's value

				charCountMap.put(c, 1);
			}
		}

		// Printing inputString and charCountMap

		System.out.println(inputString + " : " + charCountMap);
	}

	public void countOcccurances_EachCharIn_String(String strTest) {

	}

	public void percentageof_UPPER_lower_Numbeer_String(String strTest) {

	}

	public void permutationsof_String(String strTest) {

	}

	public void extractIntezers(String strTest) {
		// TODO Auto-generated method stub
		String s = "aa123bb4jshadghj656";
		int sum = 0;
		String k[] = s.split(("[^0-9]"));
		for (int j = 0; j < k.length; j++) {
			if (k[j].length() != 0) {
				int i = Integer.parseInt(k[j]);
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

	public void customSort(String strTest) {
		String reverse = new StringBuffer(strTest).reverse().toString();
		System.out.println(reverse + " = reverseString_withReverse");
	}

	public void reverseString_withReverse(String strTest) {
		String reverse = new StringBuffer(strTest).reverse().toString();
		System.out.println(reverse + " = reverseString_withReverse");
	}

	public void reverseStringBuffer_withReverse(String strTest) {
		StringBuffer reverse = new StringBuffer(strTest).reverse();
		System.out.println(reverse + " = reverseStringBuffer_withReverse");
	}

	public void reverseString_withoutReverse(String strTest) {

		String reverse = "";
		for (int i = ((strTest.length()) - 1); i >= 0; i--) {
			reverse = reverse + strTest.charAt(i);
		}
		System.out.println(reverse + " = reverseString_withoutReverse");

	}

	public void reverseString_withoutLoop(String strTest) {

	}

	public void reverseString_PreservingSpaces(String strTest) {

	}

	public void removeSpace_String(String strTest) {

	}

	public void Check_Palindrome(String strTest) {
		String reverse = new StringBuffer(strTest).reverse().toString();
		if (strTest.equals(reverse)) {
			System.out.println(strTest + " = The string is a palindrome.");
		} else {
			System.out.println(strTest + "=The string isn't a palindrome.");

		}
	}

	public void reverseSentence_notCharacters(String StrSentence) {
		String lmystr = new StringBuffer(StrSentence).toString();
		String[] aWords = lmystr.split(" ");
		String strReverseStatement = "";

		for (int i = aWords.length - 1; i >= 0; i--) {
			strReverseStatement = strReverseStatement + " " + aWords[i];
		}

		System.out.println(strReverseStatement);

	}

}