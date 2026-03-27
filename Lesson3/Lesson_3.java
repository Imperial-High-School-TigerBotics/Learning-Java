package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;


public class Lesson_3 {

    public static void main(String[] args) {
        ifElseExample();
        booleanLogicExample();
        switchExample();
        switchOnStringExample();
        arrayExample();
        arrayLoopExample();
        arrayListExample();
        arrayListOperationsExample();
        hashMapExample();
        hashMapContainsExample();

        // Uncomment to try input-driven conditionals
        // numberSignFromInput();
    }

    public static void ifElseExample() {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }

    public static void booleanLogicExample() {
        int age = 16;
        boolean hasId = true;
        if (age >= 16 && hasId) {
            System.out.println("Allowed to participate.");
        } else {
            System.out.println("Not allowed to participate.");
        }
    }

    public static void switchExample() {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }

    public static void switchOnStringExample() {
        String command = "start";
        switch (command) {
            case "start":
                System.out.println("Starting...");
                break;
            case "stop":
                System.out.println("Stopping...");
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }

    public static void arrayExample() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]); // Outputs 1
    }

    public static void arrayLoopExample() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Array sum = " + sum);
    }

    public static void arrayListExample() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }

    public static void arrayListOperationsExample() {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(10);
        scores.add(20);
        scores.add(30);

        System.out.println("First score = " + scores.get(0));

        scores.set(1, 25);
        System.out.println("Updated list = " + scores);

        scores.remove(0);
        System.out.println("After remove = " + scores);
    }

    public static void hashMapExample() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static void hashMapContainsExample() {
        HashMap<String, Integer> inventory = new HashMap<String, Integer>();
        inventory.put("Bolts", 24);
        inventory.put("Nuts", 40);

        String item = "Bolts";
        if (inventory.containsKey(item)) {
            System.out.println(item + " count: " + inventory.get(item));
        } else {
            System.out.println(item + " not found");
        }
    }

    public static void numberSignFromInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}
