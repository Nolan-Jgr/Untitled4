package lab6;
	
public class FibFormula implements FindFib {

	@Override
	public int calculate_fib(int x) {
		int sum = 0;
		double term1 = Math.pow(((1+Math.sqrt(5.0))/2),x);
		double term2 = ((Math.pow(((1-Math.sqrt(5.0))/2),x)));
		sum = (int)((term1 - term2)/Math.sqrt(5.0));
		return sum;
	}

}
