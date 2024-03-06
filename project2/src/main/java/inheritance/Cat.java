package inheritance;//Single

public class Cat extends Animal{

	public void display1()
	{
		System.out.println("Welcome");		
	}
	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.display();
		obj.display1();
		System.out.println(obj.a);
				

	}

}
