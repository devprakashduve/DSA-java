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
//        String res=addBinary(A,B);
//        System.out.println(res);

        /* Write a function that takes an integer and returns the number of 1 bits it has. */
int AA=11;
//        int res2=numSetBits(AA);
//        System.out.println(res2);
        /* You have an array A with N elements. We have two types of operation available on this array :
We can split an element B into two elements, C and D, such that B = C + D.
We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.
You have to determine whether it is possible to convert array A to size 1, containing a single element equal to 0 after several splits and/or merge? */
int[] AB={ 5030, 7120, 5995, 237, 7582, 8476, 2174, 8787, 7611, 6616, 4640, 8907, 2164, 2753, 8246, 3858, 8795, 2762, 3378, 1527, 4725, 8119, 4447, 4834, 8465, 3253, 5664, 4404, 3114, 8380, 7844, 7975, 8413, 8338, 1682, 6535, 5500, 5400, 4160, 1849, 9472, 3114, 8330, 1255, 753, 4995, 4090, 7392, 4297, 65, 384, 2354, 847, 3906, 4016, 4424, 3316, 709, 6140, 5437, 2440, 2189, 130, 5699, 9506, 1243, 2862, 1141, 6659, 964, 7918, 5976, 5490, 9903, 9106, 2042, 2676, 3231, 3580, 299, 9134, 8663, 5389, 3268, 6394, 3092, 5235, 5109, 6224, 3314, 4611, 5381, 6032, 230, 5363, 3807, 3176, 4085, 966, 2880, 2591, 9157, 2971, 8330, 692, 5620, 7286, 665, 7865, 6799, 1393, 4977, 3075, 2960, 5979, 9158, 7903, 4771, 8390, 5238, 9661, 9410, 4020, 9300, 2499, 6477, 6404, 8553, 6809, 2659, 1930, 2559, 763, 2818, 9021, 5318, 9321, 286, 4721, 8026, 8236, 7179, 5207, 6036, 5518, 3781, 4672, 4357, 1274, 2218, 2158, 3079, 6340, 8790, 7674, 4099, 9847, 424, 3323, 7658, 2716, 2036, 6562, 1319, 5228, 433, 1287, 6290, 5199, 2479, 770, 5397, 6168, 1824, 1119, 7176, 8299, 3045, 6480, 7447, 764, 3381, 1095, 1318, 8162, 4862, 6442, 3061, 6213, 9495, 9439, 5961, 7153, 2888, 7218, 4371, 7009, 6645, 3701, 8882, 666, 9485, 8833, 3391, 4508, 1982, 4984, 6911, 711, 1902, 9143, 7240, 5051, 1199, 7843, 3519, 9739, 7046, 4694, 4537, 1014, 5507, 6184, 3731, 9066, 2129, 3345, 145, 5094, 4371, 7354, 6262, 9790, 8190 };
        String res2=solve2(AB);
        System.out.println(res2);
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
    public static int numSetBits(int A) {
        int res=0;
        String str=  Integer.toBinaryString(A);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                res++;
            }
        }
        return res;
    }
    public static String solve2(int[] A) {
        int numOdds = 0;
        for(int x : A) numOdds += (x & 1);
        return (numOdds & 1) == 1? "No" : "Yes";


    }
}
