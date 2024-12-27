import java.util.Scanner;
import java.lang.String;
public class SD
{
	private static double n1,n2,r;
	SD(double n1,double n2,double r)
	{
		this.n1=n1;
		this.n2=n2;
		this.r=r;
	}
public static double sqRt(double n)
{
double e=0.000001;

n2 =n/2;
while(abs(n1-n2)>e)
{
n1=n2;
n2=((n1+n/n1))/2;
}

return n2;
}

public static double abs(double n)
{
if(n>0)
{
return n;
}
else 
{
return -n;
}
}
public static double smDiv(double n)
{       
		double r=sqRt(n);
	for(int i=2;i<r;i++)
	{
		if(n%i==0)
		{
		n=i;
		}
		
	}
	return n;
}
public static double gcD(double m,double n)
{
	if(m==0)
	{
		return n;
	}
	if(n==0)
	{
		return m;
	}
	if(m==n)
	{
		return m;
	}
	if(m>n)
	{
		return gcD(m-n,n);
	}
	if(m<n)
	{
		return gcD(n,m-n);
	}
	double hcf=gcD(m,n);
	return hcf;
}
public static  String gcDS(String s1,String s2)
{
if(s2.length()>s1.length())
{
	return gcDS (s2,s1);
}	
if(s1.equals(s2))
{
	return s2;
}
if(s1.startsWith(s2))
{
	return gcDS(s1.substring(s2.length()),s2);
}
return "";
}
SD()
{}
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter_Number");
double n=sc.nextDouble();
double sd =SD.smDiv(n);
System.out.println("Smallest_Divisor:"+sd);
double res =SD.sqRt(n);
System.out.println("Square_Root:"+res);
System.out.println("call_gcd_func");
double n1 =sc.nextDouble();
double n2=sc.nextDouble();
Double hcf=SD.gcD(n1,n2);
System.out.println("The_HCF_is:"+hcf);
System.out.println("enter_1st_String:");
String s1 =sc.nextLine();
System.out.println("enter_2nd_String:");
String s2 =sc.nextLine();
String s3= gcDS(s1,s2);
System.out.println("Result:"+s3);
}
}