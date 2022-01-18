package lab5;
import java.util.*;


public class myCollection{
	public static void main(String[]args) {
		Item[] x = new Item[5];
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input;
		System.out.println("Please enter B for Book or P for Periodical");
		input = scan.nextLine();
		for(int i = 0; i < 5;i++)
		{
			if(input.equals("B"))
			{
				System.out.println("Please enter the Title: ");
				String t = "";
				t += scan.nextLine();
				System.out.println("Please enter the Author: ");
				String a = "";
				a += scan.nextLine();
				System.out.println("Please enter the ISBN: ");
				int isbn;
				isbn = scan.nextInt();
				Book b = new Book(t,a,isbn);
				x[i] = b;
			}
			else if(input.equals("P"))
			{
				System.out.println("Please enter the Title: ");
				String t = scan.nextLine();
				System.out.println("Please enter the Issue Number: ");
				int iss = scan.nextInt();
				Periodical p = new Periodical(t,iss);
				x[i] = p;
			}
			else
			{
				System.out.println("Invalid input try again");
				i--;
			}
			if(i < 4) {
			System.out.println("Please enter B for Book or P for Periodical");
			input = scan.next();
			scan.nextLine();}
		}
		System.out.println("Your Items: ");
		for(Item i: x)
		{
			System.out.print(i.getListing());
			System.out.println();
		}
	}
}
