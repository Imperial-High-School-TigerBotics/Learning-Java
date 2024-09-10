package day1;

public class if_else {
    public static void main(String args[]){
        boolean A_is_Five = false;

        int A = 104;

        if( A == 5){
            A_is_Five = true;
            System.out.println(A_is_Five);
        }else if( A < 5){
            System.out.println("A is less than 5");
        }else if( A > 5){
            System.out.println("A is greater than 5");
        }
    }
}
