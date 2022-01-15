package Week3.day2;

public class Desktop implements Software{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop d = new Desktop();
		d.hardwareResources();
		d.softwareResources();
		d.deskTopModel();

	}

	public void hardwareResources() {
		System.out.println("The Hardware resource is taken");
		
	}

	public void softwareResources() {
		System.out.println("The Software resource is taken");
		
	}
public void deskTopModel() {
	System.out.println("The Desktop model is Vostro");
}
}
