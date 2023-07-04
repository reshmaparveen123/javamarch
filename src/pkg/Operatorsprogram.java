package pkg;

public class Operatorsprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//arithmetic
		
		
		int a=20,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quetiont
		System.out.println("a%b="+(a%b));//reminder
		
	//assignment 
		
		int c=30,d=20;
		System.out.println("C+=d="+(c+=d));//c=c+d
		System.out.println("C-=d="+(c-=d));//c=c-d
		
    //relational
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);

//logical operator
		
		String username="abc";
		String pswrd="123";
		
		System.out.println(username=="abc" && pswrd=="123");
		System.out.println(username=="abc" || pswrd=="1234");
		System.out.println(!(username=="abc"));
		
//unary operator
		
		int d1=2;
		System.out.println(d1++);
		System.out.println(d1);










	}

}
