package week1.day2.excercise;

public class PrimeNumber {

	public static void main(String[] args) {
		int  a = 6;
		int rem;
		boolean flag = false;
		for(int i=2;i<=a/2;i++)
		{
		rem=a%i;
		if(rem==0)
		{
			flag=true;
			break;
		}
		}
		if(flag=false)
		System.out.println(a+   "  is prime number");
		else
			System.out.println(a+   " is not a prime number");
		}
	}
