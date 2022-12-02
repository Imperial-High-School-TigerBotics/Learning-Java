# How to Java 19
In this tutorial we will be diving into how Java works and how to write it. Of course you won't be required to have any
coding knowledge but it will certainly help having some knowledge.

## Topics
We will be covering multiple topics, so here is a short list just describing **SOME** of the topics 
- [Console Output and Input](https://github.com/Imperial-High-School-TigerBotics/Learning-Java/tree/main/Lesson1)
- [Functions](https://github.com/Imperial-High-School-TigerBotics/Learning-Java/tree/main/Lesson1)
- [Loops](https://github.com/Imperial-High-School-TigerBotics/Learning-Java/tree/main/Lesson1)
- Classes, Enums and Class Abstraction
- Basic understanding of how Memory and CPU usage works 

## Why this tutorial?
This tutorial is made to be able to help students be capable of being able to code for our **First Robotics Team** -> **TigerBotics**.
But you can also use this tutorial to learn Java for yourself!

## [Lesson 1: HelloWorld.java](https://github.com/Imperial-High-School-TigerBotics/Learning-Java/tree/main/Lesson1)
Printing out "Hello World" in Java is fairly simple, although you do need some code called "Boilerplate" to have a basic java program ready to run and here is an example of so called "Boilerplate":
```java
// Name this class the name of your file, in our case its HelloWorld.
class HelloWorld {
    public static void main(String[] args) {
        
    }
}
```
Now that we have that ready we can move onto the next step which is actually printing out the text to the console. It goes as simply as this:
```java
// Name this class the name of your file, in our case its HelloWorld.
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println(); Prints to the systems console
        System.out.println("Hello World");
    }
}
```
Once were done with that we can move onto printing variables, it goes something like this:
```java
// Name this class the name of your file, in our case its HelloWorld.
class HelloWorld {
    public static void main(String[] args) {
        // Creates a variable that stores the string -> "Goodbye World!"
        String Goodbye = "Goodbye World!";
        // Printing the variable Goodbye by refrencing its name.
        System.out.println(Goodbye);
        
        // Although a string variable isn't the only way
        // to print a variable we must pass a string (prefer to pass a string to prevent errors)
        // we can also print variables with a simple method shown here
        
        // Creating a variable of the type "int"
        int number = 7;
        
        // Converting the number variable into a string
        System.out.println(String.valueOf(number));
    }
}
```
If you happen to have a hard time understanding this code, we suggest you read the code comments. You can identify code comments by looking for the following characters in a row **//** that will initialize a comment. Comments are used to write usefull notes about code.
