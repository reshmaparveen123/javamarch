package Stringg;

public class Stringpaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



				String s="malayalam";
				String r="";
				for(int i=s.length()-1;i>=0;i--)
				{
				r=r+s.charAt(i);
	}
				    	   
						System.out.println("reverse="+r);
						if(s.equals(r))
						{
					        System.out.println("string is paloindrome");
					        
	
						}

						else
						{
					        System.out.println("string is not palindrome");

						}
			


			
	}

}
