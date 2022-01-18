//Nolan Jaeger 
package Lab1;

public class AsciiArt {
	public static void main(String[]args)
	{
		char[][] car = new char[4][13];
		car = make_forward();
		for(int i = 0; i < car.length;i++)
		{
			for( int j = 0; j < car[0].length; j++)
			{
				System.out.print(car[i][j]);
			}
			System.out.println();
		}
		char[][] FlipCar = new char[4][13];
		FlipCar = make_mirror(car);
		for(int i = 0; i < FlipCar.length;i++)
		{
			for(int j = 0; j < FlipCar[0].length; j++)
			{
				System.out.print(FlipCar[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < car.length;i++)
		{
			for(int j = 0; j < 2 * (car[0].length);j++)
			{
				if(j < car[0].length)
				{
					System.out.print(car[i][j]);
				}
				else if(j >= car[0].length)
				{
					System.out.print(FlipCar[i][j-FlipCar[0].length]);
				}
			}
			System.out.println();
		}
		
	}
	public static char[][] make_mirror(char[][] x)
	{
		char[][] y = new char[x.length][x[0].length];
		for(int i = 0; i < y.length; i++)
		{
			for(int j = y[0].length-1, z = 0; j >= 0 && z < y[0].length; j--,z++)
			{
				y[i][z] = x[i][j];
					
			}
			for(int j = 0; j < y[0].length;j++)
			{
				if(y[i][j]== '/')
				{
					y[i][j] = '\\';
				}
				else if(y[i][j]== '\\')
				{
				y[i][j] = '/';
				}
				else if(y[i][j]== '(')
				{
					y[i][j] = ')';
				}
				else if(y[i][j]== ')')
				{
					y[i][j] = '(';
				}
			}
		}
		return y;
	}
	public static char[][] make_forward()
	{
		char[][] pixel = new char[4][13];
		pixel[0][0] = ' ';
		pixel[0][1] = ' ';
		pixel[0][2] = '_';
		pixel[0][3] = '_';
		pixel[0][4] = '_';
		pixel[0][5] = '_';
		pixel[0][6] = '_';
		pixel[0][7] = '_';
		pixel[0][8] = ' ';
		pixel[0][9] = ' ';
		pixel[0][10] = ' ';
		pixel[0][11] = ' ';
		pixel[0][12] = ' ';
		pixel[1][0] = ' ';
		pixel[1][1] = '/';
		pixel[1][2] = '|';
		pixel[1][3] = '_';
		pixel[1][4] = '|';
		pixel[1][5] = '|';
		pixel[1][6] = '_';
		pixel[1][7] = '\\';
		pixel[1][8] = '\'';
		pixel[1][9] = '.';
		pixel[1][10] = '_';
		pixel[1][11] = '_';
		pixel[1][12] = ' ';
		pixel[2][0] = '(';
		pixel[2][1] = ' ';
		pixel[2][2] = ' ';
		pixel[2][3] = ' ';
		pixel[2][4] = '_';
		pixel[2][5] = ' ';
		pixel[2][6] = ' ';
		pixel[2][7] = ' ';
		pixel[2][8] = ' ';
		pixel[2][9] = '_';
		pixel[2][10] = ' ';
		pixel[2][11] = '_';
		pixel[2][12] = '\\';
		pixel[3][0] = '=';
		pixel[3][1] = '\'';
		pixel[3][2] = '-';
		pixel[3][3] = '(';
		pixel[3][4] = '_';
		pixel[3][5] = ')';
		pixel[3][6] = '-';
		pixel[3][7] = '-';
		pixel[3][8] = '(';
		pixel[3][9] = '_';
		pixel[3][10] = ')';
		pixel[3][11] = '-';
		pixel[3][12] = '\'';
		return pixel;
	}

}