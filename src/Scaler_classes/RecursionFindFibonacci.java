package Scaler_classes;

public class RecursionFindFibonacci {
    public static void main(String[] args) {
        int a=9;
        int res=findAthFibonacci(a);
        System.out.println(res);
    }
    static int findAthFibonacci(int A) {
        if(A==0) {return 0;}
        if(A==1 || A==2) {return 1;}
        return (findAthFibonacci(A-1)+findAthFibonacci(A-2));
    }
}
