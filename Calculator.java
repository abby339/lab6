import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Three Variables
        double Operand1;
        double Operand2;
        double Function;
        double Solution;
        
        System.out.print("Enter first operand:");
        Operand1 = input.nextDouble();

        System.out.print("Enter second operand:");
        Operand2 = input.nextDouble();

        //Main Menu

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Which operation do you want to perform? ");

        //Function Operations
        Function = input.nextInt();
        if (Function == 1)
        {
            Solution = Operand1 + Operand2;
            System.out.print("The result of the operation is " + Solution + ". Goodbye!");
        }
        else if (Function == 2)
        {
            Solution = Operand1 - Operand2;
            System.out.print("The result of the operation is " + Solution + ". Goodbye!");
        }
        else if (Function == 3)
        {
            Solution = Operand1 * Operand2;
            System.out.print("The result of the operation is " + Solution + ". Goodbye!");
        }
        else if (Function == 4)
        {
            Solution = Operand1 / Operand2;
            System.out.print("The result of the operation is " + Solution + ". Goodbye!");
        }
        else
        {
            System.out.print("Error: Invalid selection! Terminating program.");
        }

    }
}
