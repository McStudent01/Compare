import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;

        System.out.println("Please enter in the first number: ");
        firstNumber = in.nextInt();
        System.out.println("Please enter in the second number: ");
        secondNumber = in.nextInt();


        if (firstNumber == secondNumber) {
            System.out.println("The two numbers are equal.");
        } else if (firstNumber < secondNumber) {
            System.out.println("The first number is less than the second number.");
            System.exit(0);
        } else {
            System.out.println("The second number is less than the first number.");
            System.exit(0);
        }
        if (!in.hasNextInt())
        {
            System.out.println("Invalid input. Please try again.");
            System.exit(0);
        }

    }
}