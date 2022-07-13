package Scaler_classes;

public class Ismagic {
    static int solve(int A) {

        if(A%9==1){
            return 1;
        }
        return 0;

    }
    public static void main(String[] args) {
        /*Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number is a magic number.*/
       int res= solve(345345);
        System.out.println(res);
    }
}
