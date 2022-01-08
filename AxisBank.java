package Week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("The amount is deposited in AxisBank");
	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();

	}

}
