package Lesson2;
//import java.lang.Math;

public class Lesson_2 {
    public static void main(String[] args) {
        int sum = 5 + 3;
        System.out.println("The sum is: " + sum);

        // Integer division vs double division
        int intDivision = 7 / 2;
        double doubleDivision = 7.0 / 2.0;
        System.out.println("7 / 2 as int = " + intDivision);
        System.out.println("7.0 / 2.0 as double = " + doubleDivision);

        // Rounding examples
        double value = 3.6;
        System.out.println("Math.round(3.6) = " + Math.round(value));
        System.out.println("Math.floor(3.6) = " + Math.floor(value));
        System.out.println("Math.ceil(3.6)  = " + Math.ceil(value));

        // Random integer in a range [min, max]
        int min = 1;
        int max = 6;
        int roll = randomInt(min, max);
        System.out.println("Random roll (1-6): " + roll);

        // Input + math example (commented out so it doesn't block when you run it)
        // circleAreaFromInput();

        /*
        int difference = 10 - 5;
        System.out.println("The difference is: " + difference);
        */

        /*
        int product = 4 * 6;
        System.out.println("The product is: " + product);
        */
        
        /*
        int quotient = 20 / 4;
        System.out.println("The quotient is: " + quotient);
        */
        
        /*
        int remainder = 10 % 3;
        System.out.println("The remainder is: " + remainder);
        */

        /*
        double squareRoot = Math.sqrt(25);
        System.out.println("The square root is: " + squareRoot);
        */
        
        /*
        double power = Math.pow(2, 3);
        System.out.println("2 raised to the power of 3 is: " + power);
        */
        
        /*
        int absoluteValue = Math.abs(-10);
        System.out.println("The absolute value is: " + absoluteValue);
        */
        
        /*
        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1 is: " + randomNumber);
        */
    }

    public static int randomInt(int min, int max) {
        // Math.random() returns [0, 1)
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    public static void circleAreaFromInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area);
        scanner.close();
    }
}
