package method;

public class Methodexmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodexmpl ob=new Methodexmpl();
		ob.add();
		int subt=ob.sub();
		System.out.println(subt);
		System.out.println(ob.mul(30,10));
		ob.div(9,3);
	}
	public void add()
	{
		int a=50,b=90;
		int c=a+b;                             
		System.out.println(c);
	}
	

	public int sub()
	{
		int a=30,b=20;
		int c=a-b;
		return c;

		
	}
	
	public int mul(int a,int b)	
	{
		int c=a*b;
		return c;
		
		
	}
	public void div(int a,int b)	
	{
		double c=a/b;
		System.out.println(c);
		
		
	}	
		
		
		
		
		
		
		

		
	}
	


