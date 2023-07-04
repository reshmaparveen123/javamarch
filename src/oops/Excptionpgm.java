package oops;

public class Excptionpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub




try
{
	int a=20,b=0;
	int c=a/b;
	System.out.println(c);
	
}
catch(Exception e)	
{
	System.out.println(e.getMessage());
	System.out.println("Arithmetic exception");


}
	System.out.println("hallo");
	
	try
	{
		int []a=new int[2];
		a[0]=23;
		a[1]=65;
		System.out.println(a[3]);
	}

		catch(Exception e)	
		{
			System.out.println(e.getMessage());
			System.out.println("Arrayindexoutofboundexception");
		}
	try
	{
	String s=null;
		System.out.println(s.length());
	}

		catch(Exception e)	
		{
			System.out.println(e.getMessage());
			System.out.println("s have null value");

	}
	
	}
}
