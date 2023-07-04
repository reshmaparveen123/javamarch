package array;

public class Stringoperation {

	public static void main(String[] args) {

		//concatenation
String s="hello        ";
String s1="welcome";
String s2="Hello how are you";

System.out.println(s.concat(s1));
System.out.println(s+s1);
System.out.println(1+2+s+4+5+s2);

//equals
System.out.println(s.equals(s1));
System.out.println(s.equals(s2));
System.out.println(s.equalsIgnoreCase(s2));

//contain
System.out.println(s2.contains("how"));

//touppercase & tolowercase

System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());

//trim

System.out.println(s.trim());
//length
System.out.println(s.length());

//startrswith

System.out.println(s2.startsWith("Hello"));


//Endwith

System.out.println(s2.endsWith("you"));

//substring
System.out.println(s2.substring(2,8));
//charat
System.out.println(s2.charAt(1));

//split

String[] sr=s2.split(" ");
for(String v:sr)
{
	System.out.println(v);

}





	}

	

}
