package Scaler_classes;

public class Arrays_carry_forward {
    public static void main(String[] args) {
/* You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large. */
//     int res1=   solve1("ABCGAG");
//        System.out.println(res1);

        /* You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U). */
             int res2=   solve2("ABEC");
        System.out.println(res2);
    }

    public static int solve2(String A) {
        long sum = 0;
        for (int i = 0; i < A.length(); i ++) {
            char c = A.charAt(i);
            if (isVowel(c)) {
                sum += A.length() - i;
            }
        }
        return (int) (sum % 10003);
    }

    static boolean isVowel(char c) {
        char lower = Character.toLowerCase(c);
        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
            return true;
        }
        return false;
    }
    static int solve1(String A) {
        char [] ch=A.toCharArray();
        int n=ch.length;
        int cg=0;long ans=0;int mod = 1000000007;
        for(int i=n-1;i>=0;i--)
        {
            if(ch[i]=='G')
            {
                cg++;
            }
            else if(ch[i]=='A')
            {
                ans=(ans+cg)%mod;
            }
        }
        return (int) ans;
    }
}
