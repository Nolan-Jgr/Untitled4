package lab6;
import java.util.*;

public class Driver {
	public static void main(String[]args)
	{
		System.out.println("Enter a number");
		Scanner scan  = new Scanner(System.in);
		int input;
		input = scan.nextInt();
		scan.close();
		FibIteration a = new FibIteration();
		FibFormula b = new FibFormula();
		int fibIt = a.calculate_fib(input);
		int fibCalc = b.calculate_fib(input);
		System.out.println("Fib of " + input + " by iteration is: " + fibIt);
		System.out.println("Fib of " + input + " by iteration is: " + fibCalc);
	}

}
