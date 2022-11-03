package basicprogram;
import java.util.Scanner;
public class SumOfNaturalNumber {
public static void main(String[]Args)
{
	int i,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter range:");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	
		System.out.println("sum of natural number from 1 to"+n+"is: " + sum);
	
}
}
