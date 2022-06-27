package Scaler_classes;

public class Equilibrium_index_of_an_array {
    public static void main(String[] args) {
        /* Problem Description
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.*/
int[] A= {-7, 1, 5, 2, -4, 3, 0};
int res=solve(A);
        System.out.println(res);
    }
    public static int solve(int[] A) {
        int n=A.length;
        int[] prifix_sum=new int[n];
        int sum=0;
        // generate prifix sum array with SC: N & TC: N
        for(int i=0;i<n;i++){
            if(i==0){
                prifix_sum[i]=A[i];
                sum=A[i];
            }else{
                sum+=A[i];
                prifix_sum[i]=sum;
            }
        }

        // check prifix sum values
        //  for(int i=0;i<n;i++){
        //  System.out.print(prifix_sum[i]+"->");
        // }
        // iterate from 1 to length -1 to check left part and right part

        for(int i=0;i<n;i++){
            //  System.out.print(prifix_sum[i-1]+"=="+(prifix_sum[i]-A[i])+" ");
            if(i==0){
                sum=0;
            }else{
                sum=prifix_sum[i-1];
            }
            if(sum==(prifix_sum[n-1]-prifix_sum[i])){
                return i;
            }
        }
        return -1;
    }
}
