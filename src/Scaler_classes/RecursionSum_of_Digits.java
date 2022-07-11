package Scaler_classes;

public class RecursionSum_of_Digits {
    public static void main(String[] args) {
        /*Given a number A, we need to find the sum of its digits using recursion.

         */

        int A=234;
        int res=sumofdigits(A,0);
        System.out.println(res);
    }
    static int sumofdigits(int val, int ans){
        if(val<=0){
            return ans;
        }
        int temp=val%10;
        ans+=temp;
        val=val/10;
        return sumofdigits(val,ans);
    }
}

