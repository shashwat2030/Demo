import java.util.*;
public class JavaPracticeSet2
{
	
	public static float cal()
	{
		float a =(7/4f)*(9/2f);
		System.out.println(a);
		return a;
	}
	
	public static char EnDegrade(char grade)
	{
		grade=(char)(grade+8);
		System.out.println("Encrypted_Grade:"+grade);
		grade =(char)(grade-8);
		System.out.println("Decrypted_Grade:"+grade);
		return grade;
	}
	
	public static void comPa( int a, int b)
	{
		if(a>b)
		{
			System.out.println("greater_no_is:"+a);
		}
		else
		{
			System.out.println("greater_no_is"+b);
		}
	
	}
	public static double velocity(double v,double u, double a,double s)
	{
		double res =((v*v)-(u*u))/(2*(a*s));
		System.out.println("Final_Val_for_1:"+res);
		return res;
	}
	public static int cal2()
	{
		int x=7;
		int a=(x*49)/x+(35/x);
		System.out.println("a_is:"+a);
		return a;
	}
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("ans_:1");
		JavaPracticeSet2.cal();
		System.out.println("ans_:2");
		System.out.println("Enter_Grade:");
		char grade=sc.next().charAt(0);
		JavaPracticeSet2.EnDegrade(grade);
		System.out.println("ans_:3");
		System.out.println("Enter_Values_for_Comparison");
		int a =sc.nextInt();
		int b=sc.nextInt();
		JavaPracticeSet2.comPa(a,b);
		System.out.println("ans_4:");
		System.out.println("Enter_Parameters_For Like Final&Initial_Velocity,Acceleration,Displacement:");
	double v=sc.nextDouble();
	double u =sc.nextDouble();
	double at=sc.nextDouble();
	double s=sc.nextDouble();
	JavaPracticeSet2.velocity(v,u,at,s);
	System.out.println("ans_5:");
	JavaPracticeSet2.cal2();
		
	}
}