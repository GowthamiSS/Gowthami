package Week3.day2;

public class StringPalidrome {

	public static void main(String[] args) {
		String s = "madam";
		String rev = "";
		int size = s.length();
		for (int i = size - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		if (s.equals(rev))
			System.out.println("Palidrome");
		else
			System.out.println("Not Palidrome");
		System.out.println(rev);
	}
}