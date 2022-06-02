package Scaler_classes;

import java.util.*;
import java.util.Arrays;

public class Arrays_class {


    public static void main(String[] args) {
//        fun29();
//        int i = 4;
//        int input[][]=new int[i][i];
//         input[i][i] = { {1, 1, 1, 1} , {2, 2, 2, 2},{3, 3, 3, 3},{ 2, 3, 2, 5}};
//        Transformation(input);
//        multi();
//        System.out.println(Math.pow(5,2));
        int arr[]={3,2,-3,4,8,6,69,23,67,12,89,78,56,37,100};
      //  System.out.println(Arrays.toString(arr));
        int k=10;
        boolean res=check2indexisk(arr,k);
    //    System.out.println(res);
       // System.out.println("revert arr=>");
        int[] res2=revertArr(arr);
       // System.out.println(Arrays.toString(res2));

        int res3[]=revertArrUptoSomeIndex(arr,4,8);
        System.out.println();
      //  System.out.println(Arrays.toString(res3));

/* Q.=> problem : Given an integer array **A** and an integer **B**, you have to print the same array after rotating it **B** times towards the right. */
//N2  approach
//        arrRotation();
//        arrRotationSecondWay();
/*Q.=> Write a program to print maximum and minimum elements of the input array A of size N where you have to take integer N and other N elements as input from the user.*/
//          fintMinMax();
//          /*Q.=>  You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.*/

//        findNumberPresentInArray();
        /* Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.

He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.*/
        ArrayList<Integer> arrList=new ArrayList<Integer>();
        arrList.add(2);
        arrList.add(4);
        arrList.add(3);
        arrList.add(1);
        arrList.add(5);
        int B=3;
      int result =  Little_Ponny_and_Maximum_Element(arrList,B);
//        System.out.println(result);


        /* You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists. */
        int res33=findTheSecondLargeNum(arrList);
//        System.out.println(res33);
        /* You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A. */
        int res34=MINIMUM_PICKS(arrList);
//        System.out.println(res34);
        /*Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.

Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B. */
        int AA[] = {1, 2, 3, 4, 5};
        int BB[] = {2, 3};
        ArrayList<Integer> newA=new ArrayList<>();
        ArrayList<Integer> newB=new ArrayList<>();
        for(int x=0;x<AA.length;x++){
            newA.add(AA[x]);
        }
        for(int x=0;x<BB.length;x++){
            newB.add(BB[x]);
        }
        ArrayList<ArrayList<Integer>> result23=new ArrayList<>();
        result23=Multiple_left_rotations_of_the_array(newA,newB);
        System.out.println(result23);
    }
    static   ArrayList<ArrayList<Integer>> Multiple_left_rotations_of_the_array(ArrayList<Integer> A, ArrayList<Integer> B){
        int i=0;
        // newList to store result
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        // loop for number of iteration
        while(i<B.size()){

            //loop to generate new ArrayList
            ArrayList<Integer> newList=new ArrayList<>();
            for(int x=0;x<A.size();x++){
                newList.add(A.get(x));
            }
            int indexVal=B.get(i);
            int j=0;
            // loop to left shift element
            while(j<indexVal){
                int firstInxed=newList.get(0);
                //loop to shift element
                int last_index=newList.size();
                newList.add(last_index,firstInxed);
                newList.remove(0);
                j++;
            }
            //   System.out.print(newList);
            result.add(newList);
            i++;
        }
        return result;
    }
    static int  MINIMUM_PICKS(ArrayList<Integer> A){
        int maxEven=0;
        int minOdd=0;
        int i=0;
        while(i<A.size()){
            int temp=A.get(i);

            if(temp>0 || temp<0){

                if(temp%2==-1 || temp%2==1){
                    if(minOdd==0){
                        minOdd=temp;
                    } else  if(temp<minOdd)
                        minOdd=temp;
                    // System.out.print(minOdd+" ");

                }
                else{
                    if(maxEven==0){
                        maxEven=temp;
                    }
                    else if(maxEven<=temp){
                        maxEven=temp;
                    }
                }
            }
            i++;
        }
        //   System.out.print(maxEven+"-"+minOdd+" ");
        return maxEven-minOdd;
    }
    static int findTheSecondLargeNum(ArrayList<Integer> A){
        if(A.size()<=1){
            return -1;

        }
        int i=0;
        int max=0;
        int secondMax=0;
        while(i<A.size()){
            if(A.get(i)>=max){
                secondMax=max;
                max=A.get(i);
            }else if(A.get(i)>=secondMax){
                secondMax=A.get(i);

            }

            i++;
        }
        return secondMax;
    }
    public static int Little_Ponny_and_Maximum_Element(ArrayList<Integer> A, int B) {
            int res=0;
            int is_present=0;
            for(int i=0;i<A.size();i++){
                if(A.get(i)>=B){
                    res++;
                    if(A.get(i)==B){
                        is_present++;
                        res--;
                    }
                }

            }
            if(res>0 && is_present>0){
                return res;
            }else{
                return -1;
            }

        }

