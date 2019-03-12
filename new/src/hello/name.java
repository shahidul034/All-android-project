package hello;
import java.util.Scanner;

public  class name extends overriding {
	String s;
	int a;
	Scanner in2=new Scanner(System.in);
	public static int value(int n)
	{
		return n*n;
	}
	public name()
	{
		s=in2.nextLine();
		a=in2.nextInt();
	}
	
	public String getname()
	{
		return s;
	}
	
	public int geta()
	{
		return a;
	}
	
}
