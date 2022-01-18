//Name:			Nolan Jaeger 
//Class: 		CSE 1322L
//Instructor: 	Jorge Vera
//Term:			Spring 2021
//Lab:			2
package lab2;

import java.util.*;
public class Driver extends StockItem{
	public static void main(String[]args)
	{
		StockItem milk = new StockItem(" 1 Gallon of Milk", 3.60, 15);
		StockItem bread = new StockItem(" 1 Loaf of Bread",1.98,30);
		System.out.println("1.Sold One Milk \n2.Sold One Bread \n3.Change price of Milk \n4.Change price of Bread \n5.Add Milk to Inventory \n6.Add Bread to Inventory \n7.See Inventory \n8.Quit");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(x < 8)
		{
			switch(x)
			{
			case 1:
				milk.lowerQuantity();
				break;
			case 2:
				bread.lowerQuantity();
				break;
			case 3: 
				System.out.println("Enter new Price");
				milk.setPrice(scan.nextDouble());
				break;
			case 4:
				System.out.println("Enter new Price");
				bread.setPrice(scan.nextDouble());
				break;
			case 5:
				System.out.println("Enter Quantity");
				milk.raiseQuantity(scan.nextInt());
				break;
			case 6:
				System.out.println("Enter Quantity");
				bread.raiseQuantity(scan.nextInt());
			default:
				System.out.println("Milk: " + milk + "\nBread: " + bread);		
			}
			System.out.println("1.Sold One Milk \n2.Sold One Bread \n3.Change price of Milk \n4.Change price of Bread \n5.Add Milk to Inventory \n6.Add Bread to Inventory \n7.See Inventory \n8.Quit");
			x = scan.nextInt();
		}
	}

}
