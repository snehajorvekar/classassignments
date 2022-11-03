package basicprogram;
import java.util.Scanner;
public class Subjectaddition {
public static void main(String []args)
{
	float sci,math,eng,hist,geo,total,avg,percentage;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sci marks");
	sci=sc.nextFloat();
	System.out.println("Enter math marks");
	math=sc.nextFloat();
	System.out.println("Enter eng marks");
	eng=sc.nextFloat();
	System.out.println("Enter hist marks"
			+ "");
	hist=sc.nextFloat();
	System.out.println("Enter geo marks");
	geo=sc.nextFloat();
	total=(sci+math+eng+hist+geo);
	avg=(sci+math+eng+hist+geo)/5;
	percentage=(total/500)*100;
	System.out.println("total marks are: "+total);
	System.out.println("avg marks: "+avg);
	System.out.println("Your percentage is:"+percentage+"%");
	

if(total>=300)
{
	System.out.println("pass");}
else {
	System.out.println("fail");}

if(math>sci)
	System.out.println("maxnum" +math);
else
	System.out.println("maxnum" +sci);


}
}
