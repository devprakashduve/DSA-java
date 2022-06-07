package leetCode;

import java.util.Arrays;

public class Array_practice {
    public static void main(String[] args) {
        /* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.*/

        int[] nums1 = {1,2,3,0,0,0}; int m = 3; int[] nums2 = {2,5,6}; int n = 3;
        merge(nums1, m,nums2, n);

    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {


        for(int i=0;i<nums2.length;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));


    }
}
