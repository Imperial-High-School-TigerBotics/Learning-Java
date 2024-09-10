# Lesson 1
Each lesson may have as many sections as we think are necessary, in this case **Lesson 2** only has **3** sections.
Coding may seem as a daunting task, but it really isn't. Although it may be really slow at the begining I promise you that it will pick up in
speed later on as you progress on your coding journey. Well anyways lets get into our first section **Lesson 2: HelloWorld.java**

## Lesson 2: HelloWorld.java
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

**Conclusion:** Well if you felt like you didn't really learn much feel free to go back to the begining or just play around with the code as you wish!
We will now be progressing onto section **2** of **Lesson 2** which is **HelloFunctions.java**.

## Lesson 1: HelloFunctions.java
Functions in Java may be daunting as Java tends to have a more bulky [syntax](https://en.wikipedia.org/wiki/Syntax_(programming_languages)) that confuses newer users, but seems more like a hot cup of coffe once you get to know it, it can burn your tounge if you aren't being careful! So lets start off with making a function that prints a String for us!
```java
// Name this class the name of your file, in our case its HelloFunctions.
class HelloFunctions {
    // This function will shorten the typing
    // we would need to print to the console
    
    // IMPORTANT: the static keyword is VERY important and should not
    // be used wrongly. In our case since the main function is STATIC
    // We have to make our "print" function STATIC aswell.
    // As for the VOID keyword it is just the return value of the function
    // Since we aren't returning any values we just pass VOID
    // We will go more into this in Lesson 3
    public static void print(String string){
      System.out.println(string);
    }

    public static void main(String[] args) {
        // Call the "print" function and pass a String
        print("Hello World");
    }
}
```
So creating a function and running it wasn't so hard after all. Functions are really a great thing for programming, they allow us to organize code better and not have to repeat certain lines over and over again. Functions can take as many arguments as you want, but you have to provide the type they must be. A good naming scheme for functions is using camel case naming convention to name your functions. Lets say I want to make a function called "JumpUp" the proper way to name it would be "jumpUp", this just helps readability of the code and is good practice to do.

**Conclusion:** Functions have a broad use and really can supply to your needs, BUT lets give functions an even greater power up with loops!
We will now be progressing onto section **3** the final section of **Lesson 1** which is **HelloLoops.java**. Be ready!

## Lesson 1: HelloLoops.java
Loops in java are a really useful thing and can be used to loop through Lists, Hashmaps and even strings. Loops I feel are part of the very core of programming. If you need to find the highest value in a hashmap you use loops. Anyways lets show you how to use loops in **Java**.
```java
class HelloLoops {
    public static void main(String[] args){
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
```
These loops demonstrate the usefulness of loops in java. Although we didn't loop through any lists we will later but not until we cover lists.
