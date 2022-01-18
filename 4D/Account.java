//Name:			Nolan Jaeger 
//Class:		1322L
//Instructor:	Jorge
//Term:			Spring 2021
//Lab:			4
package lab4;
import java.util.*;

@SuppressWarnings("unused")
public class Account {
	private static int count = 10001;
	private int accNum;
	private double accBal;
	public Account()
	{
		accNum = count;
		count++;
		accBal = 0.0;
	}
	public Account(double b)
	{
		accNum = count;
		count++;
		accBal = b;
	}
	public int getAcc_Num()
	{
		return accNum;
	}
	public double getAcc_Bal()
	{
		return accBal;
	}
	public void setAcc_Bal(double x)
	{
		accBal = x;
	}
	public void withdrawal(double y)
	{
		if(accBal - y < 0)
		{
			System.out.println("invalid funds");
		}
		else
		{
			accBal -= y;
		}
	}
	public void deposit(double z)
	{
		accBal += z;
	}
	public String toString()
	{
		return "Your balance for checking " + accNum + " is " + accBal;
	}

}
