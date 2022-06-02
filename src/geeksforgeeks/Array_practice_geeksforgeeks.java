package geeksforgeeks;

import java.util.Arrays;

public class Array_practice_geeksforgeeks {
    // In java array is homogeneous (it contains same type of data)
    //    It can be declared  2ways like below
    // type var-name[];
    //OR
    //type[] var-name;
//    both are valid declarations
//    int intArray[];
//    or int[] intArray;

//    foe mor
// both are valid declarations
//int intArray[];
//or int[] intArray;
//
//byte byteArray[];
//short shortsArray[];
//boolean booleanArray[];
//long longArray[];
//float floatArray[];
//double doubleArray[];
//char charArray[];
//
//// an array of references to objects of
//// the class MyClass (a class created by
//// user)
//MyClass myClassArray[];
//
//Object[]  ao,        // array of Object
//Collection[] ca;  // array of Collection
//                     // of unknown type


    public static void main(String[] args) {



//        single dimension array
        int[] arr={1,2,3,4};
        int arr2[]={5,6,67,78,23,43};

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

//        multi dimensional array

        int[][] arr3={{2,3,4,5},{5,6,3,1},{8,6,9,5}} ;
        System.out.println("Multi dimentional array");
        for (int i=0;i< arr3.length;i++){
            System.out.println(Arrays.toString(arr3[i]));
            for (int j=0;j<arr3[i].length;j++){
                System.out.println();
                System.out.print(arr3[i][j]+" ");
            }
        }

    }
}
