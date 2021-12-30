package week1.day2.excercise;

public class Palidrome {

	public static void main(String[] args) {
		int n =454;  
		int a,s=0,temp;    
		  int p=n;//It is the number variable to be checked for palindrome  
		  
		  temp=p;    
		  while(p>0){    
		   a=p%10;  //getting remainder  
		   s=(s*10)+a;    
		   p=p/10;    
		  }    
		  if(temp==s)    
		   System.out.println(n+   " is Palindrome Number");    
		  else    
		   System.out.println(n+   " is not Palindrome Number");    

	}

}
