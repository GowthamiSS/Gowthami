package Week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> name = new HashSet<String>();
		boolean isPresent = name.add("sss");
		name.add("eee");
		name.add("fff");
		boolean isDuplicate = name.add("sss");
		System.out.println(isPresent);
		System.out.println(isDuplicate);
		//Set doesn't have get()
		List <String> list = new ArrayList<String>(name);
		System.out.println(list);
	}
}
