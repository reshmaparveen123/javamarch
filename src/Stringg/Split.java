package Stringg;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="selinium webdriver is used for webapplication testing";
			
		String a[]=s.split(" ");//hello
		for(String s1:a)
		{
		System.out.println(s1);
		if(s1.contains("webapplication"))
		{
			break;

		}
	}

	}}
