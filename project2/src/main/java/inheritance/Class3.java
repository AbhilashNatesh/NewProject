package inheritance;

public class Class3 extends Class2{
	public void display2()
	{
		int totalsalary=(basicpay+hra+pf+bonus)-(deduction);
		System.out.println("Total Salary = "+totalsalary);
	}

	public static void main(String[] args) {
		Class3 obj1=new Class3();
		System.out.println("Basic Pay = "+obj1.basicpay);
		System.out.println("HRA = "+obj1.hra);
		System.out.println("PF = "+obj1.pf);
		System.out.println("Bonus = "+obj1.bonus);	
		System.out.println("Deduction = "+obj1.deduction);
		obj1.display2();
	}

}
