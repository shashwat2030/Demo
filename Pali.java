import java.util.Scanner;
class Pali {
   public static int palinDrome(int n)
	{
		int res =0;
		int rem =0;
		int pali=n;
		while(pali != 0)
		{
			rem =pali %10;
			res =(res*10)+rem;
			pali/= 10;
		}
		int rev =res;	
		return rev;
	}
   public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
    int n =sc.nextInt();
	int rev =TestClass.palinDrome(n);// the most powerful line holding the program
	if (n == rev)
	{
		System.out.println("Palindrome Number");
	}	
		else
		{
			System.out.println("Non Palindrome_Number");
		}

	}
}