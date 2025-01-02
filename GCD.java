import java.lang.String;
import java.util.*;
public class GCD
{
public String strGcd(String s1,String s2)// worst case /brute_force_approach
{//Time Complexity: O(min(len1, len2)) to O(min(len1, len2) * (len1 + len2))
//Space Complexity: O(min(len1, len2))

int ln_S2=s2.length();
int ln_S1=s1.length();
if(ln_S2>ln_S1)
{
return strGcd(s2,s1);
}
if(s1.equals(s2))
{
return s1;
}
if(s1.startsWith(s2))
{
return strGcd(s1.substring(ln_S2),s2);
}
return "";
}
public String strGcd2(String s1,String s2)// Average case approach
{
	//Time Complexity: O(len1 + len2)
   //Space Complexity: O(1)		 
               
String res =s1.concat(s2);
String Reres=s2.concat(s1);
int  ln_s1=s1.length();
int  ln_s2=s2.length();
if(!res.equals(Reres))
{
return " ";
}
String finres = s1.substring(0,gcD(ln_s1,ln_s2));
return finres;
}
public int  gcD(int  n1,int n2)//Zeeshan_Sir_Code
{
if(n1==0)
{return n2;}
if(n2==0)
{return n1;}
if(n1==n2)
{return n1;}
if(n1>n2)
{return gcD(n1-n2,n2);}
if(n2>n1)
{return gcD(n1,n2-n1);}
int  hcf=gcD(n1,n2);
return hcf;

}
public int RecgcD(int n1,int n2)
{
	if(n2==0)
	{return n1;}
	return RecgcD(n2,n1%n2);
}

public String stringGcd3(String str1,String str2)// BesT_Case_Optimized_Code
{
	// Time Complexity -O(1)
	// Space Complexity-O(1)
	int len1 =str1.length();
	int len2 =str2.length();
if(!(str1+str2).equals(str2+str1))
{
	return "";
}
String res = str1.substring(0,RecgcD(len1,len2));
return res;


}

public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
GCD g1 = new GCD();
System.out.println("enter_string:");
String str1=sc.nextLine();
String str2 =sc.nextLine();
String str4=g1.stringGcd3(str1,str2);
System.out.println("Result_Calling_3rd_func:"+str4);
String str3 = g1.strGcd2(str1,str2);
System.out.println("Result_Calling_2nd_func:"+str3);
String str5 =g1.strGcd(str1,str2);
System.out.println("Result_Calling_1st_func:"+str5);
}
}