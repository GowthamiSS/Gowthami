package Week3.day2;

public class ICICI implements RBI, CIBIL{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ICICI I = new ICICI();
         I.cibilScore();
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("Minimum balance is Rs.1000");
	}

	public void maxLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("Maximum Loan amount is Rs.70,00,000");
	}
	public void educationLoan() {
		System.out.println("Education Loan limit is Rs.70,00,000");
	}

	public void cibilScore() {
		System.out.println("Your Cibil score in good");
		
	}

}
