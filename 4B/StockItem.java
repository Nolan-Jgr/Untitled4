//Name:			Nolan Jaeger 
//Class: 		CSE 1322L
//Instructor: 	Jorge Vera
//Term:			Spring 2021
//Lab:			2
package lab2;
import java.util.*;
@SuppressWarnings("unused")
public class StockItem {
	private String description;
	static int count = 0;
	private int id;
	private double price;
	private int quantity;
	public StockItem()
	{
		id = count;
		count++;
		this.description = "";
		this.price = 0.0;
		this.quantity = 0;
	}
	public StockItem(String d,double p, int q)
	{
		id = count;
		count++;
		this.description = d;
		this.price = p;
		this.quantity = q;
	}
	public String getDescription()
	{
		return description;
	}
	public int getId()
	{
		return id;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setPrice(double p)
	{
		if(p < 0)
			System.out.println("error");
		else
			price = p;
	}
	public void lowerQuantity()
	{
		if(quantity-1 < 0)
		{
			System.out.println("error");
		}
		else
		{
			quantity--;
		}
	}
	public void raiseQuantity(int q)
	{
		quantity = quantity + q;
	}
	public String toString()
	{
		return  "Item number: " + this.id + " is " + this.description + " has price $" + this.price + " we currently have " + this.quantity + " in stock";
	}
}



