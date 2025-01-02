import java.util.Scanner;
public class PaliSeq
{
public static int setPali(int n,int b,int O)
{
	int pali=n;
	int rev=0;
	if(O==1)
	{
		n/=b;
	}
	while(n!=0)
	{
		rev = rev *b+n%b;
		n/=b;
	}
	return rev;
}
public static void getPali(int n)
{
	int num;
	for(int col =0;col<2;col++)
	{
		int row =1;
		while( (num =TestClass.setPali(row, 10, col%2))<n)
		{
			System.out.println(num+" ");
			row++;
		}
	}
	
}
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter_size");
int n =sc.nextInt();
PaliSeq.getPali(n);
}1
}