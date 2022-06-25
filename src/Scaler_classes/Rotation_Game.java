package Scaler_classes;

import java.util.Scanner;

public class Rotation_Game {
    static int[] reverseParts(int[] arr, int first, int last) {
        for (int i = first, j = last; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

         int A[]={1,2,3,4,5,6};
int B=3;
        // enable to input elements
       /* Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            A[i] = temp;
        }
        int B = sc.nextInt();*/



// first reverse entire array
        int[] res = reverseParts(A, 0, A.length - 1);
// now reverse  elements upto B
        res = reverseParts(A, 0, B - 1);
// this will reverse part 2 from B to N-1
        res = reverseParts(A, B, A.length - 1);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
