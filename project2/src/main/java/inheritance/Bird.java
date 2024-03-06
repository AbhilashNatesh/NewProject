package inheritance; //Hierarchical - In this case both cat and bird are extend animal

public class Bird extends Animal {
	public static void main(String args[])
	{
		Bird obj2=new Bird();
		obj2.display();
		System.out.println(obj2.a);
	}

}
