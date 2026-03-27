# Lesson 1
Each lesson may have as many sections as we think are necessary, in this case **Lesson 1** only has **3** sections.
Coding may seem as a daunting task, but it really isn't. Although it may be really slow at the begining I promise you that it will pick up in
speed later on as you progress on your coding journey. Well anyways lets get into our first section **Lesson 1: HelloWorld.java**

## Lesson 1: HelloWorld.java
Printing out "Hello World" in Java is fairly simple, although you do need some code called "Boilerplate" to have a basic java program ready to run.

In this repository, each lesson folder uses a Java `package` (ex: `package Lesson1;`). That means your file and folder names should match the package name.

Here is the basic structure we use:
```java
package Lesson1;

public class HelloWorld {
    public HelloWorld() {
        // code runs when we create: new HelloWorld();
    }
}
```

Now that we have that ready we can move onto the next step which is actually printing out the text to the console:
```java
package Lesson1;

public class HelloWorld {
    public HelloWorld() {
        // System.out.println(); prints to the console
        System.out.println("Lesson #1 -> Hello World");
    }
}
```
Once were done with that we can move onto printing variables, it goes something like this:
```java
package Lesson1;

public class HelloWorld {
    public HelloWorld() {
        // Creates a variable that stores the string -> "Goodbye World!"
        String goodbye = "Lesson #1 -> Goodbye World!";
        System.out.println(goodbye);

        // Creating a variable of the type int
        int number = 7;
        // Java can print ints directly
        System.out.println("Lesson #1 -> number is " + number);
    }
}
```
If you happen to have a hard time understanding this code, we suggest you read the code comments. You can identify code comments by looking for the following characters in a row **//** that will initialize a comment. Comments are used to write usefull notes about code.

**Conclusion:** Well if you felt like you didn't really learn much feel free to go back to the begining or just play around with the code as you wish!
We will now be progressing onto section **2** of **Lesson 1** which is **HelloFunctions.java**.

## Simple Variable Types in Java

In Java, there are several basic variable types that you will frequently use. Here are some of the most common ones:

### String
A `String` is a sequence of characters. It is used to store text.
```java
String greeting = "Hello, World!";
System.out.println(greeting);
```

### char
A `char` is a single 16-bit Unicode character. It is used to store individual characters.
```java
char initial = 'A';
System.out.println(initial);
```

### int
An `int` is a 32-bit signed integer. It is used to store whole numbers.
```java
int age = 25;
System.out.println(age);
```

### double
A `double` is a double-precision 64-bit IEEE 754 floating point. It is used to store decimal numbers.
```java
double price = 19.99;
System.out.println(price);
```

### float
A `float` is a single-precision 32-bit IEEE 754 floating point. It is also used to store decimal numbers but with less precision than `double`.
```java
float temperature = 36.6f;
System.out.println(temperature);
```

These are some of the basic variable types in Java. Understanding these will help you manage and manipulate data effectively in your programs.

## Lesson 1: HelloFunctions.java
Functions in Java may be daunting as Java tends to have a more bulky [syntax](https://en.wikipedia.org/wiki/Syntax_(programming_languages)) that confuses newer users, but seems more like a hot cup of coffe once you get to know it, it can burn your tounge if you aren't being careful! So lets start off with making a function that prints a String for us!
In this repository, `HelloFunctions` is written as a class you *create* from `Lesson_1`.
```java
package Lesson1;

public class HelloFunctions {

    public HelloFunctions(String message){
        say(message);
    }

    public void say(String sentence) {
        System.out.println("Lesson #1 -> " + sentence);
    }
}
```
So creating a function and running it wasn't so hard after all. Functions are really a great thing for programming, they allow us to organize code better and not have to repeat certain lines over and over again. Functions can take as many arguments as you want, but you have to provide the type they must be. A good naming scheme for functions is using camel case naming convention to name your functions. Lets say I want to make a function called "JumpUp" the proper way to name it would be "jumpUp", this just helps readability of the code and is good practice to do.

**Conclusion:** Functions have a broad use and really can supply to your needs, BUT lets give functions an even greater power up with loops!
We will now be progressing onto section **3** the final section of **Lesson 1** which is **HelloLoops.java**. Be ready!

## Lesson 1: HelloLoops.java
Loops in java are a really useful thing and can be used to loop through Lists, Hashmaps and even strings. Loops I feel are part of the very core of programming. If you need to find the highest value in a hashmap you use loops. Anyways lets show you how to use loops in **Java**.
```java
package Lesson1;

public class HelloLoops {
    public HelloLoops(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Lesson #1 -> For-Loop: " + i);
        }

        int n = 0;
        do {
            n++;
        } while (n <= 5);
        System.out.println("Lesson #1 -> Do-While: " + n);

        int f = 0;
        while (f < 5) {
            System.out.println("Lesson #1 -> While-Loop: " + f);
            f++;
        }
    }
}
```
These loops demonstrate the usefulness of loops in java. Although we didn't loop through any lists we will later but not until we cover lists.

## Practice (optional)
- In `HelloWorld`, make a `double` and print it.
- In `HelloFunctions`, add a method that returns the length of the message.
- In `HelloLoops`, change the loops to count down from 5 to 1.