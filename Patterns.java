package Patterns;
import java.util.Scanner;
public class Patterns
{
	// Pattern 1
    public static void sqHllowPatt(int n)
	{// printing the hollow square 
		for( int row =1;row<=n;row++)// this loop iterates the rows in pattern
		{
			for(int col =1;col<=n;col++)// this loop iterates the columns in the pattern
			{
				// since its a hollow square the specific points in the square needs to 
				// need to be printed then these columns prints the square in the specific 
				// positions
				if(row==1 || col==1 || row==n || col ==n)
				{
				System.out.print(" * ");	
				}
				else
				{
				System.out.print("   ");	
				}
			}
			System.out.println("");
			
		}
	}
	// Pattern 2
	public static void noTriaPatt(int n)
	{
		// now this pattern prints the pattern while repeatation of the number in a triangle
	for(int row=1;row<=n;row++)
		// the first loop always its for the rows in the triangle
	{
// now for clear readilability there needs to add some special spaces into the colums
// at specific position which is calculated as total_size of the row - that single row		
	// printing special spaces there is special need of extra loop
	for(int col=1;col<=n-row;col++)
    {
	System.out.print(" ");
    }

		for(int col=1;col<=row;col++)
		{
			System.out.print(row);
		}
		System.out.println("");
	}	
	}
	// Pattern 3
	public static void inNOtriaPatt(int n)
	{
		// now this patterns just prints the inverse of the  loop
		// loop as mentioned in the number triangle pattern while the same patterns in the reverse
		// order and printing from end to begining
		// printing the rows using the for loop
		for(int row =1;row<=n;row++)
	{
		// for perfection adding the extra space into the code and just adding those space
		// better impression of the project
		for(int col=1;col<=n-row;col++)
    {
	System.out.print(" ");
    }
// now the one point to need to be specified that the only way to print the repeatative value
// of 1 and 2 is get the print value of the rows this shows the working of the firs for loop
// in the row how does it iterates

		for(int col=row;col<=n;col++)
		{// this loop only prints the value in the column in the pattern
			System.out.print(row);
		}
		// again there is nothing to be printed with the for loop given in the first 
		// given rows represented by the double quotes with nothing.
		System.out.println("");
	}	
	}
	// Pattern 4
	// so far with the patterns its just simple pattern with just moving ahead with the 
	// printing the counting numbers from left side of the command prompt of the programmer.
	// increasing count but count starts from the previous count
	public static void noIncPyraPatt(int n)
	{
	for(int row =1;row<=n;row++)
		// this loop prints the rows for n times as input from the user
	{
		for(int col=1;col<=row;col++)
		{// now different values of n you need to print the 
	// column the pattern is signigificant because it shows the basic working the of inner loop
	//begin from 1 and end towards the n which is agian the user input size
			System.out.print(col);
			//basically it print s each different value in each iteration
		}
		System.out.println("");
		// noting to print the index loop
	}		
	}
	// Pattern 5
	// this is just reverse of the above mentioned pattern to print the 
	// columns as given in the pattern it shows the reverse no to be printed 
// and deriving the pattern as per the logic same number from previous iteration 
// where each rows number is printed with one less item	
	public static void renoIncPyraPatt(int n)
	{
	for(int row =n;row>=1;row--)
		// now this loop just prints the rows  in the reverse order
	// its just initialising the rows with n and decrement it till less then or equal to 1
		{
			for(int col=1;col<=row;col++)
			{
				// now printing the columns value initialising with 1 and incrmenting each loop
				// with less than row
				// different no to be get printed only by column so the main is columns loop
				// because this loop only prints the pattern
				System.out.print(col);
			}
			System.out.println("");
			//again neat and clean // i th iteration
		}
	}	
	// Pattern 6
	// this is challenging patterns because its lets  you think
	// in new way // special thought of pooja maam to whome we missed the question
	// its just the printing the natural number countin from 1 to 10
	public static void noChgPyraPatt(int n)
	{
		int num =0;
		//this variable is the key factors this pyramid as 
		//without this variable its would not possible to increment 
		// the following number with each iteration

	for(int row =1;row<=n;row++)
// now this is the first loop which prints the rows specifiying
//initialised with 1 iterate till the nth item.
{
		for(int col =1;col<=row;col++)
	{
		num++;
		// incrementing the number with increment operator
		// and now printing the value on the output screen
		System.out.print(num+" ");
	}
System.out.println(" ");		
// now printing the nothing element with the ith iterate 
	}	
	}

