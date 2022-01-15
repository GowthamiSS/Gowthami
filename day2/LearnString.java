package Week3.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to JAVA session";
		String s1 = "Welcome";
		String s2 = new String("Welcome");
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		// String length
		int length = s.length();
		System.out.println(length);
		// convert string to character array
		char[] charArray = s.toCharArray();
		// first char
		System.out.println(charArray[0]);
		// last char
		System.out.println(charArray[length - 1]);
		// get specific character
		char charAt = s.charAt(4);
		System.out.println(charAt);

		// get the index of the specific character
		int indexOf = s.indexOf('c');
		System.out.println(indexOf);

		// how to get part of string

		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 4)); // returns 3 incudes stating index and excluded ending index

		// trim the string
		System.out.println(s.trim());

		// uppercase
		System.out.println(s.toUpperCase());
		// lowercase
		System.out.println(s.toLowerCase());
		// System.out.println(s.toUpperCase(locale));

		// split word of string
		String[] split = s.split("");
		System.out.println(split[1]);

		// How to replace something in string

		System.out.println(s.replace("session", "class"));
	}

}
