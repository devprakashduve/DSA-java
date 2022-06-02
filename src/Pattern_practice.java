import java.util.*;
import java.util.Arrays;

public class Pattern_practice {

    public static void main(String[] args) {
        System.out.println("Please giv the input as per function");
//        fun2();
//        fun3();
//        fun4();
//
//        fun5();
//        fun6();
//        fun7();
//        fun8();
//        fun9();
//        fun10();
//        fun11();
//        fun12();
//        fun13();
        fun14();
//          fun15();
        /*       *          *
         **        **
         ***      ***
         ****    ****
         *****  *****
         ************ */
fun16();
        /*
         ********
         ***  ***
         **    **
         *      *    */
fun17();
//        fun18();
//        fun19();
//        fun20();
//        fun21();
//        fun22();
//        fun23();

//        Scanner sc=new Scanner(System.in);
//        Long A=sc.nextLong();
//        int res=fun24(A);
//        System.out.println(res);
      /*  Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        if (A<=1){
            System.out.println("There are no prime numbers less than or equal to "+ A);
            return;
        }
        String res=primeNumbers(A);
        System.out.println(res);*/
        /*Given 2 non-negative integers A and B, find gcd(A, B)

GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.

*/
//        Scanner sc=new Scanner(System.in);
//        Long A=sc.nextLong();
//        Long B=sc.nextLong();
//
//        int res=gcd(A,B);
//        System.out.println(res);

//        fun25();
//       boolean res= fun26();
//        System.out.println(res);
//        boolean res= fun27();
//        System.out.println(res);
//        fun28();
//        int[] arr={ 1,1,1 };
//        int res= solve(arr,2);
//        System.out.println(res);
//        fun29();


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
//        System.out.println("working");
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
    public static void fun25(){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int x=0;


        while(x<=T){

            int A=sc.nextInt();
            int res[]=new int[A];
            int i=0;
            String odd="",even="";
            while(i<A){
                int n=sc.nextInt();
                if(n%2==0)
                    even+=n+" ";
                else if(n%2==1)
                    odd+=n+" ";
                res[i]=n;
                i++;
            }

            System.out.println(odd);
            System.out.println(even);
            x++;
        }

    }
    public static int gcd(Long A,Long B){

        int result=1;
        Long small=A;
        if (A>B){
            small=B;
        }
        if (A==0 || B==0){
            result= (int) (A+B);
            return result;
        }
        int i=1;
        while(i<=small){

            if (A%i==0 && B%i==0)
            {
                result=i;
            }
            i=i+2;
        }


        return result;
    }
     public static String primeNumbers(int A){

        String result="";
        int i=1;
        while(i<=A){
            int j=1;
            int count=0;
            while(j<=i){

                if (i%j==0){
                    count++;
//                    System.out.println(i);
                }
                j++;
            }
            if(count<=2 && i!=1){
                result+=i+" ";
            }
            i++;
        }


        return result;
     }
    public static int  fun24(Long n){

        Long num=n;
        int result=0;
        int base=1;

        Long temp=num;
        while(temp>0){
            Long rem=temp%10;
            result+=rem*base;
            temp=temp/10;
            base*=2;
        }
        return result;
    }
     public static void fun23(){
         Scanner sc=new Scanner(System.in);
         String a=sc.nextLine();
         String b=sc.nextLine();
         if(a.length()==b.length()){
             int i=0;
             String result="Anagrams";
             while(i<=a.length()-1){
                 int j=0;
                int count1=0;
                 int count2=0;
                 while(j<=a.length()-1) {
                     char x=a.charAt(i);
                     char y=b.charAt(j);
                     char z=a.charAt(j);
                     if(Character.toUpperCase(x)==Character.toUpperCase(z)){
                         count1++;
                     }
                     if(Character.toUpperCase(x)==Character.toUpperCase(y)){
                         count2++;
                     }
                 j++;
                 }
                 //System.out.println(count2+" "+count2);
                 //System.out.println(result);
                 if (count1==count2) {
                     result="Anagrams";
                 } else {
                     result="Not Anagrams";
                 }

                 i++;
             }
             System.out.println(result);

         }
     }

    public static void fun22(){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();

        int i=A.length()-1;
        String temp="";
        while(i>=0){
            temp+=A.charAt(i);
            i--;
        }
      //  System.out.println(temp+" "+A);
        if(temp.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void fun21(){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int N=sc.nextInt();
        String arr[]=new String[(S.length()-2)];
        int i=0;
        while(i<=(S.length()-3)){
            char x0=S.charAt(i);
            char x1=S.charAt(i+1);
            char x2=S.charAt(i+2);
           arr[i]=x0+""+x1+""+x2;
//            System.out.println(S.charAt(i));
            i++;
        }
Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void fun20(){
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();

        System.out.println(A.length()+B.length());
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
        if (A.compareTo(B)>0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


    }
    public static void fun19(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for (int i=1;i<=N;i++){
            String res="";
            for (int j=1;j<=N-i;j++){
                res+="0";
            }
            int count=i;
            while(count<=i){

                res+=count;
                count++;
            }
            for (int j=1;j<=N-i;j++){
                res+="0";
            }
            System.out.println(res);

        }

    }
    public static void fun18(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int rows = N, k = 0, count = 0, count1 = 0;

        for (int i = 1; i <= rows; ++i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("0 ");
                ++count;
            }

            while (k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i + k) + " ");
                    ++count;
                } else {
                    ++count1;
                    System.out.print((i + k - 2 * count1) + " ");
                }

                ++k;
            }
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("0 ");
                ++count;
            }
            count1 = count = k = 0;

            System.out.println();
        }

    }
    public static void fun17(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for(int i=N;i>=1;i--){
            String res="";
            for(int j=1;j<=i;j++){
                res+="*";
            }
            for(int j=1;j<=2*(N-i);j++){
                res+=" ";
            }
            for(int j=1;j<=i;j++){
                res+="*";
            }
            System.out.println(res);
        }
    }
     public static void fun16(){
         Scanner sc=new Scanner(System.in);
         int N=sc.nextInt();
         for(int i=1;i<=N;i++){
             String res="";
             for(int j=1;j<=i;j++){
                 res+="*";
             }
             for(int j=1;j<=2*(N-i);j++){
                 res+=" ";
             }
             for(int j=1;j<=i;j++){
                 res+="*";
             }
             System.out.println(res);
         }
     }
     public static void fun15(){

        int N=6;

        int[] oddNum=new int[6];
        int i=1;
        int j=0;
        while(i<=N*2){
            if (i%2==1 && j<N)
            {
            oddNum[j]=i;
            j++;
            }
            i++;
        }
int arrDiv=oddNum.length/2;
             for (int k=0;k<(arrDiv);k++){
                 for (int l=oddNum[arrDiv];l<oddNum[arrDiv]-k;k--){
                     System.out.print(" -");
                 }
                 for (int l=0;l<oddNum[k];l++){
                     System.out.print("*");
                 }
                 for (int l=oddNum[k];l<oddNum[k]-k;l--){
                     System.out.print("-");
                 }
                 System.out.println();
             }



         System.out.println(Arrays.toString(oddNum));

     }
    public static void prstar(int num){
        int i=0;
        String res="";
        while (i<num){
            res+=" * ";
            i++;
        }
        System.out.println(res);
    }
    public static void fun14(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            String res="";

            res+="*";
            for(int j=1;j<N-1;j++){
              if (i==1 || i==N){
                  res+="*";
              }
              else {
                  res+=" ";
              }

            }
            res+="*";
            System.out.println(res);
        }
    }

    public static  void fun13(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        for(int i=1;i<=N;i++){


            String res="";
            for(int j=i;j<=N;j++){
               res+="*";
            }
            for(int j=0;j<i;j++){
                if (j>0)
                    res+="  ";
            }
            for(int j=0;j<=N-i;j++){
                res+="*";
            }
            System.out.println(res);


        }
    }

    public static void fun12() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1;i<=N;i++){
            System.out.print(" - ");
            for (int j=1;j<=N-i;j++) {

                    System.out.print("  ");
                            }
            for (int j=1;j<=i;j++) {

                System.out.print(" * ");
            }


            System.out.println();


        }
    }
    public static void fun11() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i=1;
        while(i<=N){
            int j=1;
            while(j<=i) {
                if (j%2==0)
                     System.out.print(j+ " ");
                else
                    System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void fun10() {
        /*Squire pattern*/
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int i=1;
        while(i<=M){
            int j=1;
            while(j<=N) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void fun9(){
        /*Squire pattern*/
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
    int i = 1;
    String res="";
while(i<=(N*N)){

    if (i%N==0){
        res+=" * ";
        res+="\n";
    }
    else{
        res+=" * ";

    }
        i++;
    }
        System.out.println(res);
}
public static void fun8(){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int i=1;
    //String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    while(i<=N){
        int j=1;
        while(j<=N){
            if (j<=i){ System.out.print(j+" "); }else{ System.out.print("0 ");}
//            System.out.print(j+" ");
            j++;
        }

//        System.out.println();
        i++;
    }
}
    public static void fun7(){
        /*You are given an integer N you need to print all the Armstrong Numbers between 1 to N.

If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).*/
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();


        while(T>0) {
            int result=0;
            int N=sc.nextInt();;

            while (N > 0) {
//                System.out.println(N+"================================");
                int rem = N % 10;
                result += rem * rem * rem;
                N = N / 10;
//                System.out.println(rem);
            }
            System.out.println(result);

T++;
        }


    }
    public static void fun6(){
        /*Given a positive integer A, write a program to find the Ath Fibonacci number.*/
        Scanner sc =new Scanner(System.in);
        int A=sc.nextInt();

         int j=1;
         int k=1;
         int l=1;
         for (int i=1;i<=A;i++){
//             System.out.println(i);

          if (i>=1 && i<=A){
            // System.out.print(j+" ");
              if (i==A){
                  System.out.println(k);
              }

             l=j;
             j=j+k;
             k=l;

         }else{
        j=i;
//        System.out.print(i + " ");
    }


}
    }

    public static void fun5(){
        /*Prime Number.*/
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
int i=2;
String result="Yes";
while(i<A){
if (A%i==0){
    result="No";
}

i++;
}
        System.out.println(result);

    }

    public static void fun4(){
        Scanner sc=new Scanner(System.in);
        String val=sc.nextLine();
        String[] arr=val.split(" ");
        int A=Integer.parseInt(arr[0]);
        int B=Integer.parseInt(arr[1]);
        int C=Integer.parseInt(arr[2]);
        if((A==B) && (B==C)){
            System.out.println("equilateral");
        }
        else if(A==B || B==C || C==A){
            System.out.println("isosceles");
        }
        else{
            System.out.println("scalene");
        }
    }
    public static void fun3(){
 /*You are given a Bank account having N amount and you are asked to perfrom ADD(credit) and SUBTRACT(debit) operations.
After each operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient
 Funds"(without quotes) and the operation is skipped.*/

        Scanner sc=new Scanner(System.in);
        Long N=sc.nextLong();
        int iteration=sc.nextInt();

        String arr[]=new String[iteration];
//        System.out.println(arr.length+" "+iteration);
        int i=0;
//        System.out.println(i);i
        String operationAmount=sc.nextLine();
        arr[i]=operationAmount;
        do {
//            System.out.println(i);
            operationAmount=sc.nextLine();
            //System.out.println(operationAmount);
            arr[i]=operationAmount;
            i++;

        }while(i<iteration);
     //   System.out.println(Arrays.toString(arr));

        for (int j=0; j< arr.length;j++){
            String action_amount[]=arr[j].split(" ");

            int type=Integer.parseInt(action_amount[0]);
            Long val=Long.parseLong(action_amount[1]);
            if (type ==1){
                N+=val;
                System.out.println(N);
            }
            else if (type ==2){
                if (val> N){
                    System.out.println("Insufficient Funds");
                }else{
                    N-=val;
                    System.out.println(N);
                }
            }
        }


//        int i=0;
//        while(i<=arr.length){
//           // System.out.println(N);
//            System.out.println(i);
//            String operationAmount=sc.nextLine();
//            //System.out.println(operationAmount);
//            arr[i]=operationAmount;
//
//
//            ++i;
//
//        }


//        String operation_amount=sc.nextLine();
//        String[] arr=new String[2];
//        arr=operation_amount.split("-");
//        for (String a : arr){
//            System.out.println(a);
//    }
//        int result=0;
//        if (arr[0]=="1"){
//            System.out.println(N+ "ADD"+arr[1]);
//        }
//        else if (arr[1]=="2"){
//            System.out.println(N+" Sub "+arr[1]);
//
//        }

    }

    public static void fun2(){
        //        You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.
        // A triangle is valid if sum of its angles equals to 180.
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if (num1>=1 && num1<180 && num2>=1 && num2<180 && num3>=1 && num3<180){
            if (num1+num2+num3==180){
                System.out.println(1);
            }else{
                System.out.println(0);
            }

        }else{
            System.out.println("Number should be between 1-180");
        }
    }


/*fun2();*/


       /* //Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C in each line.

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if (num1<=num2 && num1<=num3){
            System.out.println(num1);
        }
        else if (num2<=num1 && num2<=num3){
            System.out.println(num2);
        }
        else if (num3<=num1 && num3<=num2){
            System.out.println(num3);
        }*/
/*
//Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if (num1>=num2){
            System.out.println(num2);
        }else {
            System.out.println(num1);
        }
*/


    /*    //Write a program to input an integer from user and print 1 if it is odd otherwise print 0.
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if (num%2==1){
            System.out.println(1);
        }else {
            System.out.println(0);
        }*/
/*
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
        int num2=sc.nextInt();
        if (num1>=1  && num1<10000 && num2>=1  && num2<10000){
            int res= (int) Math.floor(num1/num2);
            System.out.println(res);
        }
*/

      /*  System.out.println("Please Enter a number between 1 to 12");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
       // String mont[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int mont_leapyear_days[]={31,28,31,30,31,30,31,31,30,31,30,31};

        if (num>=1 && num<=12){
            int i=0;

            while(i<arr.length){
                if (num==arr[i]){
                    System.out.println(mont_leapyear_days[i]);
                }
                i++;
            }

        }*/

/*
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();


        if ((num>=1 || num<=1000000) && (num2>=1 || num2<=1000000)){
            if (num>=num2){ System.out.println(num);}
            else if (num2>=num){ System.out.println(num2);}

        }
*/

       /* Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();

        if ((num>=1 || num<=1000000) && (num2>=1 || num2<=1000000) && (num3>=1 || num3<=1000000)){
            if (num>=num2 && num>=num3){ System.out.println(num);}
            else if (num2>=num && num2>=num3){ System.out.println(num2);}
            else if (num3>=num && num3>=num2){ System.out.println(num3);}
        }*/


        /*System.out.println("Please Enter a number between 1 to 12");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        String mont[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

        if (num>=1 && num<=12){
            int i=0;

            while(i<arr.length){
            if (num==arr[i]){
                System.out.println(mont[i]);
            }
            i++;
            }

        }*/




//    }
}