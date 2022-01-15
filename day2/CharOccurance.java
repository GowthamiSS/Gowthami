package Week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		str = str.replace("","");
		int count = 0;
		char[] c = str.toCharArray();
		System.out.println(c);
		int size = c.length;
		char c1 = 'w';
		for (int i = 0; i < size; i++) {
			
			if (c1==c[i]) {
				count++;
				
				
			}
			System.out.println(count);
		}
		

	}

}
