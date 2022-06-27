package Scaler_classes;

import java.util.Scanner;

public class Max_and_Min_of_an_Array { public static void main(String[] args) {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // DO NOT USE ARGUMENTS FOR INPUTS
    // E.g. 'Scanner' for input & 'System.out' for output

//    Scanner sc=new Scanner(System.in);
//    int N=sc.nextInt();
//    int[] A=new int[N];
//    for(int i=0;i<N;i++){
//        int temp=sc.nextInt();
//        A[i]=temp;
//    }
    int A[]={100,20345,3345,487954};
    int N=4;
    int MAX=A[0],MIN=A[0];
    for(int i=0;i<N;i++){
        if(MAX<A[i]){
            MAX=A[i];
        }
        else if(MIN>A[i]){
            MIN=A[i];
        }
    }
    System.out.print(MAX+" "+MIN);
}
}