//Name:			Nolan Jaeger 
//Class:		1322L
//Instructor:	Jorge
//Term:			Spring 2021
//Lab:			4
package lab4;
import java.util.*;

@SuppressWarnings("unused")
public class Savings extends Account{
	private double accBal = this.getAcc_Bal();
	private static int cnt = 1;
	public Savings()
	{
		super();
	}
	public Savings(double b)
	{
		super(b);
	}
	//Override
	public void withdrawal(double x)
	{
		if(this.getAcc_Bal() - x < 500)
		{
			System.out.println("Charging a fee of $10 because you are below $500");
			this.setAcc_Bal(accBal - x);
			this.setAcc_Bal(accBal - 10.00); 
		}
		else {
			this.setAcc_Bal(accBal - x);
		}
	}
	//Override
	public void deposit(double y)
	{
		switch(cnt)
		{
		case 1:
			System.out.println("This is deposit 1 to this account");
			this.setAcc_Bal(accBal + y);
			accBal+=y;
			cnt++;
			break;
		case 2:
			System.out.println("This is deposit 2 to this account");
			this.setAcc_Bal(accBal + y);
			accBal+=y;
			cnt++;
			break;
		case 3:
			System.out.println("This is deposit 3 to this account");
			this.setAcc_Bal(accBal + y);
			accBal+=y;
			cnt++;
			break;
		case 4:
			System.out.println("This is deposit 4 to this account");
			this.setAcc_Bal(accBal + y);
			accBal+=y;
			cnt++;
			break;
		case 5:
			System.out.println("This is deposit 5 to this account");
			this.setAcc_Bal(accBal + y);
			accBal+=y;
			cnt++;
			break;
		default:
			System.out.println("This is deposit " + cnt + ". Now Charging a fee of $10");
			this.setAcc_Bal(accBal + y);
			accBal+=y;
			cnt++;
			this.setAcc_Bal(accBal - 10.00);
			accBal-=10.00;

		}
		
	}
	public void addInterest()
	{
		System.out.println("Customer earned " + (0.015 * accBal) + " in interest");
		accBal *= 0.015;
	}
		
	

}
