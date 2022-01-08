package Week3.day1;

public class Student {
	public void getStudentInfo(int id) {
		System.out.println("Details of " + id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Details of " +id  +  name);
	}
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("Details of " +email  +  phoneNumber);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.getStudentInfo(2);
s.getStudentInfo(2, "Gowthami");
s.getStudentInfo("gg@gmail.com", 96);
	}
}