	// Pattern 7
	// this is special pattern with zero and 1 with triangle 
	// pattern becuase it lets you think that each element should be
	// printed on with specifice position 

	public static void zeOntriaPatt(int n)
	{
		// now printing the rows with each iteration initialising with
		// initial values as 1 and iterating less than n 

		for(int row =1;row<=n;row++)
	{
		// now the printing values as specified as iteratinig on each
		// pattern i.e. printing values as 1 on even location
		// now then printing the column values as 0 on odd  location

		for(int col=1;col<=row;col++)
		{
			if((col+row)%2==0)
			{
				System.out.print(1+"");
			}
			else
			{
				System.out.print(0+"");
			}
		
	}		
	System.out.println("");
	// now printing the system values with nothing in the rows as fine well structured
	// its just printing nothing in the iteration in the ith value.
	}
		
	}
	//Pattern 8
	// now this is very special pattern as printing the palindrome triangle 
	// this is special pattern because its challenges you to think the triangle
	// this is the only way for showing that you need to think for specific patterns and
	// breaking the pattern into two equal halves just printing the pattern of palindrome
	// with triangle is just out of box thinking

	public static void paliTriaPatt(int n)
	{	 
	// now printing the values of rows which is less than n with the initial values from 1
	for(int row =1;row <=n;row++)
	{
		// now printing the column with specific structured and just printing the 
		// spaces with the rows in the pattern with particularly at 2 times (difference between n
		// size of the column and less than row

		for(int col=1;col<=2*(n-row);col++)
		{
			System.out.print(" ");
		}
		// now printing the column initialized with the row value and adding less than 1
		// and decrementing the column initialised with rows and decrementing less than equal to 
        // one decrementing to print the reverse order values of the left hand side
		for(int col =row;col>=1;col--)
		{
		System.out.print(col+" ");	
		// printing the values on the left side of the patterns initialized with the initial
		// values of 1 and decrementing till less then equal to one
		}
		// now this is the another loop for the pattern initialised with two and iterating till
		// rows values
		for(int col=2;col<=row;col++)
		{
			System.out.print(col+" ");
		}
		System.out.println("");
		// now iterating values for this factor and printing the values 
		// of nothing ness on the screen to make it neat and clean
	}
// this is the star mark question for the following type	
	}

	//Pattern 9
	// this is very simple question with just having a cup of tea for square pattern 
	// just to approach the no of times star pattern no are printed on the screen in the rows 
	// and the no of time its printed in the column

