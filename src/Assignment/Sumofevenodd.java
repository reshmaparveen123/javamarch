package Assignment;

import java.util.Scanner;

public class Sumofevenodd {

	public static void main(String[] args) {
		
		int n=1,sume=0,sumo=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}
		for(int i=0;i<n;i++)
{
	if(a[i]%2==0)
	{
		sume=sume+a[i];
	}
	else
	{
		sumo=sumo+a[i];
}
	}
	
	System.out.println("Sum of odd  numbers are:"+sume);
	
	System.out.println("Sum of odd  numbers are:"+sumo);
	
	
	}
}


	


