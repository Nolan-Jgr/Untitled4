//Name:			Nolan Jaeger 
//Class:		1322L
//Instructor:	Jorge
//Term:			Spring 2021
//Lab:			3
package lab3;
import java.util.*;
public class Quiz extends Question{
	private ArrayList<Question> Q = new ArrayList<Question>();
	public Quiz(ArrayList<Question> x)
	{
		Q = x;
	}
	public Quiz()
	{
		ArrayList<Question> x = new ArrayList<Question>();
		Q = x;
	}
	public void add_question()
	{
		String q1;
		String a1;
		int d1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter new question:");
		q1 = scan.nextLine();
		System.out.println("Enter new answer:");
		a1 = scan.nextLine();
		System.out.println("Enter new Difficulty: ");
		d1 = scan.nextInt();
		Question x = new Question(q1,a1,d1);
		this.Q.add(x);
	}
	public void remove_question()
	{
		int count = 0;
		for(Question q: Q)
		{
			System.out.println(count + " . " + q.getQuestion());
			count++;
		}
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		this.Q.remove(x);
	}
	public void modify_question()
	{
		System.out.println("Which Question would you like to modify?");
		int count = 0;
		for(Question q: Q)
		{
			System.out.println(count + " . " + q.getQuestion());
			count++;
		}
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("New Question: ");
		String y = scan.next();
		System.out.println("New Answer: ");
		String z = scan.next();
		System.out.println("New Difficulty: ");
		int k = scan.nextInt();
		Question q1 = new Question(y,z,k);
		Q.set(x, q1);
	}
	public void give_Quiz()
	{
		int correct = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		for(Question q: Q)
		{
			System.out.println(q.getQuestion());
			String x = scan.next();
			if(x.equals(q.getAnswer()))
			{
				System.out.println("Correct");
				correct++;
			}
		}
		System.out.println("You got " + correct + " out of " + Q.size());
	}
	
}
