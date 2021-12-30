package week1.day2.excercise;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,7,6,8};
		Arrays.sort(a);
		//System.out.println("The Missing Number is: ");
		for (int i= 0; i < a.length; i++) {
			if (a[i]+1!=a[i+1]) {
				System.out.println(a[i]+1);
				
			}
		}

	}

}
