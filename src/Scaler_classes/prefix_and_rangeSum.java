package Scaler_classes;

import java.util.Arrays;

public class prefix_and_rangeSum {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,13,1,2,3,4,5,6};

        /* You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.*/
//        System.out.println(equilibrium(A));


        /*Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.*/
//        int res1=solve1(A);
//        System.out.println(res1);

        /*You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.*/

        int AA[]= {1, 2, 3, 4, 5};
        int BB[][] ={{1, 4}, {2, 3}};

//        long res2[]=rangeSum(AA,BB);
//        System.out.println(Arrays.toString(res2));

        /* Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values.*/

        int res4[]=solve4(A);
        System.out.println(Arrays.toString(res4));

    }

    public static int[] solve4(int[] A) {
        int product=1;
        int productArr[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            product*=A[i];
        }
        for(int i=0;i<A.length;i++){
            productArr[i]=product/A[i];
        }

        return productArr;
    }
    static long[] ComputePrefix(int arr[]){
        int n=arr.length;
        long pre[]=new long[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=arr[i]+pre[i-1];
        }
        return pre;
    }
    static long sumOfRange(long pre[],int i,int j){
        if(i==0){
            return pre[j];
        }
        return (pre[j]-pre[i-1]);
    }

    public static long[] rangeSum(int[] A, int[][] B){
        int k=0;
        long res[]=new long[B.length];
        long prefix[]=new long[A.length];

        prefix=ComputePrefix(A);
        while(k<B.length){
            int i= B[k][0];
            int j= B[k][1];
            long sum=sumOfRange(prefix,i-1,j-1);
            // System.out.print(sum+" ");
            res[k]=sum;
            k++;
        }
        return res;
    }
    static int solve1(int[] A) {
        int max=0;
        int maxIndex=0;
        for(int i=0;i<A.length;i++){
            if(max<A[i]){
                max=A[i];
            }
        }
        int iteration=0;
        for(int j=0;j<A.length;j++){

            iteration+=max-A[j];
            // System.out.print(iteration+"-"+max+" ");

        }
        return iteration;
    }
   static int equilibrium(int A[] )
    {
        int n=A.length;
        int i, j;
        int leftsum, rightsum;

        /* Check for indexes one by one until
           an equilibrium index is found */
        for (i = 0; i < n; ++i) {

            /* get left sum */
            leftsum = 0;
            for (j = 0; j < i; j++)
                leftsum += A[j];

            /* get right sum */
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += A[j];

            /* if leftsum and rightsum are same,
               then we are done */
            if (leftsum == rightsum)
                return i;
        }

        /* return -1 if no equilibrium index is found */
        return -1;
    }



}
