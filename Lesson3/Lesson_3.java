package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;


public class Lesson_3 {

    public static void main(String[] args) {
        ifElseExample();
        switchExample();
        arrayExample();
        arrayListExample();
        hashMapExample();
    }

    public static void ifElseExample() {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
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

    public static void arrayExample() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]); // Outputs 1
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

    public static void hashMapExample() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
