package Scaler_classes;

import java.util.ArrayList;
import java.util.List;

public class BitManipulations1 {
    public static void main(String[] args) {
        /* Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?*/

        List<Integer> list=new ArrayList<Integer>();
        list.add(1);list.add(1);
        list.add(2);list.add(2);list.add(3);list.add(4);list.add(3);

//        int res = singleNumber(list);
//        System.out.println(res);

        /*Given two binary strings, return their sum (also a binary string).*/
        String A="100";
        String B="11";
        String res=addBinary(A,B);
        System.out.println(res);

    }

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int singleNumber(final List<Integer> A) {
        int res=0;
        for(int i=0;i<A.size();i++){
            res=res ^ A.get(i);
        }

        return res;
    }

    public static String addBinary(String A, String B) {
        String res="";
        int carry=0;
        for(int i=0;i<A.length() || i<B.length() || carry!=0;i++){
            int x=0;
            int y=0;
            if(i< A.length() && A.charAt(A.length()-(i+1))=='1'){
                x=1;
            }
            else{
                x=0;
            }
            if(i< B.length() && B.charAt(B.length()-(i+1))=='1'){
                y=1;
            }
            else{
                y=0;
            }
            int add=x+y+carry;
            //   System.out.print(x+" "+y+" "+carry+"="+add+"/");

            if(add==0){
                res='0'+res;
                carry=0;
            }else if(add==1){
                res='1'+res;
                carry=0;
            }
            else if(add==3){
                res='1'+res;
                carry=1;
            }
            else{
                res='0'+res;
                carry=1;
            }
        }
        //  System.out.print(res+" ");
        return res;
    }
}
