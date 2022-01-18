//Nolan Jaeger
//CSE 1322L
//Jorge
//Spring 2021
//Lab 10
package lab10;
import java.util.*;

public class RecursionCont {
	public static void main(String[]args)
	{
		System.out.print(repeatNTimes("I must study recursion until it makes sense\n",100));
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String first = scan.nextLine();
		System.out.println();
		System.out.println("Enter second string: ");
		String second = scan.nextLine();
		System.out.println();
		if(isReverse(first,second))
		{
			System.out.println(first + " is the reverse of " + second);
		}
		else
		{
			System.out.println(first + " is not the reverse of " + second);
		}
		
		
	}
	public static String repeatNTimes(String str, int x)
	{
		if(x == 0)
		{
			return "";
		}
		if(x == 1)
		{
			return str;
		}
		else
		{
			return str + repeatNTimes(str,x-1);
		}
		
	}
	public static boolean isReverse(String s1, String s2)
	{
		if(s1.isEmpty() || s2.isEmpty())
		{
			return true;
		}
		if(s1.charAt(0) != s2.charAt(s2.length()-1))
		{
			return false;
		}
		else
		{
			return isReverse(s1.substring(1),s2.substring(0,s2.length()-1));
		}
		
	}
	

}
