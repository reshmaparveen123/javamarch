package oops;

class Animal2
{
	public void animaldetails()
	{
		System.out.println("animaldetails");
		
	}
}
class Dog2 extends Animal2
{
	public void dogdetails()
	{
		System.out.println("dog");
	}
}
class Tiger extends Animal2
{
	public void Tigerdetails()
	{
		System.out.println("tiger");
	}
}
		 
		


public class Hirarchial {

	public static void main(String[] args) {
		
		Dog2 ob=new Dog2();
		ob.animaldetails();
		ob.dogdetails();
		
Tiger t=new Tiger();
		t.animaldetails();
		t.Tigerdetails();
		
// TODO Auto-generated method stub

	}

}
