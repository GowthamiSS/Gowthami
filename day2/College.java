package Week3.day2;

public class College extends University{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           College c = new College();
           c.pg();
           c.ug();
	}

	@Override
	public void ug() {
		System.out.println("The UG course is available");
		
	}

}
