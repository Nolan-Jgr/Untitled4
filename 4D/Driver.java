//Name:			Nolan Jaeger 
//Class:		1322L
//Instructor:	Jorge
//Term:			Spring 2021
//Lab:			4
package lab4;
import java.util.*;
public class Driver extends Account{
	public static void main(String[] args)
	{
		Checking x = new Checking(500.00);
		Savings y = new Savings(1100.00);
		String menu = "What would you like to do?\n1. Withdraw from Checking\n2. Withdraw from Savings\n3. Deposit to Checking\n4. Deposit to Savings\n5. Balance of Checking\n6. Balance of Savings\n7. Award Interest to Savings now\n8. Quit";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(menu);
		int input = scan.nextInt();
		while(input != 8)
		{
			switch(input)
			{
			case 1: 
				System.out.println("How much would you like to withdrawal?");
				double w = scan.nextDouble();
				x.withdrawal(w);
				break;
			case 2:
				System.out.println("How much would you like to withdrawal?");
				double s= scan.nextDouble();
				y.withdrawal(s);
				break;
			case 3: 
				System.out.println("How much would you like to deposit?");
				double d = scan.nextDouble();
				x.deposit(d);
				break;
			case 4:
				System.out.println("How much would you like to deposit?");
				double a = scan.nextDouble();
				y.deposit(a);
				break;
			case 5:
				System.out.println("Current balance of Checking " + x.getAcc_Num() + " is " + x.getAcc_Bal());
				break;
			case 6:
				System.out.println("Current balance of Savings " + y.getAcc_Num() + " is " + y.getAcc_Bal());
				break;
			case 7:
				y.addInterest();
				break;
			default:
				break;
			}
			System.out.println();
			System.out.println(menu);
			input = scan.nextInt();
		}
	}

}
