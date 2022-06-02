

import java.util.Arrays;
public class Sorting_Insertion_Selection_Bubble {
    public static void bubble_sort(int[] arr){

        int n=arr.length;
        System.out.println(n);
        int steps=0;
for (int i=0;i<n;i++){

    for (int j=i+1;j<n;j++) {
           int temp=0;
//            System.out.println(arr[i] + " " + arr[j]);
            if (arr[i]>arr[j]){
                System.out.println("yes");
                 steps+=1+3;

                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                //System.out.println(arr[i] + " " + arr[j]);
            }



    }
//    System.out.println(Arrays.toString(arr));
//    System.out.println();
}
    System.out.println(Arrays.toString(arr));
        System.out.println(steps);
    }

    public static void selectin_Sort(){

    }
    public static void main(String[] args) {
        int[] arr={4,10,2,8,93,56,34,21,6,8,4};
        bubble_sort(arr);
        selectin_Sort();
    }
}
