/*	
	^	Matches the beginning of the line.
	$	Matches the end of the line.
	.	Matches any single character except newline. Using m option allows it to match the newline as well.
	[...]	Matches any single character in brackets.
	[^...]	Matches any single character not in brackets.
	\A	Beginning of the entire string.
	\z	End of the entire string.
	\Z	End of the entire string except allowable final line terminator.
	re*	Matches 0 or more occurrences of the preceding expression.
	re+	Matches 1 or more of the previous thing.
	re?	Matches 0 or 1 occurrence of the preceding expression.
	re{ n}	Matches exactly n number of occurrences of the preceding expression.
	re{ n,}	Matches n or more occurrences of the preceding expression.
	re{ n, m}	Matches at least n and at most m occurrences of the preceding expression.
	a| b	Matches either a or b.
	(re)	Groups regular expressions and remembers the matched text.
	(?: re)	Groups regular expressions without remembering the matched text.
	(?> re)	Matches the independent pattern without backtracking.
	\w	Matches the word characters.
	\W	Matches the nonword characters.
	\s	Matches the whitespace. Equivalent to [\t\n\r\f].
	\S	Matches the nonwhitespace.
	\d	Matches the digits. Equivalent to [0-9].
	\D	Matches the nondigits.
	\A	Matches the beginning of the string.
	\Z	Matches the end of the string. If a newline exists, it matches just before newline.
	\z	Matches the end of the string.
	\G	Matches the point where the last match finished.
	\n	Back-reference to capture group number "n".
	\b	Matches the word boundaries when outside the brackets. Matches the backspace (0x08) when inside the brackets.
	\B	Matches the nonword boundaries.
	\n, \t, etc.	Matches newlines, carriage returns, tabs, etc.
	\Q	Escape (quote) all characters up to \E.
	\E	Ends quoting begun with \Q.
	
	*
	*
	*/

package javaAdvanced;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Java_RegularExpressions o = new Java_RegularExpressions();
		o.validateDate_multipleList_ddmmyyyy();
	}

	public void find_Digitstring_inAlphanumericstring() {
		// String to be scanned to find the pattern.
		String REGEX = "(.*)(\\d+)(.*)";
		String Str2Verify = "This order was placed for QT3000! OK?";

		// Create a Pattern object
		Pattern r = Pattern.compile(REGEX);

		// Now create matcher object.
		Matcher m = r.matcher(Str2Verify);

		System.out.println("REGEX " + REGEX);
		System.out.println("Str2Verify " + Str2Verify);

		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		} else {
			System.out.println("NO MATCH");
		}
	}

	public void startandend() {

		String REGEX = "\\bcat\\b";
		String INPUT = "cat cat cat cattie cat";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT); // get a matcher object
		int count = 0;

		while (m.find()) {
			count++;
			System.out.println("REGEX " + REGEX);
			System.out.println("INPUT " + INPUT);
			System.out.println("Match number " + count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());
		}
	}

	public void lookingAt() {

		String REGEX = "foo";
		String Str2Verify = "fooooooooooooooooo";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(Str2Verify); // get a matcher object

		System.out.println("REGEX " + REGEX);
		System.out.println("Str2Verify " + Str2Verify);
		System.out.println("lookingAt(): " + m.lookingAt());
		System.out.println("matches(): " + m.matches());

	}

	public void replaceFirst_replaceAll() {

		String REGEX = "dog";
		String Str2Verify = "The dog says meow. " + "All dogs say meow.";
		String REPLACE = "cat";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(Str2Verify);

		System.out.println("REGEX " + REGEX);
		System.out.println("Str2Verify " + Str2Verify);

		Str2Verify = m.replaceFirst(REPLACE);
		System.out.println("Str2Verify " + Str2Verify);

		Str2Verify = m.replaceAll(REPLACE);
		System.out.println("Str2Verify " + Str2Verify);

	}

	public void appendReplacement_appendTail() {

		String REGEX = "a*b";
		String Str2Verify = "aabfooaabfooabfoob";
		String REPLACE = "1";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(Str2Verify);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, REPLACE);
		}
		m.appendTail(sb);

		System.out.println("REGEX " + REGEX);
		System.out.println("Str2Verify " + Str2Verify);

		System.out.println("\t" + sb.toString());

	}

	public void find_every_occurance_of_word() {
		String REGEX = "\\btest\\w*\\b";
		String Str2Verify = "this teststep is to test the occurance of a word; name of this testcase is TESTING test.";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(Str2Verify);

		String val = null;
		System.out.println("REGEX: " + REGEX);
		System.out.println("Str2Verify: " + Str2Verify);

		while (m.find()) {
			val = m.group();
			System.out.println("MATCH: " + val);
		}
		if (val == null) {
			System.out.println("NO MATCHES: ");
		}

	}

	public void regex_reset() {

		String REGEX = "\\d";
		String Str2Verify = "9652018244";
		String RESET = "1234568789";

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(Str2Verify);

		System.out.println("REGEX " + REGEX);
		System.out.println("Str2Verify " + Str2Verify);

		System.out.println("group started : ");

		while (m.find())
			System.out.print(m.group());
		m.reset(RESET);
		System.out.println("\n After resetting the Matcher");

		System.out.println("group started : ");

		while (m.find())
			System.out.print(m.group());

	}

	public void validateEmail_format() {
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		String Str2Verify = "user@domain.com";
		Boolean b = Str2Verify.matches(EMAIL_REGEX);
		System.out.println("is e-mail: " + Str2Verify + " :Valid = " + b);
		String email2 = "user^domain.co.in";
		b = email2.matches(EMAIL_REGEX);
		System.out.println("is e-mail: " + email2 + " :Valid = " + b);
	}

	public void validateEmail_multipleList() {
		List<String> emails = new ArrayList<String>();
		emails.add("sairamkrishna@tutorialspoint.com");
		emails.add("kittuprasad700@gmail.com");
		emails.add("sairamkrishna_mammahe%google-india.com");
		emails.add("sairam.krishna@gmail-indai.com");
		emails.add("sai#@youtube.co.in");
		emails.add("kittu@domaincom");
		emails.add("kittu#gmail.com");
		emails.add("@pindom.com");

		String REGEX = "^(.+)@(.+)$";
		Pattern p = Pattern.compile(REGEX);

		for (Object email : emails) {
			Matcher matcher = p.matcher((CharSequence) email);
			System.out.println(email + " : " + matcher.matches());
		}
	}

	public void validateDate_multipleList_ddmmyyyy() {
		List<String> dates = new ArrayList<String>();
		dates.add("1/1/11");
		dates.add("01/01/2011");
		dates.add("01/1/11");
		dates.add("1/11/2011");

		String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";

		Pattern pattern = Pattern.compile(regex);

		for (String date : dates) {
			Matcher matcher = pattern.matcher(date);
			System.out.println(date + " : " + matcher.matches());
		}
	}

}
