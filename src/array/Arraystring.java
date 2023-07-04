package array;
import java.util.Scanner;


public class Arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str[]=new String[5];

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter name");
		for(int i=0;i<5;i++)
		{
			str[i]=sc.next();
		}
		System.out.println("Entered names");
	//	for(int i=0;i<5;i++)
		//{
		//	System.out.println(str[i]);

	//	}
		
		for(String v:str)
		{
			System.out.println(v);

		}




		

	}

}
