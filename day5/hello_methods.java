package day5;

public class hello_methods {
    public static int x = 2;
    public static int y = 3;

    public static int add(int num1, int num2){
        int result = num1 + num2;
        System.out.println("The sum is: " + result);
        return result;
    }

    public static double divide( double num1, double num2 ){
        double result = num1 / num2;
        System.out.println("The division result is: " + result);
        return result;
    }
    
    public static int subtract( int num1, int num2 ){
        int result = num1 - num2;
        System.out.println("The subtraction result is: " + result);
        return result;
    }

    public static int multiply( int num1, int num2 ){
        int result = num1 * num2;
        System.out.println("The multiplication result is: " + result);
        return result;
    }
    /*
     * Add +
     * Subtract -
     * Multiply *
     * Divide /
     * Modulus //
     * Exponent **
    */
}
