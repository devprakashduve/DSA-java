package Scaler_classes;

public class RecursionFindFactorial {
    public static void main(String[] args) {
        /*Write a program to find the factorial of the given number A.*/
        int A=5;
        int res=solve(A);
        System.out.println(res);
    }
    static int solve(int A) {
        if(A==1){
            return 1;
        }
        return solve(A-1)*A;
    }
}
