import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Basics: Syntax, Variables and Data Types");

        // Variables
        // Declaration only
        int number;
        String name;

        // Declaration + Initialization
        int age = 23;
        double price = 19.99;
        String greeting = "Hello";

        // Later assignment
        age = 32;
        name = "Vlad";

//         ============================= Data Types ================================
//        | Type    | Size    | Range                    | Example                  |
//        | ------- | ------- | ------------------------ | ------------------------ |
//        | byte    | 8 bits  | -128 to 127              | byte b = 100;            |
//        | short   | 16 bits | -32,768 to 32,767        | short s = 5000;          |
//        | int     | 32 bits | -2³¹ to 2³¹-1            | int age = 25;            |
//        | long    | 64 bits | -2⁶³ to 2⁶³-1            | long distance = 100000L; |
//        | float   | 32 bits | ~6-7 decimal digits      | float price = 19.99f;    |
//        | double  | 64 bits | ~15 decimal digits       | double pi = 3.14159;     |
//        | char    | 16 bits | Single Unicode character | char letter = 'A';       |
//        | boolean | 1 bit   | trueorfalse              | boolean isActive = true; |

        int studentCount = 30;
        double temperature = 36.6;
        char grade = 'A';
        boolean isPassed = true;

        // With suffix (long & float);
        float area = 80.9f;
        long distance = 100000L;

        // References Types
        // References types store memory addresses (references) to objects, not the actual values.
        // The most common reference type is String:
        String message = "Hello, Java!";
        String car = "BMW";
        // Default value is null
        // Can call methods on them: message.length(), message.toUpperCase()
        // Include: classes, interfaces, enums
        String text = null; // Valid for reference types
//      int number = null;   - ERROR! Primitives cannot be null

        // Common patterns
        // Multiple variables of same type:
        int x = 5, y = 10, z = 15;
        String firstName = "John", lastName = "Doe";

        // Reassignment:
        int score = 100;
        score = 95;
        System.out.println(score); // Output: 95

        // Type conversion
        int num = 10;
        double result = num; // Implicit conversion (widening)

        double price_1 = 19.99;
        int rounded = (int) price_1; // Explicit cast (narrowing)

        // Constant value
        final int MAX_SIZE = 100;

        // Mini Project (Basic Calculator)
        Scanner scanner = new Scanner(System.in); // Only ONE Scanner

        System.out.print("Start the calculator? true/false: ");
        boolean isCalc = scanner.nextBoolean();

        while (isCalc) {
            System.out.println("Choose an operation:\n - [+] : 1\n - [-] : 2\n - [*] : 3\n - [/] : 4");
            int sign = scanner.nextInt(); // Using the same scanner

            System.out.print("Enter the first number: ");
            double firstNum = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double secondNum = scanner.nextDouble();

            switch (sign) {
                case 1:
                    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                    break;
                case 2:
                    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                    break;
                case 3:
                    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                    break;
                case 4:
                    if (secondNum != 0) {
                        System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                    } else {
                        System.out.println("Division by 0 is not possible!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
            }

            System.out.print("Continue? true/false: ");
            isCalc = scanner.nextBoolean();
        }

        scanner.close(); // Close the scanner at the end
    }
}