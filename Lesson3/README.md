# Lesson 3: Java Programming

## 1. Introduction
In this lesson, we will cover the basics of control flow in Java, including if/else statements, switch conditions, arrays, and collections.

## 2. If/Else Statements
If/else statements allow you to execute different blocks of code based on certain conditions.

```java
int number = 10;

if (number > 0) {
    System.out.println("The number is positive.");
} else {
    System.out.println("The number is not positive.");
}
```

You can also chain conditions with `else if` and combine booleans using `&&` (and) and `||` (or).

## 3. Switch Conditions
Switch statements provide a way to execute different parts of code based on the value of an expression.

```java
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
```

Java can also switch on `String` values:
```java
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
```

## 4. Arrays
Arrays are used to store multiple values in a single variable.

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // Outputs 1
```

Arrays are often used with loops:
```java
int sum = 0;
for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}
System.out.println(sum);
```

## 5. Collections
Collections in Java provide a way to store and manipulate groups of objects.

### Example: ArrayList
ArrayList is a resizable array implementation of the List interface. It allows for dynamic resizing and provides methods to manipulate the size of the array that is used internally to store the list.

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<String>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");

for (String fruit : list) {
    System.out.println(fruit);
}
```

Common `ArrayList` operations:
- `list.get(index)`
- `list.set(index, value)`
- `list.remove(index)`

### Example: HashMap
HashMap is a part of Java's collection framework and provides the basic implementation of the Map interface. It stores data in key-value pairs and allows for fast retrieval based on the key.

```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<String, Integer>();
map.put("Apple", 1);
map.put("Banana", 2);
map.put("Cherry", 3);

for (String key : map.keySet()) {
    System.out.println(key + ": " + map.get(key));
}
```

Useful `HashMap` checks:
- `map.containsKey(key)`

## Practice (optional)
- Ask the user for a number and print "Positive", "Negative", or "Zero".
- Make an array of 5 numbers and print the sum.
- Make an `ArrayList<Integer>` of scores and print the highest score.
- Make a `HashMap<String, Integer>` inventory and print an item count if it exists.
