package Scaler_classes;

public class RecursionCheckPalindrome {
    public static void main(String[] args) {
     int res=solve("MAM");
        System.out.println(res);
    }
    public static int solve(String A) {
        if(A.length() <= 1)
            return 1;
        if(A.charAt(0) != A.charAt(A.length()-1))
            return 0;
        return solve(A.substring(1, A.length()-1));
    }
}
