package Scaler_classes;

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
        int res1=solve1(A);
        System.out.println(res1);
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
