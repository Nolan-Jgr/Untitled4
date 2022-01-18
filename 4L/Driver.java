package lab12;
import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[]args)
	{
		try {
			System.out.println("Input first file name");
			@SuppressWarnings("resource")
			Scanner names = new Scanner(System.in);
			String file1 = names.next();
			System.out.println();
			System.out.println("Input second file name");
			String file2 = names.next();
			System.out.println();
		String str1 = "";
		File myFile1 = new File(file1);
		String str2 = "";
		File myFile2 = new File(file2);
		@SuppressWarnings("resource")
		Scanner scan1 = new Scanner(myFile1);
		@SuppressWarnings("resource")
		Scanner scan2 = new Scanner(myFile2);
		int line = 0;
		while(scan1.hasNextLine() && scan2.hasNextLine())
		{
			str1 = scan1.nextLine();
			str2 = scan2.nextLine();
			if(!str1.equals(str2))
			{
				line++;
				System.out.println("Line " + line);
				line++;
				System.out.println("<" + str1);
				System.out.println(">" + str2);
			}
			if((!scan1.hasNextLine() && scan2.hasNextLine())||(scan1.hasNextLine() && !scan2.hasNextLine()))
			{
				System.out.println("Files have different number of line");
			}
			
		}
		}
		catch(IOException io)
		{
			System.out.println("Error: " + io.getMessage());
		}
		
	}

}
