package Stringg;

import java.util.Scanner;

public class Countvowels {

	public static void main(String[] args) {
int count=0;
System.out.println("enter a string");
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();//hello
for(int i=0;i<s1.length();i++)
{
	
	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)==' ')

{
	count++;
	
}
	System.out.println(count);

}
}
	}


