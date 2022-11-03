package basicprogram;
import java.util.Scanner;
public class Comparison {
	public static void main(String []Args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextInt();
		if(a>0) 
		{
			System.out.println(a+ " It is positive value");
			}
		else
		{
			System.out.println(a+ " It is negative value");
			}
	
	}
}