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

        int res = singleNumber(list);
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
}
