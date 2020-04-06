import java.util.Scanner;
import java.lang.*;
class Exp8
{
    int a;
	int b;
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the value of x and y:\nx:");		
		String x= sc.next();
		System.out.print("y:");
		String y= sc.next();
		System.out.println();
		try
		{
			a=Integer.parseInt(x);
			b=Integer.parseInt(y);
		}		
		catch(NumberFormatException n)
		{
			System.out.println(n);
			System.out.println("Invalid int value!!!");
			System.out.println();
		}
	}
	void showResult()
	{
		try
		{
			System.out.println("Division:"+a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Not Divisible by zero");
			System.out.println();
		}
	}
	static public void main(String args[])
	{
			
		Exp8 ex=new Exp8();
		ex.setData();
		ex.showResult();
	}
}