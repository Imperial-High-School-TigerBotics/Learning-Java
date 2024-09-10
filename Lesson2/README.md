# Lesson 2: Math in Java

In this lesson, we will explore various mathematical operations and functions available in Java.

## Arithmetic Operations

Java provides several arithmetic operators that can be used to perform basic mathematical calculations. Here are some examples:

### Addition

The addition operator `+` is used to add two numbers together. For example:

```java
int sum = 5 + 3;
System.out.println("The sum is: " + sum);
```

### Subtraction

The subtraction operator `-` is used to subtract one number from another. For example:

```java
int difference = 10 - 5;
System.out.println("The difference is: " + difference);
```

### Multiplication

The multiplication operator `*` is used to multiply two numbers. For example:

```java
int product = 4 * 6;
System.out.println("The product is: " + product);
```

### Division

The division operator `/` is used to divide one number by another. For example:

```java
int quotient = 20 / 4;
System.out.println("The quotient is: " + quotient);
```

### Modulo

The modulo operator `%` is used to find the remainder of a division operation. For example:

```java
int remainder = 10 % 3;
System.out.println("The remainder is: " + remainder);
```
## Class Importing

In Java, class importing allows you to use classes from other packages in your program. By importing a class, you can access its methods and variables without having to specify the full package name every time.

To import a class, you need to use the `import` keyword followed by the package name and class name. For example:

```java
import java.util.Scanner;
```

This imports the `Scanner` class from the `java.util` package. Now you can use the `Scanner` class in your program to read user input.

Importing classes can make your code more concise and readable. It also helps avoid naming conflicts when multiple classes have the same name.

### Example: Using Scanner for Math Input

```java
import java.util.Scanner;

public class MathInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("The square of " + number + " is: " + (number * number));

        scanner.close();
    }
}
```

In this example, we import the `Scanner` class to read user input. We prompt the user to enter a number, read it using `scanner.nextInt()`, and calculate its square. Finally, we display the result using `System.out.println()`. Don't forget to close the scanner using `scanner.close()` to release system resources.

You can modify this code snippet to perform other mathematical operations or use different data types based on your requirements.

Remember to import the necessary classes and use them appropriately to enhance the functionality of your Java programs.

## Math Functions

Java also provides a `Math` class that contains various mathematical functions. To use these functions, you need to import the `Math` class from the `java.lang` package at the beginning of your Java file. You can do this by adding the following line of code:

```java
import java.lang.Math;
```

The `Math` class provides additional mathematical functions that you can use in your programs. Here are some commonly used functions:

- `Math.sqrt(double x)`: Calculates the square root of a number.
- `Math.pow(double base, double exponent)`: Calculates the power of a number.
- `Math.abs(int x)`: Calculates the absolute value of a number.
- `Math.random()`: Generates a random number between 0 and 1.

These are just a few examples of the mathematical functions available in the `Math` class. You can explore the Java documentation for more information on other functions.

Remember to import the necessary classes and use the appropriate methods to perform mathematical operations in your Java programs.

### Square Root

The `Math.sqrt()` function is used to calculate the square root of a number. For example:

```java
double squareRoot = Math.sqrt(25);
System.out.println("The square root is: " + squareRoot);
```

### Power

The `Math.pow()` function is used to calculate the power of a number. For example:

```java
double power = Math.pow(2, 3);
System.out.println("2 raised to the power of 3 is: " + power);
```

### Absolute Value

The `Math.abs()` function is used to calculate the absolute value of a number. For example:

```java
int absoluteValue = Math.abs(-10);
System.out.println("The absolute value is: " + absoluteValue);
```

### Random Number

The `Math.random()` function is used to generate a random number between 0 and 1. For example:

```java
double randomNumber = Math.random();
System.out.println("A random number between 0 and 1 is: " + randomNumber);
```

These are just a few examples of the mathematical operations and functions available in Java. Feel free to explore the Java documentation for more information.

Now that you have learned about arithmetic operations and math functions in Java, you can apply this knowledge to solve various mathematical problems in your programs.

Remember to practice and experiment with different mathematical operations to strengthen your understanding. Good luck!