package Lesson1;

public class HelloLoops {
    public HelloLoops(){
        // The For Loops -> Prints out the current loop it is on
        for (int i = 0; i < 5; i++) {
            System.out.println("Lesson #1 -> " + "For-Loop: " + i);
        }

        // The While-Do loop
        // Make n variable
        int n = 0;

        // Will do as long as the condition is met
        do {
            n++;
        // Essentially the "if" statement of the loop
        } while (n <= 5);

        // Print out the variable
        System.out.println("Lesson #1 -> " + "Do-While: " + n);

        // While loop
        // Make the variable F
        int F = 0;
        // Actual Loop
        while (F < 5) {
            // Print out the variable
            System.out.println("Lesson #1 -> " + "While-Loop: " + F);
            // Iterate the Variable
            F++;
        }
    }
}
