package method;

import java.util.Scanner;

public class Countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Countdigit s=new Countdigit();
int sum=s.countdigit(n);
System.out.println("sum of number="+sum);

	}
public int countdigit(int n)
{
	int r,s=0;
	while(n>0)
	{
		r=n%10;
		s=s+r;
		n=n/10;
	}
return s;
}
}
