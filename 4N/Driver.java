//Nolan Jaeger
//CSE 1322L
//Jorge
//Spring 2021
//lab14
package lab14;
import java.util.*;
public class Driver {
	public static void main(String[]args) {
		BlueRayCollection brc = new BlueRayCollection();
		System.out.println("0. Quit\n1. Add BlueRay to collection\n2. See collection\n3. Search Collection\n4. Remove BlueRay from collection");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		while(input != 0) {
			switch(input) {
			case 1:{
				System.out.println("Enter title");
				scan.nextLine();
				String t = scan.nextLine();
				System.out.println("Enter director");
				String d = scan.nextLine();
				System.out.println("Enter yearOfRelease");
				int y = scan.nextInt();
				System.out.println("Enter cost");
				double c = scan.nextDouble();
				brc.add(t, d, y, c);
			}break;
			case 2:{
				brc.show_all();
			}break;
			case 3:{
				System.out.println("Enter title to search for");
				scan.nextLine();
				String t = scan.nextLine();
				brc.search(t);
			}break;
			case 4:{
				System.out.println("Enter title to remove for");
				scan.nextLine();
				String t = scan.nextLine();
				brc.remove(t);
				
			}break;
			default:
				System.out.println("Invalid input");
			}
			System.out.println("0. Quit\n1. Add BlueRay to collection\n2. See collection\n3. Search Collection\n4. Remove BlueRay from collection");
			input = scan.nextInt();
		}
	
	}

}
