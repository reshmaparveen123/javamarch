package oops;

class Emp
{

	private String emname;
	private String emdesgnation;

	public String getEmname() {
		return emname;
	}

	public void setEmname(String emname) {
		this.emname = emname;
	}

	public String getEmdesgnation() {
		return emdesgnation;
	}

	public void setEmdesgnation(String emdesgnation) {
		this.emdesgnation = emdesgnation;
	}

		// TODO Auto-generated method stub

	}


public class Encapsulation {
	public static void main(String[] args) {

		Emp ob=new Emp();
				ob.setEmname("reshma");
		ob.setEmdesgnation("developer");
		System.out.println(ob.getEmname());
		System.out.println(ob.getEmdesgnation());
	}}