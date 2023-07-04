package Assignment;

public class Reverse {

	public static void main(String[] args) {
			
				int n =12345;
				int reversed=0;
				System.out.println("Number="+n);	

			
				while(n>0)
				{
				int result=	n%10;
				reversed=reversed* 10 +result;
				n=n/10;
					
				}
				System.out.println("Reversed number="+reversed);	
	}

}
