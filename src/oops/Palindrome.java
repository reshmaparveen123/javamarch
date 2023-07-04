package oops;
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		



				int r;
				int s=0;
					        System.out.println("enter a number");

				       Scanner sc=new Scanner(System.in);
				       int n=sc.nextInt();
				       int temp=n;
				       while(n>0)
				       {
				    	   r=n%10;
				    	   s=s*10+r;
				    	   n=n/10;
				    	   }
				       

						System.out.println(s);
						if(s==temp)
						{
					        System.out.println("number is paloindrome");
					        
	
						}

						else
						{
					        System.out.println("not palindrome");

						}
			


			
	}

}
