package inheritance;//Multilevel

public class Babydog extends Cat {
	public void display3()
	{
		System.out.println("ABCD");
	}
	public static void main(String args[])
	{
		Babydog obj=new Babydog();
		obj.display1();
		obj.display();
		System.out.println(obj.a);
		obj.display3();
	}
	

}
