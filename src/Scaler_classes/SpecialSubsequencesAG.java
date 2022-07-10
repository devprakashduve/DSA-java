package Scaler_classes;

public class SpecialSubsequencesAG {
    public static int solve(String A) {
        int n=A.length()-1;
        int ans=0;
        int Gcount=0;
        int mod = 1000000007;
        for(int i=n;i>=0;i--){
            char chr=A.charAt(i);
            // System.out.print(chr+" ");
            if(chr=='G'){
                Gcount++;

            }
            else if(chr=='A'){
                ans=(ans+Gcount)%mod;

            }
        }
        return ans;
    }
    public static void main(String[] args) {

        /*You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large. */
String  A = "ABCGAG";

int res=solve(A);
        System.out.println(res);

    }
}
