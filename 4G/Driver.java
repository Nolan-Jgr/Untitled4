import java.util.*;

public class Driver {
    public static void main(String[]args)
    {
        Calculator c = new Calculator();
        System.out.println("0 - Exit\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        System.out.println("Choose and option:");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while(input != 0)
        {
            System.out.println("Enter first number: ");
            float first = scan.nextFloat();
            System.out.println("Enter Second number: ");
            float second = scan.nextFloat();
            switch(input)
            {
                case 1:
                    System.out.println(c.add(first,second));
                    break;
                case 2:
                    System.out.println(c.subtract(first,second));
                    break;
                case 3:
                    System.out.println(c.multiply(first,second));
                    break;
                case 4:
                    System.out.println(c.divide(first,second));
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("0 - Exit\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
            System.out.println("Choose and option:");
            input = scan.nextInt();
        }
        System.out.println("Goodbye");

    }
}


