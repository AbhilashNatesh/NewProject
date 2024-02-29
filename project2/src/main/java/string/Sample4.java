package string;

public class Sample4 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Welcome");
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		//System.out.println(str.reverse());
		System.out.println(str.isEmpty());
		//System.out.println(str.delete(1, 3));
		System.out.println(str.insert(1, "k"));
	}

}
