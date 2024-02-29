package string;

public class Stringpalin
{
	public static void main(String args[])
	{
		String str="MALAYALAM";
		String str1="JAVA";
		String rev1="";
		String rev2="";
		int a=str.length();
		int b=str1.length();
		for(int i=(a-1);i>=0;--i)
		{
			rev1=rev1+str.charAt(i);
		}
		if(str.toLowerCase().equals(rev1.toLowerCase()))
		{
			System.out.println(str+ " String is Palindrome");
		}
		else
		{
			System.out.println(str+ " String is Not a Palindrome");
		}
		for(int j=(b-1);j>=0;--j)
		{
			rev2=rev2+str1.charAt(j);
		}
		if(str1.toLowerCase().equals(rev2.toLowerCase()))
		{
			System.out.println(str1+ " String is Palindrome");
		}
		else
		{
			System.out.println(str1+ " String is Not a Palindrome");
		}
	}
}
	