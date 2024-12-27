import java.util.*;
import java.lang.String;
public class JavaPracticeSet3
{
public static String LC(String str)
{
System.out.println("LowerCase:"+str.toLowerCase());
return str;
}
public static String Replace(String str)
{
System.out.println("Replace_String:"+str.replace(" ","_"));
return str;
} 
public static void RepTemp(String name)
{
String temp ="Dear <|name|> ,Trans a lot";
String joining =temp.replace ("<|name|>",name);
System.out.println("The_resultant_string_is:"+joining);

}
public static void  findSpace(String str)
{
boolean Dus =str.contains(" ");
boolean Tris =str.contains("   ");
System.out.println("\nResults");
if(Dus)
{
	System.out.println("Dual_Space");
}
else 
{
	System.out.println("Non_Dual_Space");
}
if(Tris)
{
	System.out.println("Triple_Space");
}
else
{
	System.out.println("Non_triple_Space");
}
//OR
System.out.println("Dual_Space:"+str.indexOf("  "));
System.out.println("Triple_Space:"+str.indexOf("   "));
}
public  static void Format ()
{
String letter="Dear Harry,\nThis java course is nice";
System.out.println(letter);
}
public static void main(String []args)
{

	Scanner sc = new Scanner(System.in);
System.out.println("Enter_String_for_1st_func:");
String str =sc.nextLine();
JavaPracticeSet3.LC(str);
System.out.println("Enter_String_for_2nd_func:");
String str1 =sc.nextLine();
JavaPracticeSet3.Replace(str1);
System.out.println("Enter_String_for_3rd_func:");
String name  = sc.nextLine();
JavaPracticeSet3.RepTemp(name);
System.out.println("Enter_String_for_4th_func:");
String str3 =sc.nextLine();
JavaPracticeSet3.findSpace(str3);
System.out.println("Calling_5th_func:");
JavaPracticeSet3.Format();
sc.close();
}
}