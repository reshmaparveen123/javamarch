package oops;
class Member
{
String name;
int age;
String  phoneno;
String address;
int salary;
public void printdetails()
{
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("phneno:"+phoneno);
	System.out.println("salary:"+salary);
	System.out.println("adress:"+address);
	


}
}

class Employee extends  Member
{
	String specilization;
}

class Manager extends Member
{
	String department;
}


public class Inheritanceexample {

	public static void main(String[] args) {
		
	Employee m=new Employee();
		m.name="arun";
		m.address="garden villa";
		m.age=30;
		m.phoneno="9846508486";
		System.out.println(m.specilization="tester");
		m.printdetails();
		
Manager mn=new Manager();
		mn.name="arun";
		mn.address="garden villa";
		mn.age=30;
		mn.phoneno="9846508486";
		System.out.println(mn.department="hr");
		mn.printdetails();
		
		
	}

}
