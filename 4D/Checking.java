//Name:			Nolan Jaeger 
//Class:		1322L
//Instructor:	Jorge
//Term:			Spring 2021
//Lab:			4
package lab4;
import java.util.*;
@SuppressWarnings("unused")
public class Checking extends Account{
	private double accBal = this.getAcc_Bal();
	public Checking(double b)
	{
		super(b);
	}
	public Checking()
	{
		super();
	}
	//Override
	public void withdrawal(double x)
	{
		if(this.getAcc_Bal() - x < 0)
		{
			System.out.println("Charging an overdraft fee of $20 because account is below $0");
			this.setAcc_Bal(accBal- x);
			this.setAcc_Bal(accBal - 20.00);
		}
		else
		{
			this.setAcc_Bal(accBal - x);
		}
		System.out.println("Done");
	}
}
