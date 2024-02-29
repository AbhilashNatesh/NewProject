package string;

public class Sample {

	public static void main(String[] args) {
	String str1="Hello World";
	String str2="Welcome";
	System.out.println(str1.length());
	System.out.println(str1==str2);
	System.out.println(str1.concat(str2));
	System.out.println(str1.charAt(3));
	System.out.println(str1.contains("w"));
	System.out.println(str1.replace('H', 'K'));
	System.out.println(str1.toLowerCase());
	System.out.println(str1.toUpperCase());
	System.out.println(str1.substring(0, 4));
	String arr[]=str1.split("e");
	for(String i:arr)
	{
		System.out.println(i);
	}
	}
	
	

}
