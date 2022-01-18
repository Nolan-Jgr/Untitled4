//Nolan Jaeger
//CSE 1322L
//Jorge
//Spring 2021
//Lab 11
package lab11;
import java.util.*;

public class Exceptions {
	@SuppressWarnings("finally")
	public static int changeToNum(String str)
	{
		String[] s = str.split(":",3);
		String s1 = "";
		String s2 = "";
		String s3 = "";
		int x = 0,y = 0,z = 0;
		try {
			s1 = s[0];
			s2 = s[1];
			s3 = s[2];
			if(s.length != 3)
			{
				throw new InvalidTimeException("Invalid Time format");
			}
			x = Integer.parseInt(s1);
			if(x >= 24 || x < 0)
			{
				throw new InvalidTimeException("Hour must be below 24 and above 0");
			}
			y = Integer.parseInt(s2);
			if(y >= 60 || y < 0)
			{
				throw new InvalidTimeException("Minutes must be below 60 and above 0");
			}
			z = Integer.parseInt(s3);
			if(z >= 60 || z <0)
			{
				throw new InvalidTimeException("Seconds must be below 60 and above 0");
			}
		}
		catch(InvalidTimeException e)
		{
			System.out.println("Exception thrown: " + e.getMessage());
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException i)
		{
			System.out.println("Exception thrown: Invalid time input");
			System.exit(0);
		}
		finally {
			return (x*60*60) + (y*60) + z;
		}
	}
	public static void main(String[]args)
	{
		System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String first = scan.nextLine();
		int f = changeToNum(first);
		System.out.println();
		System.out.println("Enter time 2 in  24hr format as follows (HH:MM:SS)");
		String second = scan.nextLine();
		int s = changeToNum(second);
		System.out.println();
		System.out.println("First: " + first + "\nSecond: " + second);
		System.out.println("Difference in seconds: " + (s-f));
	}

}
