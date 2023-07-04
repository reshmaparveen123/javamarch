package oops;
interface Bank
{
	public void deposit();
	public void withdraw();
	public void balance();
	
	
	}
interface creditcard
{
	public void creditcarddetails();
}
class SBI implements Bank,creditcard
{

	@Override
	public void deposit() {
		System.out.println("sbideposit");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		System.out.println("sbiwithdraw");

		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		System.out.println("sbibalance");

		// TODO Auto-generated method stub
		
	}

	@Override
	public void creditcarddetails() {
		System.out.println("sbicreditcard");

		// TODO Auto-generated method stub
		
	}
	
}

class federal implements  Bank {

	

	


@Override
public void deposit() {
	System.out.println("federaldeposit");

}

@Override
public void withdraw() {
	System.out.println("federalithdraw");
	
}

@Override
public void balance() {
	System.out.println("federalblnc");
}}
public	class Interfacepgm {

		public static void main(String[] args) {
	Bank ob=new SBI();
	ob.balance();
	ob.deposit();
	ob.withdraw();

	ob=new federal();
	ob.deposit();
	ob.balance();
	

	
}}