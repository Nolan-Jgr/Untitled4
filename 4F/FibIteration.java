package lab6;

public class FibIteration implements FindFib {
	@Override
	public int calculate_fib(int x) {
		int sum = 0;
		if(x == 1 || x == 2)
		{
			return 1;
		}
		else
		{
			int num1 = 0;
			int num2 = 1;
			for(int i = 1; i < x;i++)
			{
				sum = num1 + num2;
				num1 = num2;
				num2 = sum;	
			}
		}
		return sum;
	}

}
