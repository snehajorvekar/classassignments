package basicprogram;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String []Args)
{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	num=sc.nextInt();
	if(num%2==0)
		System.out.println(num+ "is even number");
	else 
		System.out.println(num+ "is odd number");
}
}
