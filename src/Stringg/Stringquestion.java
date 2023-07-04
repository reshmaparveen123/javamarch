package Stringg;

public class Stringquestion {

	public static void main(String[] args) {
		String s="jmeter  ";
		String s1="perfomance testing tool";
	//	String s2="selenium webdriver is sed for webapplication testing";
		String s3="java is platform dependent langauge";

		System.out.println(s.concat(s1));
		//System.out.println(s+s1);
		if (s3.contains("langauge"))
		{
		System.out.println("pass");
		}
	else
	{
			System.out.println("fail");

		}
	}
		
	

}
