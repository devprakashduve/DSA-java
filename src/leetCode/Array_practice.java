package leetCode;

import java.util.Arrays;

public class Array_practice {
    public static void main(String[] args) {
        /* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.*/

        int[] nums1 = {1,2,3,0,0,0}; int m = 3; int[] nums2 = {2,5,6}; int n = 3;
//        merge(nums1, m,nums2, n);

        /* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
int[] nums3={2,7,11,15};
int target=9;
//        twoSum(nums3,target);

        /*  Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity. */
        int target2=10;
        int res2=searchInsert(nums3,target2);
        System.out.println("Index : "+res2);
    }

    public static int searchInsert(int[] nums, int target) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(target<nums[i]){
                return i;
            }else if(target>nums[i]){
                res=i+1;
            }
        }
        return res;
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {


        for(int i=0;i<nums2.length;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));


    }

    public static int[] twoSum(int[] nums, int target) {
        // int[] arr={5,6,7,8,9};
        int result[]=new int[2];
        int i=0;
        while(i<nums.length){
            int y=i+1;
            while(y<nums.length){
                if(nums[i]+nums[y]==target){
                    // System.out.println(i);
                    result[0]=i; result[1]=y;
                }
                y++;
            } i++;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
