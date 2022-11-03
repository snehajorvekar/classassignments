package JavaProgram;
import java.util.Scanner;
public class Div {
public static void main(String []Args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	if((num%5==0)&&(num%11==0))
	{
		System.out.println("Number "+num+ " is divisible by both 5 and 11");
	}
	else
	{
		System.out.println("Number " +num+ "is not divisble by both 5 and 11");
	}
}
}
