import java.util.Scanner;
public class calculator {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
        String operation = s.next();
        int result = performOperation(num1, num2, operation);
        System.out.println("Your answer is: " + result);
    }
    public static int performOperation(int num1, int num2, String operation)
    {
        int result = 0;
        if (operation.equals("+")) {
            result = num1 + num2;
        }
        else if (operation.equals("-")) {
            result = num1 - num2;
        }
        else if (operation.equals("*")) {
            result = num1 * num2;
        }
        else if (operation.equals("%")) {
            result = num1 % num2;
        }
        else if (operation.equals("/")) {
            result = num1 / num2;
        }
        else {
            System.out.println("Invalid operation");
        }
        return result;
    }
}