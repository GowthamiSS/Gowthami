package week1.day1;

public class Mobile {
	String mobileModel = "Lenovo";
	int mobileWeight = 20;
	boolean isFullCharge = true;
	double mobileCost = 2000.70;
	
	public void makeCall(){
		System.out.println("I am calling");
		}
	public void sendMsg(){
		System.out.println("I am sending message");
		}

	public static void main(String[] args) {
		
	Mobile myMobile = new Mobile();
		//use the object to call the method
	myMobile.makeCall();
	myMobile.sendMsg();
		System.out.println(myMobile.mobileModel);
		System.out.println(myMobile.mobileWeight);
		System.out.println(myMobile.isFullCharge);
		System.out.println(myMobile.mobileCost);
	}

}
