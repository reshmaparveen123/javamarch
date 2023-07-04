package Assignment;

public class Fibonaccipgm {

	public static void main(String[] args) {
		
		int n = 10, firstn = 0, secondn = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i)
	    {
	      System.out.print(firstn + ", ");

	      int nextn = firstn + secondn;
	      firstn = secondn;
	      secondn = nextn;
	    }
	  }
	
}
