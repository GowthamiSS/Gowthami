package Week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> a = new ArrayList<String>();
		a.add("ss");
		a.add("jjjj");

		// print list
		System.out.println(a);

		// find the size of list
		int size = a.size();
		System.out.println(size);

		// retrive the data from index
		System.out.println(a.get(1));

		// Remove data from list
		a.remove(size - 1);
		System.out.println(a);

		// verify data present in list
		System.out.println(a.contains("ss"));

		// remove all the data
		a.clear();
		System.out.println(a);
		// confirm whether list is empty
		System.out.println(a.isEmpty());

		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);

	}

}
