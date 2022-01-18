//Nolan Jaeger
//CSE 1322L
//Jorge
//Spring 2021
//Lab 9
package lab9;
import java.util.*;

public class Recursion {
	public static void main(String[] args)
	{
		String menu = "Choose from the following\n0. Quit\n1. Multiply 2 numbers\n2. Div 2 numbers\n3. Mod 2 numbers";
		System.out.println(menu);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while(input != 0)
		{
			System.out.println("Enter first number");
			int first = scan.nextInt();
			System.out.println("Enter second number");
			int second = scan.nextInt();
			switch(input)
			{
			case 1:{
				System.out.println("Answer: " + recursive_multiply(first,second));
			}
			break;
			case 2:{
				System.out.println("Answer: " + recursive_div(first,second));

			}
			break;
			case 3:{
				System.out.println("Answer: " + recursive_mod(first,second));
			}
			break;
			default:
				System.out.println("Invalid input");
			}
			System.out.println(menu);
			input = scan.nextInt();
		}
	}
	public static int recursive_multiply(int x, int y)
	{
		if(y == 1)
		{
			return x;
		}
		else if(x == 0 || y == 0)
		{
			return 0;
		}
		else
		{
			return x + recursive_multiply(x, y-1);
		}
	}
	public static int recursive_div(int x, int y)
	{
		if(y == 0)
		{
			return -1;
		}
		else if(x == y)
		{
			return 1;
		}
		else if(x < y)
		{
			return 0;
		}
		else {
			return 1 + recursive_div(x-y,y);
		}
	}
	public static int recursive_mod(int x, int y)
	{
		if(y == 0)
		{
			return -1;
		}
		else if(x < y)
		{
			return x;
		}
		else
		{
			return recursive_mod(x-y,y);
		}
	}

}