	public static void rhomPatt(int n)
	{
		// no of times its printed on the screen i.e. the no of times the rows are printed
		
		for(int row =n+1;row>=1;row--)
		{
			// no of times its printed on the screen i.e. the no of times the columns
			// the specific space where every no of times printed in columns for every specific
			// now the well structured in the pattern

			for(int col =1;col<=(2*n-row);col++)
			{
				System.out.print(" ");
			}

			// now printing the star pattern where to print on the screen

			for(int col =1;col<=n;col++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

	//Pattern 10
	// it was an easy pattern just need the hit and trial method to create the diamond as  a 
	// part of cgm which made possible to draw the for loop hit and trial

	public static void diaPatt(int n)
	{
		//first of all initialising the row from the whole initial values 1 and iterating
		// it to less than or equal to n

	for(int row =1;row<=n;row++)
	{
		// inner loops for creating the specific position space and just generating space
		// at specail location total size of rows and row

		for(int col=1;col<=(n-row);col++)
		{
			System.out.print(" ");
		}

		// now the inner loop for printing the diamond or star by printing it less than
		//equal to the no of row

		for(int col=1;col<=row;col++)
		{
			System.out.print(" * ");
		}

		// now its the last time iterating the last line with no  structure from ith loop
	System.out.println(" ");
		}
		// now printing the mirror image for the diamond by skipping the nth iteration
		// so since its mirror so initialising the n-1 iteration and 
		// iterating it for less than 1

	for( int row =n-1;row>=1;row--)
	{
		// similarly copying the same line for space

	for(int col=1;col<=(n-row);col++)
	{
		System.out.print(" ");
	}
	// and now just compeleting the diamond pattern with mirror image or the reverse loop
	for(int col=1;col<=row;col++)
	{
		System.out.print(" * ");
	}
	// again drawing the last part of the loop
	System.out.println(" ");
	}
	}
	
	
	//Pattern 11
	// its butterfly pattern the again of the most challenging pattern other then pallindrome pattern
	// the most logical and iterative with most iterative for loop challenge

	public static void butStPatt(int n)
	{
		// initialisng the upper part of feather and the upper side of the butterfly with 
		// initialising the row with initial values as 1 and and iterating it less than or equal to 
		// n

		for(int row =1;row<=n;row++)

{
	// intialisng the column and the making the basic structure of left side of the butterfly
// making it the left part or feather  of the butterfly

	for(int col =1; col<=row;col++)
	{
		System.out.print("*");
	}

	// adding the specific space for imparting the rows and columns and making it more spefic
	// with the structure

	for(int col=1;col<=2*(n-row);col++)
	{
		System.out.print(" ");
	}

	// now making the right part of the feather of the butterfly and making the diagram with more 
	// acurracy and making it for more specific part of the loop for 
	// initialising the col with initial value as 1 and less than or equal to row and 
	// incrementing the column
	for(int col =1; col<=row;col++)
	{
		System.out.print("*");
	}
	// now the part next line its should be not left empty otherwise it will create 
	// an compile time error
	System.out.println(" ");
}
// now creating the lower part of the loop just making it lower body of the butterfly and making
// it very specific for lowering part of the butterfly and just the lower left feather of the
// of the feather of butterfly
for(int row =n;row>=1;row--)
{
	// now reversing the column with drawing the lower part of the column
	// and drawing the less then or equal to value
	for(int col=row;col<=n;col++)
	{
		System.out.print("*");
	}
	// now adding the specifice space with lower side to differentaite with lower left and lower 
	// right feather of the butterfly
	for(int col=1;col<=2*(n-row);col++)
	{
		System.out.print(" ");
	}
	// and now drawing the the lower right feather part of the butterfly
	for(int col =1; col<=row;col++)
	{
		System.out.print("*");
	}
	// now this is mandatory nextline for drawing the next or moving towards the next line
	System.out.println(" ");
}
	}

	// Pattern 12
	// the most easy pattern  its piece of cake for the drawing the square on the prompt
	
	public static void sqFilPatt(int n)
	{
		
		// intialising the row side with initial 1 and iterating the loop till it n value
		
		for(int row=1;row<=n;row++)
		{
			// initialsing the column side with initial 1 and iterating the loop till its n value
			for(int col=1;col<=n;col++)
			{
				System.out.print("* ");
			}
			// now moving towards the next line as usual
			System.out.println("");
		}
	}
	// Pattern 13
	// its just another practices to concreate your logic 
	// the basic logic of triangle by the for loop in the programmer left hand side and 
	//very basic and geniune
	
	public static void riHalPyraPatt(int n)
	{
		// initialising the row with initial values as 1 and iterating it to the less than or
		//or equal to n		
		for (int row=1;row<=n;row++)
	{
		// initialising the column with the initial values as 1 and iterating it to the less
		// then or equal to row so that the no of elements it will be equal to row
		
		for(int col=1;col<=row;col++)
		
		{
			// now printing the value to be prompt
			System.out.print("* ");
		}
		// now iterating the next line of the code with needed double quotes representing nothing
		System.out.println("");
	}
	}
	// Pattern 14
	// now its just the method to draw the reverse of right half pyramid patterns
	// just moving with other slice of code
	public static void reriHalPyraPatt(int n)
	{
		// now then making initial values with 1 and making it to iterate through
		// each line of the code with the initialising the row
		// now one thing is very import either your start the row with initial value 1 or increment
		// it to the less than equal to n
		// or intialize the row with n and iterate it less than or equal to 1 with decrement it
// to both will iterated the some no of iteration bu their sequence will be different in each
// iteration so just think logically to choose
//like increment sequence always initialize to 1 and iterate it to last or n th value of the 
// row and printing the original sequence but for reverse sequence generally prefer to
// initialize the loop with n and decrement it to less than or equal to 1	
		
		for(int row=1;row<=n;row++)
		{
			// now then creating the colum since its reverse patter and we are incrementing
			// then we need to follow the special laws for iterating the columns i.e. initialize 
			// the column with row value and iterate it to less than or equal n-1 so 
			// making it always less than row that is constructing the revere order
		
			for(int col=row;col<=n-1;col++)
			{
				System.out.print("*");
				//printing prompt value.
			}
			// and iteratig the last value with with star
			System.out.println("*");
		}
		
	}
	// Pattern 15
	// same above with different formation of loops same work same methods with a new face
	// new logic and new working simple and more efficeint approach contributed by shraddha khapra
	// of apna college one of the microsoft experts to be fetched
	  public static void reriHalPyraPatt2(int n)
	{
		// now initialising the for loop for printing the row with initial values as n and 
	// decrementing each iteration till less than or equal to 1
		for(int row=n;row>=1;row--)
		{
			// now just incrementing the column with initial values 1 and iterrating it to less than
			// or equal to row
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			// now just have the printing the manipulation command for iterating the row with the star
			// remember its the element in the next line iteration
			System.out.println("*");
		}
		
	}
	// Pattern 16
	// again similar pattern like right half triangle but its the fact that 
	// its just specified pattern due to the spaces in it just to having the specified 
	// value with the space making a shift to or right from programmer's hand 
	
	public static void leHalPyraPatt(int n)
	{
		//  initialising the loop with the initial values and looking forwards towards the
		// first loop  and moving towards the second concept
	for(int row =1;row<=n;row++)
	{
			// now initialising the main component i.e. with value 1 and printing the loop with
			// specific pattern less than or equal twice the difference of total size
			// and row and incrementing the loop
	
			for(int col=1;col<=2*(n-row);col++)
		{
			System.out.print(" ");
			// now just moving behind the space which makes its shift from rigtht  to left
		}
		// now just iterating the column for printing the pattern
		for(int col=1;col<=row;col++)
		{
			System.out.print("* ");
		}
		// now printing the next Line with the  representation of the nothing 
// in the 	form of double quotes	
		System.out.println("");
	}
	}
	// Pattern 17
	// again piece of cake after solving the butterfly pattern
	public static void releHalPyraPatt(int n)
	{ 
	// now initialising the row initialising with the value of n and decrementing the row less
	// then or equal to 1 and decrementing the loop
	for(int row =n;row>=1;row--)
		{
			// now basically initialising the column with initial values 1 and iterating with
			// less than or equal to differene of total size of  pattern - row and incrementing
			// the column with printing the spaces just adding the well structured 
			// to the pattern
			for(int col=1;col<=(n-row);col++)
			{
				System.out.print(" ");
			}
			// now just printing the pattern with the initial values with 1 and less than
			// equal to row 
			for(int col =1;col<=row;col++)
	         {
				 System.out.print("*");
				 // printing the star pattern on the prompt
			 }
			 // as usual the nextline printed with double quotes representing nothing ness
			 System.out.println(" ");
		}	
	}
	// Pattern 18
	// another piece of cake of after solving the butterfly you will play with these
	// just another problem on cup plate
	public static void kPatt(int n)
	{
		// initialising the row with initial values n as we need the reverse pattern with
		// for upper part of the k and now iterating the loop till less than or equal to 1
		// using decrement the operator just reverse the pattern for lower part of the k
	for(int row =n;row>=1;row--)
	{
		// now the printing the column with  initialising the value with 1 and then icrementing 
		// the column value till the row i.e. less than or equal to row
		for(int col=1;col<=row;col++)
		{
			System.out.print("*");
		}
		// now printing the next Line in the next Iteration with representing the nothing in double
		// quotes
		System.out.println(" ");
	}
	// now again just assigning the value with lower part of the pattern k and assigning row with 
	// 1 and iterating to less than or equal to one generating the incrementing pattern in 
	//each iteration and making the second part of the pattern complete
for( int row =1;row<=n;row++)
{
	// printing with normal columnn with initialisg it to 1 and adding the elements less than or 
//equal to rows in each 
//iteration and printing the stars in each iteration
	for(int col=1;col<=row;col++)
	{
		System.out.print("*");
	}// now usually print the next line with double quotes as representing nothing.
	System.out.println(" ");
}	
	}
	
	// Pattern 19
	// another piece of cake after solving the k_star_pattern
	// just follows the basic structure of coding and basically the common
	// loop structure and having the basic structure of for loop
	// making the use of the basic logic

	public static void triaStPatt(int n)
	{
		// intialising the row with 1 iterating it with less than or equal to n
		for (int row =1;row<=n;row++)
		{
			// its just the form factor to create triangle with just having the 
			// piece of code iterating less than or equal to difference of total size
			// and row incrementing the col with increment operator
			for(int col=1;col<=(n-row);col++)
			{
				System.out.print(" ");
				// basically adding the space with having well structured loop
				// printing the spaces in between the loops
			}
			for(int col =1;col<=(row);col++)
			{
				// now to iterate with 1 to less than equal to n  the main pattern element
				// in the column
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
		
	}
	// Pattern 20
	// now again cup of cake for me just to implement with the logic of well structured 
	// reverse number triangle just making the commit of revering the central triangle 
	// pattern
	public static void renoTriaPatt(int n)
	{
		// initialising the row with initial values with 1 and and iterating with 1
		// just making the commit for initialising 1 to n incrementing the row plus operator
		for(int row =1;row<=n;row++)
		{
			// just initialising with 1 to n and incrementing with the increment operator
		for(int col=1;col<=n;col++)
		{
			System.out.print(" ");
		}
		// now just central triangle with row to n so that to have pattern of starting 
		//with the row no and iterating with the less than or equal to n
			for(int col=row;col<=n;col++)
			{
				System.out.print(" "+col+" ");
			}
			System.out.println("");
		}
	}
	// Pattern 21
	// now this is the mirror Img Triangle pattern just very smooth and fine 
	// very trendy just need to have the iteration for initialising with row equal
	//to 1 and iterating it less than equal to n
	public static void miImgtriaPatt(int n)
	{
		// initialising with 1   less than or equal to n and incrementing with increment
		// operator just adding the basic strucure to print any row  just making it the
		// intialised with 1 less then equal to n and increment operator
	for(int row =1;row<=n;row++)

		// similarly it combination of above function with upper part initialised with
		// row and less than equal to n and increment plus
		{
		for(int col=row;col<=n;col++)
		{
			// now just printing the value of col which necessary to build the upper part
			// of the body
			System.out.print(" "+col+" ");
		}
		// iterating statement very important to have the iteration to the next line
		System.out.println(" ");
	}
	// now the lower part of the for loop just initialising with n-1 and decrementing it
	// to less than equal to 1 with the decrement operator
    for(int row=(n-1);row>=1;row--)
	{
	// now the basic column structure to print the column less than or equal to n
	// basically printing the lower part of the column with the increment operator
for( int col=row;col<=n;col++)
{
	System.out.print(" "+col+" ");
	
}
// now just iterating  to next line and making the print to next line to move ahead
System.out.println(" ");
	}	
	
	}

	// Pattern 22
	// again tough challenge which is very much challenging and very much powerful as its just follow 
	// the hollow square analogy but to identify you need to be keen observer and very powerful man
	// you need to be very precise with the contextual basis and very big identifier of your thoughts of
	// execution
	public static void holTriaPatt(int n)
	{
		// now very basic initialize with initial values 1 and iterate it to less than or equal to n
	for(int row =1;row<=n;row++)
	{
		// now just for mainting the well structured ness of the pattern we need to the the spaces at the specific 
		// position since it should be not extremely less nor it should be extremely more that it should be
		// mean of the space
		for(int col=row;col<=n;col++)
		{
			// since the spaces are to be mean then it should iterate till less than or equal to n
			System.out.print(" ");
		}
		// now initialising the column with 1 and iterating it to less than or equal to 2 times multiplied
		// with row and difference of 1 i.e. the specific condition of the pattern need to be follow
		// and printing the specifice pattern elements required by the pattern
		for(int col =1;col<=((2*row)-1);col++)
		{
			// since its a hollow triangle then we need to drive only specific positon elements 
			// to make it hollow triangel because the core logic of hollow triangle is that it should
			// be printing at specific position for the structure so the element part at specific point
			if(col==1 || row==n|| col==(2*row -1) )
			{
				System.out.print("*");
			}
			else
			// now we are talking to mainitain the structure by following the emptiness of the hollow triangle 
			// which is core part of hollowness i.e. emptiness 
			{
				System.out.print(" ");
			}
		}
			// now as usual iterating to the next line of the structure.
			System.out.println("");
		}
	}
	
	
	// Pattern 23
	// just piece of cake after above triangle with only difference that whole loop should be executed in reverse 
	// order
	public static void holReTriaPatt(int n)
	{
// now initialising the specific position for reverse order of the pattern
// just initialize the row with n and decrement the iteration it to less than
// or equal to 1 and decrement regualarly 
	for(int row =n;row>=1;row--)
	{
		// now again maintaining the well structured pattern it should be
		// it should be initialised with the row and it should be less then
		// or equal to n i.e. mean value space
		// now to summarize spaces should be of 4 kinds
		// very equal i.e. n-row
		// very equal form has different forms in terms of multiples  of m
		//i.e m* 2(n-row) 
		// greater or mean -n
		// since it is reverse pattern then initialised with row and iterate
		// it to less than or equal to n
		for(int col=row;col<=n;col++)
		{
			// now just be implementing the spaces 
			System.out.print(" ");
		}
		// now initialising the col =1 and maintaining the well structured
		// 2 times the rows with difference of 1 and iterating col as per
		// need of the patterns
		for(int col =1;col<=((2*row)-1);col++)
		{
			// now just specifying the position with vallues as follows
			// column is equal to 1
			// row is equal to n
			// column is equal to 2 times row difference with 1  
			if(col==1 || row==n|| col==(2*row -1) )
			{
				System.out.print("*");
				// printing the values with star
			}
			else
			{
				// printing the hollow ness of the reverse triangle as its very
				// necessary to maintian as just it 
				// just printing the howllow space
				System.out.print(" ");
			}
		}
			// now just iterating to the next line
			System.out.println("");
		}
	}
	// pattern 24
	// again printing the hollow diamond with the following
	// necessary steps to follow
	// just peice of cake above after howllow triangle pattern
	public static void holDiaPatt(int n) 
	{
		// now just initialsing the row with 1 and iterating to less than
		// or equal to n and increment it 
		for (int row = 1; row <=n; row++) 
		{
			// now just moving the to column i.e. less than or equal to
			// difference of the total size and row maintianging first
			//type of space i.e. lesser or equal space
			for (int col = 1; col <= (n-row); col++) 
			{
				// printing the space
				System.out.print(" ");
			}
			// now iterating through the loop section for printing
			// at the specific part of the loop
			// i.e. less than or equal to twice multiplication and subtracting
			// 1 just following the necessary condition of the pattern  
			for (int col = 1; col <= (2 * row - 1); col++) 
			{
				// now just initialising the column with 1 and iterating
				// it to less than or equal to twice the multiplication of row
				// with difference 1 because we have to make the diamond hollow
				//so we need to diagram it to the specific position
				// and iterate the right pattern element
				if (col == 1 || col == ((2 * row) - 1)) 
				{
					System.out.print("*");
				}
				// now analysing the else structure just printing the hollow 
				// structure of the hollow diamond with hollow space
				 else 
				{
					// this is main execution part of the hollow diamond
					System.out.print(" ");
				}

			}
			// now printing the next line iteration for the pattern
			System.out.println(" ");
		}
		// now just implementing the lower part of the hollow diamond 
		// i.e. printing the reverse of the loop part  just adding the 
		// initialised with n and decrementing it to less than or equal to 1
		for(int row=n;row>=1;row--)
		{
			// now initialising the column to 1 and iterating it to the less 
			// equal to difference of the size of the pattern and row
			// incrementing the values
			for (int col =1;col<=n-row; col++)
			 {
				// now representing the values and printing on the prompt
			System.out.print(" ");
			}
			// now initialising the column to 1 and iterating it to less than
			// or equal to multiplying the col with twice of the row and 
			// difference with 1 and iteratively increment the loop to achieve
			// the required condition of the pattern
			for(int col=1;col<=((2*row)-1);col++)
			{
				// now assigning the specific position to print the 
				// loop and so first of all analysing the position to print 
				// the element at specific position and now assigning the 
				// column value with 1 and iterating it to less than or equal
				// twice multiplication and difference of 1
				if( col==1 || col==((2*row)-1))
				{
					// now just printing the value star value on the prompt
					System.out.print("*");
				}
				else
				{
					// now assigning the space to maintian the hollowness in the
					// lower part with hollow spaces
					System.out.print(" ");
				}
				// now iterating it to the next line to the 
				// with maintainance of the not adding the any specific element
			}
			System.out.println("");
		}
	}
	// Pattern 25
	// now printing the sandclock pattern with just initialsing cup of cake 
	// which is agiain the most easy part as very similar iteration to
	// the above the sequence now its making the work very easy
	public static void holHrPatt(int n)
	{
		// now just thought for the initialisation on the work
		// initialisation with the initial values 1 and iterate it to 
		// less then equal to n i.e. printing the each loop of the iteration

	
		for(int row =1;row<=n;row++)
		{
			// now just printing the space with the column and increment
			// in the next iteration 
			// just follow the sequence initialising the column with 1 and iterating
			// twice the mulitiplication of the size with the difference of row no
			// it provide the special as the row value is always the balancing 
			// size making it provide wider space
			for(int col=1;col<=(2*n-row);col++)
			{
				// representing the spaces with the hollow space
			System.out.print(" ");
			}
			// and now working the printing the pattern on the screen and wanting 
			// to prompt the same row items as matched with the pattern and iterating
			// it less than or equal to n with the increment operator
			for(int col=row;col<=n;col++)
			{
				// and printing the column values which is the item in this program
				// completing the pattern
				System.out.print(col+" ");
			}
			// now printing the next line and iterating the to prompt to nextline
			System.out.println(" ");
		}
			// now this part prints the lower part of the sand clock and its
			// reverse the row initialising with n-1 and and iterating it to greater then
			// to equal 1 and decrementing it row
		for(int row=n-1;row>=1;row--)
		{
			// now initialising the column for spaces with well structured 
			// pattern necessary for building the exact pattern on the pattern
			for(int col=1;col<=n;col++)
			{
				// this is only spaces which is required for printing 
				// the well structured of the pattern
			System.out.print(" ");
			}
			// now thinking to print the sand clock well with values of the
			// now just making the column intialised with row and iterating
			// it to less than or equal to n and incrementing the column
			for(int col=row;col<=n;col++)
			{
					System.out.print(col+" ");
			}
			// now iterating the column for the next with nothing ness here 
			// nothingness does not mean to have hollow spaces but it would
			// be able to made a nothing with double otherwise creating compile
			// time error
			System.out.println("");
		}
			
	}
	// Pattern 26
	// the most difficult question to solve that is the 
	// question with hard core logic which is invincible 
	// now making the best use of the for loop
	// just think upon the its the tough part other palindrome 
	// triangle because its create the formula to be applied.
	public static void pasTriaPatt(int n)
	{
		// now just making the pascal triangle begin with the basic building
		// block
		// first of all intialising the space block and with initial size of the pattern
		// now here the point to be noted that its mediocare size it very responsible
		// as it will be executing the greater then or equal to n 
		 int spc =n;
		 int num;
		 // now initialising the number variable to get pattern prompted on command prompt
		 // now here comes the more specific part to be focused that 
		 //the row should be initialised with 0 otherwise it will not perform the correct computation
		 // for the next line
		for(int row =0;row<n;row++)
		{
			// now just thinking to move ahead with the triangle to print
			// now again these is only the spaces part so this column can be
			// intialised with 1 as less than or equal to spaces and incrementing
			// column with the increment operator
			for(int col=1;col<=spc;col++)
			{// the hollow spaces just is used for the defining the well structured of  the pattern
				System.out.print(" ");
			}
			// now initialising the number variable to 1 here only because othere place would result in the 
			//  otherwise it will be corrupted and not able to get utilised
			num=1;
			// now again this column is stictly formula based because if it is initialised with zero
			// iterating it to less than or equal to row and incrementing the column
			for(int col=0;col<=row;col++)
			{
				// since the column is initialised with zero and number variable is initialised with 1
				 // prompting on the screen    
				System.out.print(num+" ");
				// now just making the number variable to achieve and generate whole
				// pattern with formula of nCr making possible to geneating  the passcal triangle
				// here the main thing is to say// combination forms the main coding part possible  
			num = num*(row-col)/(col+1);
			 
			}
			spc--;
			// now decrementing the spaces with the decrement operator
			// now iterating the next line with the new line 
			// performing the iteration the for moving the pattern 
			// in the next line 
			System.out.println("");
		}
	}
	//Pattern 27
	// now this again piece of cake for me by solving the diamond pattern with just the copy of the 
	//diamond pattern its was just done pattern with nothing new and nothing to solve
	// just eating another peace of cake
	public static void  riPasTriaPatt(int n)
	{
		// now just making the row initialised with 1 and iterating it less than or equal to N
		// and now incrementing the row 
		for(int row=1;row<=n;row++)
		{ // now iterating towards the column initialised with 1 and iterate to the less
			// than or equal to row and incrementing the column
			for(int col=1;col<=row;col++)
			{// just printing the star element on the screen on the
				// just making your pattern to accomplish 
				System.out.print("*");
			}
// iterating the nextline of the pattern ending the code for upper part of the pattern
				System.out.println("");
		}
		// its just to move ahead with the row and making to code
		// initialized with n-1 to iterating the reverse pattern decremting iterative to 
		// greater than or equal to 1 
		for(int row=n-1;row>=1;row--)
		{
// initialising the column with	1 less than or equal to row and incrementing the
// column with plus		
			for(int col=1;col<=row;col++)
			{
				// just printing the star on the prompt
				System.out.print("*");
			}
			// iterating to the next line of the pattern with nothing ness sign
			// in the code lasting the code pattern
			System.out.println("");
		}
		
	}
	
	
	
}

	