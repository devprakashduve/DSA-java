package Scaler_classes;

public class RecursionImplementPowerFunction {
    public static void main(String[] args) {
        /*Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).

Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.*/
int A = 2, B = 3, C = 3;
        int res=pow(A,B,C);
        System.out.println(res);
    }

    public static int pow(int A, int B, int C) {
        if(A == 0) return 0;
        if (B == 0) return 1;

        long p = (long)pow(A, B/2, C);
        if(B % 2 == 0) {
            return (int)((p%C * p%C)+C) % C;
        }else{
            return (int)((A%C * p%C * p%C)+C) % C;
        }
    }
}
