package lab3;
import java.util.*;
public class Driver extends Quiz {
	public static void main(String[]args)
	{
		Quiz quiz = new Quiz();
		String menu = "What would you like to do?\n1. Add Question\n2. Remove Question\n3. Modify Question\n4. Take quiz\n5. Quit";
		System.out.println(menu);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(x != 5)
		{
			switch(x)
			{
			case 1:
				quiz.add_question();
				break;
			case 2: 
				quiz.remove_question();
				break;
			case 3:
				quiz.modify_question();
				break;
			default:
				quiz.give_Quiz();		
			}
			System.out.println(menu);
			x = scan.nextInt();
		}
	}
}