    static void findNumberPresentInArray(){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i=1;
        while(i<=T){
            int A=sc.nextInt();
            int arr[]=new int[A];
            int j=0;
            while(j<A){
                arr[j]=sc.nextInt();
                j++;
            }
            int B=sc.nextInt();
            j=0;
            int res=0;
            while(j<A){
                if(arr[j]==B){
                    res=1;
                    break;
                }
                j++;
            }
            System.out.println(res);

            i++;
        }
    }
    static void fintMinMax(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A=new int[N];
        int i=0;
        while(i<N){
            A[i]=sc.nextInt();
            i++;
        }
        int max=A[0];
        int min=A[0];
        for (int j=0;j<A.length;j++){
            if(max<=A[j]){
                max=A[j];
            }else if(min>A[j]){
                min=A[j];
            }
        }
        System.out.print(max+" "+min);
    }
    static void arrRotationSecondWay(){
        Scanner sc = new Scanner(System.in);
        int array = sc.nextInt();
        int A[] = new int[array];
        for (int i = 0; i < array; i++) {
            A[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        rotateArray(A,num);
    }

    private static void rotateArray(int[] a, int num) {
        if(num ==0)
            return;
        if(num>0) {
            num = num % a.length;
            reverseArray(a, a.length - 1, a.length - num);
            reverseArray(a, a.length - 1-num, 0);
            reverseArray(a, a.length - 1, 0);
        }
        printArray(a);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void reverseArray(int[] a, int i, int j) {
        while (i > j) {
            int head = a[i] + a[j] - a[i];
            int tail = a[i] + a[j] - a[j];
            a[i] = head;
            a[j] = tail;
            i--;
            j++;
        }
     }
    static int[] arrRotate(int[] arr, int start,int B){
        if (start==B){
            return arr;
        }
        int i=0;
        int j=arr.length-1;
        //it will revert array
            for (i = 0; i < arr.length / 2; i++, j--){
                int tempp = arr[i];
                arr[i] = arr[j];
                arr[j] = tempp;
            }
        j=arr.length-1;
// it will again revert array execpt 1 index
            for (i = 1; i < (arr.length / 2)+1; i++, j--){
                int temppp = arr[i];
                arr[i] = arr[j];
                arr[j] = temppp;
            }
start++;
//            it will happen till react to root condition
            return arrRotate(arr,start,B);

    }
    static int[] arrRotation(){
//        N^2 approach
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int i=0;
        int arr[]=new int[A];

        while(i<A){
            int temp=sc.nextInt();
            arr[i]=temp;
            i++;
        }

        int B=sc.nextInt();


        System.out.println(Arrays.toString(arr));

        int arrr[]=arrRotate(arr,0,B);
        System.out.println(Arrays.toString(arrr));
        return arrr;
    }
    public static int[] revertArrUptoSomeIndex(int[] arr3,int start,int end){
//        int res[]=new int[arr.length];
        int n=(arr3.length-1)-end;
        for(int i=start-1;i>=end;i++){
            int temp=arr3[i];
            arr3[i]=arr3[n-i];
            arr3[n-i]=temp;
        }
        return arr3;
    }
    public static int[] revertArr(int[] arr){
//        int res[]=new int[arr.length];
        int n=arr.length-1;
        for(int i=n;i>n/2;i--){
            int temp=arr[n-i];
            arr[n-i]=arr[i];
            arr[i]=temp;
        }

return arr;
    }
    public static boolean check2indexisk(int[] arr, int k){

        for (int i=0; i<arr.length ;i++){
            for (int j=i+1; j<arr.length ;j++) {
                if ((arr[i]+arr[j])==k){
                    return true;
                }

            }

        }
return false;



    }
    public static void multi(){

        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3},{4,4,4}};


        int c[][]=new int[a.length][b.length];


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] Transformation(int[][] arr) {

        int N=arr.length;
        int M=arr[0].length;
        int result[][]=new int[M][N];
        for (int i=0;i< N;i++){
            for (int j=0;j< M;j++){
                result[j][i]=arr[i][j];
            }

        }
      //  System.out.println(Arrays.toString(result));
        return result;
    }
    public static int[] sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);
        return arr;
    }
    public static void uniqueVal(int[] arr) {
        int[] newArr = sortArr(arr);
//    System.out.println(Arrays.toString(newArr));
        String res="";
        for (int i = 0; i < newArr.length; i++) {
            int count = 0;

            for (int j = 0; j < newArr.length; j++) {
                if (newArr[i] == newArr[j]) {
                    count++;
                }
            }
            if (count <= 1) {
                res+=newArr[i] + " ";

            }

        }
        //  res+="\n";
        System.out.println(res);
    }




    public static void fun29() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i = 0;
        while (i < T) {

            int A = sc.nextInt();
            int arr[] = new int[A];
            int j = 0;

            while (j < arr.length) {
                int temp = sc.nextInt();
                arr[j] = temp;
                j++;
            }
            uniqueVal(arr);

            i++;
        }

    }




    public static int solve(int[] A, int B) {
        int i=0;
        int count=0;
        while(i<A.length-1){


            int j=i+1;

            while(j<A.length){

                if((A[i]+A[j])==B){
                    System.out.println(i+" "+j);
                    count++;
                } j++;
            }

            i++;
        }
        return count;
    }
    public static void fun28(){
        int A[]={3,2,2,7,8,3,7};
        int i=0;
        int res=0;
        while(i<A.length){
            int j=0;
            int count=0;
            while(j<A.length){
                if (A[i]==A[j]){
                    count++;
                }
                j++;
            }
            if (count<=1){
                res=A[i];
            }
            i++;
        }
        System.out.println(res);

    }
    public static boolean fun27(){
        int A[]={1,2,3,4,5,6,7,9};
        int i=0;
        boolean result=true;
        while(i<A.length-1){

            if (A[i]>A[i+1]){
                result=false;
            }

            i++;
        }
        return result;
    }
    public static boolean fun26(){
        int A[]={1,8,3,4,5,6,7,9};
        int k=5;
        int i=0;
        boolean result=false;
        while(i<A.length-1){
            int res=A[i]-A[i+1];
            if (res==k){
                result=true;
            }

            i++;
        }
        return result;
    }
}
