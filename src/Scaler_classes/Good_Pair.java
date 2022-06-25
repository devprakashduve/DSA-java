package Scaler_classes;

public class Good_Pair {

    public static int solve(int[] A, int B) {
    int res=0;
    for(int i=0;i<A.length-1;i++){
        for(int j=i+1;j<A.length;j++){
            int cal=A[i]+A[j];
            if(cal==B){
                res=1;
            }
        }

    }
    return res;
}

    public static void main(String[] args) {
        /* Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not. */
        int A[]={1,2,3,4};
        int B=7;
        int res=solve(A,B);
        System.out.println(res);
    }
}
