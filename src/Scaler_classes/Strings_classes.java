package Scaler_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strings_classes {


    public  static void main(String[] args) {
//        String AA="C0929P98NrT";
//       int res= solve(AA);
        String AA="aabbcc";
        int[] res= solve4(AA,99);
        System.out.println(Arrays.toString(res));
    }


//        public static  laxi(String[] args)
//        {
//            String str1 = "This is Exercise 1";
//            String str2 = "This is Exercise 2";
//
//            System.out.println("String 1: " + str1);
//            System.out.println("String 2: " + str2);
//
//            // Compare the two strings.
//            int result = str1.compareTo(str2);
//
//            // Display the results of the comparison.
//            if (result < 0)
//            {
//                System.out.println("\"" + str1 + "\"" +
//                        " is less than " +
//                        "\"" + str2 + "\"");
//            }
//            else if (result == 0)
//            {
//                System.out.println("\"" + str1 + "\"" +
//                        " is equal to " +
//                        "\"" + str2 + "\"");
//            }
//            else // if (result > 0)
//            {
//                System.out.println("\"" + str1 + "\"" +
//                        " is greater than " +
//                        "\"" + str2 + "\"");
//            }
//        }


    public static int[] solve4(String A, int B) {

        int i=0;
        int count=0;
        String res="";
        List<Integer> rest=new ArrayList<>();
        while(i<A.length()){
            if(B==A.charAt(i)){
                res+=i+"=";
                rest.add(i);
            }
            i++;
        }
        int result[]=new int[rest.size()];
        for(i=0;i<rest.size();i++){
//             System.out.print(res.charAt(i)+" ");
            result[i]= rest.get(i);
        }
       /* int i=0;
        int count=0;
        String res="";
        while(i<A.length()){
//            System.out.println(B+" "+(int)A.charAt(i));
            if(B==A.charAt(i)){
                res+=i+"=";
            }
            i++;
        }
        String newArr[]=res.split("=");
        int[] result=new int[newArr.length];
        if (res.length()<1){
            return new int[0];
        }

        for(i=0;i<newArr.length;i++){
//             System.out.print(res.charAt(i)+" ");
            result[i]= Integer.parseInt(newArr[i]);
        }
*/

        return result;
    }
    public static String solve3(String A) {
        if(A.length()<=1){
            if(A.charAt(0)=='*'){
                return "";
            }else {
                return A;
            }

        }
        int i=0;
        int count=0;
        String res="";
        while(i<A.length()){
            if(A.charAt(i)=='*'){
                count++;
            }else{
                break;}
            i++;
        }

        res=A.substring(count);
        i=res.length()-1;
        count=0;
        int length=res.length();
        while(i>=0){
            if(res.charAt(i)=='*'){
                count++;
            }else{
                break;}
            i--;
        }

        res=res.substring(0,length-count);
        return res;
    }
    public static int solve2(final String A, final int B) {
        int i=0;
        int count=0;
        while(i<A.length()){
//            System.out.println(B+" "+(int)A.charAt(i));
            if(B==A.charAt(i) ){
                count++;
//                System.out.println(A.charAt(i));
                return i;
            }
            i++;
        }
        if (count<=0){
            return -1;
        }
//        System.out.println(count);
        return count;
    }

    public static int solve(final String A, int B) {
        int i=0;
        int chr_=0;
        int nmr_=0;
        while(i<=A.length()-1){
            char ch=A.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                chr_++;
                System.out.println(ch);
            }

            else if(ch>='0' && ch<='9'){
                nmr_++;
            }
            i++;
        }
        if(chr_>=nmr_){
            return chr_;
        }
        return nmr_;
    }

}
