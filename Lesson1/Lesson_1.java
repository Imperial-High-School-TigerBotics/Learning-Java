package Lesson1;

public class Lesson_1 {
    public static void main(String[] args) {
        System.out.println("Lesson #1 -> Starting Lesson 1");

        new HelloWorld();
        new HelloFunctions("Hello Functions!");
        new HelloLoops();

        // Static function examples (you call these on the class)
        print("Lesson #1 -> Static print() example");
        int total = add(7, 3);
        print("Lesson #1 -> 7 + 3 = " + total);

        // Input example (commented out so it doesn't block when you run it)
        // askAndEcho();
    }

    public static void print(String message) {
        System.out.println(message);
    }

    // A function that returns a value
    public static int add(int a, int b) {
        return a + b;
    }

    // Example of reading user input from the console
    public static void askAndEcho() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Type something: ");
        String text = scanner.nextLine();
        System.out.println("You typed: " + text);
        scanner.close();
    }
}