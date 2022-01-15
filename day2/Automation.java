package Week3.day2;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation a = new Automation();
		a.Selenium();
		a.Java();
		a.Python();
		a.Ruby();

	}

	public void Selenium() {
		System.out.println("This is Selenium");

	}

	public void Java() {
		System.out.println("This is Java");

	}

	@Override
	public void Ruby() {
		System.out.println("This is Ruby");

	}

}
