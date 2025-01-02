import java.util.Scanner;
public class QuickQuiz
{
	public static void count()
	{
		int i;
		for(i=100;i<=200;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void nNo( int n)
	{
		int i=0;
		do
		{
			i++;
			System.out.println(i);
		}
		while(i<n);
	}
	public static void oddNo(int n)
	{
		int i;
		for(i=1;i<n;i=i+2)
		{
			System.out.println(i);
		}
	}
	public static void revNo(int n)
	{
		int i;
		for(i=n;i!=0;i--)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String []args)
	{
		JavaPracticeSet5.count();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter_Size:");
		int n =sc.nextInt();
		System.out.println("Natural_NO:");
		JavaPracticeSet5.nNo(n);
		System.out.println("Odd_Natural_NO:");
		JavaPracticeSet5.oddNo(n);
		System.out.println("Reverse_Natural_No:");
		JavaPracticeSet5.revNo(n);
	}
}