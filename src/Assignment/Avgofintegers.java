package Assignment;

import java.util.Scanner;

public class Avgofintegers {

	public static void main(String[] args) {
		
double [] n=new double[10];
double sum=0;
System.out.println("enter 10 numbers");
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++)
{
	n[i]=sc.nextDouble();
	sum+=n[i];
}
	sc.close();
		double avg=sum/10;


System.out.println("average of 10 numbers is:"+avg);

	}

}
