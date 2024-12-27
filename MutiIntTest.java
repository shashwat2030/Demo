import java.util.Scanner;
public class MutiIntTest
{
Scanner sc =new Scanner(System.in);
public  void chkInt()
{
System.out.println("enter_input:");
String x =sc.nextLine();
try
{
Integer.parseInt(x);
System.out.println("its_integer:");
}
catch(NumberFormatException e)
{
System.out.println("please_enter_right_Format");
}

}
public  void chkInt2()
{

System.out.println("enter_input:");

if(sc.hasNextInt())
{
sc.nextLine();// avoiding exception of no found line
System.out.println("its_integer:");
}
else
{
	sc.nextLine();// avoiding exception no found line
	
System.out.println("its_non_integer");
}

}
public void chkInt3()
{

System.out.println("enter_input");
String s =sc.nextLine();
boolean flag =true;
for(int i=0;i<s.length();i++)
{
if(i ==0&& s.charAt(i)==0)
{
continue;
}
else if(!Character.isDigit(s.charAt(i)))
{
	flag =false;
System.out.println("its_Character");
}
else if(flag)
{
System.out.println("Its_integer:");
}
}
sc.close();
}

public static void main(String[] args)
{
	MutiIntTest m1 = new MutiIntTest();
System.out.println("1st_function_call");		
m1.chkInt();
System.out.println("2nd_function_call");
m1.chkInt2();
System.out.println("3rd_function_call");
m1.chkInt3();
	

}

}