import java.util.Scanner;

public class TestClass {
	public static void main(String []args)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter_size:");
	int n =sc.nextInt();
	
	System.out.println("SquareHollow Pattern:");
	Patterns.sqHllowPatt(n);
	
	System.out.println("NumberTriangle Pattern:");
	Patterns.noTriaPatt(n);
	
	System.out.println("Inverse_Number_Triangle Pattern:");
	Patterns.inNOtriaPatt(n);
	
	System.out.println("NumberIncreasingPyramid Pattern:");
	Patterns.noIncPyraPatt(n);
	
	System.out.println("NumberIncreasingreversePyramid Pattern:");
	Patterns.renoIncPyraPatt(n);
	
	System.out.println("NumberChangingPyramid Pattern:");
	Patterns.noChgPyraPatt(n);
	
	System.out.println("Zero-One_Triangle Pattern:");
	Patterns.zeOntriaPatt(n);
	
	System.out.println("Pallindrome_Triangle Pattern:");
	Patterns.paliTriaPatt(n);
	
	System.out.println("Rhombus Pattern:");
	Patterns.rhomPatt(n);
	
	System.out.println("Diamond Pattern:");
	Patterns.diaPatt(n);
	
	System.out.println("Butterfly_Star Pattern:");
	Patterns.butStPatt(n);
	
	
	System.out.println("Square_Fill Pattern:");
	Patterns.sqFilPatt(n);
	
	System.out.println("Right_Half_Pyramid Pattern:");
	Patterns.riHalPyraPatt(n);
	
	System.out.println("Reverse_Right_Half Pattern:");
	Patterns.reriHalPyraPatt(n);
	
	System.out.println("Left_Half_Pyramid Pattern:");
	Patterns.leHalPyraPatt(n);
	
	System.out.println("Reverse_Left_Half Pyramid");
	Patterns.releHalPyraPatt(n);
	
	System.out.println("K Pattern:");
	Patterns.kPatt(n);
	
	System.out.println("Triangle_Star Pattern:");
	Patterns.triaStPatt(n);
	
	System.out.println("Reverse_Number_Triangle Pattern:");
	Patterns.renoTriaPatt(n);
	
	System.out.println("Mirror_Image_Triangle Pattern:");
	Patterns.miImgtriaPatt(n);
	
	System.out.println("Hollow_Triangle Pattern:");
	Patterns.holTriaPatt(n);
	
	System.out.println("Hollow_Reverse_Triangle Pattern:");
	Patterns.holReTriaPatt(n);
	
	System.out.println("Hollow_Diamond_Pyramid Pattern:");
	Patterns.holDiaPatt(n);
	
	System.out.println("Hollow_Hourglass Pattern:");
	Patterns.holHrPatt(n);
	
	System.out.println("Pascal_Triangle Pattern:");
	Patterns.pasTriaPatt(n);
	
	System.out.println("Right_Pascal_Triangle Pattern:");
	Patterns.riPasTriaPatt(n);
	
	
	}
}