import java.util.Scanner;
public class JavaPracticeSet4
{
	
public static int agE(int age)
{
 if (age ==11)
{
System.out.println("I am "+age);
}
else
{
System.out.println("I am not 11");
}
return age;
}

public static double Pass(double hindi,double eng,double math)
{
double sum =hindi+eng+math;
double percent =((sum)/300)*100;
if(percent >=40 && percent>=33)
{
System.out.println("Passed_Std");
}
else
{
System.out.println("Failed_Std");
}
return percent;
}

public static void incTax(double inc)
{
Scanner sc = new Scanner(System.in);
double tax=0;
if(inc<250000)
{
tax=0;
System.out.println("Your_Tax:"+tax);
}
else if(inc>=250000 || inc<=500000)
{
tax=(inc)*0.05;
System.out.println("Your_Tax:"+tax);
}
else if(inc>=500000 || inc<=1000000)
{ 
tax =(inc)*0.05;
System.out.println("Your_Tax:"+tax);
}
else if(inc>=1000000)
{
tax=(inc)*0.30;
System.out.println("Your_Tax:"+tax);
}
}

public static void daY(int day)
{
switch(day)
{ 
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Invalid_Day");
break;
}
}
public static int yR(int yr)
{
if(yr % 4==0 || yr% 400==0)
{
System.out.println("Leap_Year");
}
else
{
System.out.println("Non_Leap_Year");
}
return yr;
}

public static void doMain(String dom)
  {
	  
  switch(dom)
  {
  case "com":
  System.out.println("Commmercial_Domain");
  break;
  case "org":
  System.out.println("Organisation_Domain");
  break;
  case "in":
  System.out.println("Indian_Domain");
  break;
 default:
 System.out.println("Others");
 break;
  }
  
  }



public static void main(String [] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter_age:");
int age =sc.nextInt();
JavaPracticeSet4.agE(age);

System.out.println("Enter_marks:");
double hindi =sc.nextDouble();
double english=sc.nextDouble();
double maths=sc.nextDouble();
JavaPracticeSet4.Pass(hindi,english,maths);

System.out.println("Enter_Income:");
double inc =sc.nextDouble();
JavaPracticeSet4.incTax(inc);

System.out.println("enter_day:");
int day =sc.nextInt();
JavaPracticeSet4.daY(day);

System.out.println("Enter_Year:");
int yr=sc.nextInt();
JavaPracticeSet4.yR(yr);
 
sc.nextLine();
// when multiple functions are there so its necessary to have next Line functions
// because it will protect the sc scanner object to get corrupt and to make it executable.
System.out.println("Enter_Domain:");
String dom=sc.nextLine();
JavaPracticeSet4.doMain(dom);
sc.close();
}
}