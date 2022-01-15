package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] Dup=text.split(" ");
		Set<String> char1=new LinkedHashSet<String>();
		 for(String str:Dup)
		 {
			 char1.add(str);
			 count++;
			 }
		 System.out.println(char1);
		

	}

}
