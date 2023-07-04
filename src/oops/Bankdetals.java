package oops;

import java.util.Scanner;  
 interface Bankdetails{
	     void personaldetails(String name);
		void personaldetails();
		void deposit1(); 
	     void withdrawal1();
	     void balance(); 
 }
 class Sib implements Bankdetails
 {
	 
 static String bankname="sib";
 int accno;
 int balance =20000;
 
    Scanner sc = new Scanner(System.in);  
    
   
	@Override
	public void personaldetails(String name) {
		System.out.println("bank name is "+bankname);

System.out.println("Account number:");
accno=sc.nextInt();
System.out.println("Account number:"+accno);

System.out.println("Name:"+name);


		// TODO Auto-generated method stub
		
	}
	@Override
	public void deposit1() {
		System.out.println("Enter your deposit amount :");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("balance="+balance);



		// TODO Auto-generated method stub
		
	}
	@Override
	public void withdrawal1() {
		System.out.println("Enter your withdrawal :");
int amount=sc.nextInt();
balance=balance-amount;
System.out.println("balance="+balance);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void balance() {
		System.out.println(balance);

		// TODO Auto-generated method stub
		
	}
	@Override
	public void personaldetails() {
		// TODO Auto-generated method stub
		
	}  
    }  
    
  

public class Bankdetals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sib ob=new Sib();
		ob.personaldetails("Reshma");
		ob.deposit1();
		ob.withdrawal1();
		ob.balance();

	}

}
