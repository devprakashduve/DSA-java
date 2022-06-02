package Scaler_classes;

import java.util.*;

public class Loop {



    public static void main(String[] args) {
        /*print complete squire root.*/
//        fun0();
        /*For a given number A, print its multiplication table having the first 10 multiples.*/
//        fun1();
        /*Write a program to print all Natural numbers from 1 to N where you have to take N as input from user*/
//        fun2();
/*Write a program to print all Natural numbers from N to 1 where you have to take N as input from user*/
//        fun3();
        /*You are given a positive integer A. You have to print the sum of all odd numbers in the range [1, A].*/
//        fun4();
        /*You are given two integers A and B. You have to find the value of AB.
NOTE: The value of answer is always less than or equal to 109.*/
//        fun5();
    /*Write a program to print all odd numbers from 1 to N where you have to take N as input from user.*/
//        fun6();
    /*Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.*/
//        fun7();
//        fun8();

//        fun9();
//        fun10();
//        fun11();
//        fun12();
//        fun13();
//        fun14();
//        fun15();
//        fun16();
//        fun17();
//        fun18();
//        fun19();
//        fun20();
//        fun21();
//        fun22();
        fun23();
    }
    public static void fun23(){
        /*Write a program to input T numbers(N) from user and print the sum of the digits of the given numbers.*/
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String res="";
        for (int i = 1 ;i<=N ;i++){
            int count=0;
            int A = sc.nextInt();
            for(int j = A; j >=0;j--){

                int rem=A%10;
//                System.out.println( "Number"+ A +"= remaindr"+rem +"/");
                count+=rem;
                A = A / 10;
                if (A<=0){
                    break;
                }
            }
            if(i==1){
                res+=count;
            }else{ res+="\n"+count; }
        }
        System.out.println(res);
    }
    public static void fun22(){
        /*Write a program to input an integer T and then T lines each containing two integers A & B from user and print T lines conatining HCF of two given 2 numbers A and B.*/
        Scanner sc=new Scanner(System.in);
            int A=sc.nextInt();
            int B=sc.nextInt();
            int temp;
            int gcd=1;
            if (A>B)
                temp=A;
            else
                temp=B;
            for (int i=1;i<=temp;i++){
                if (A%i==0 && B%i==0){
                    gcd=i;
                }
            }
            int lcm=(A*B)/gcd;
        System.out.println(lcm);


    }
    public static void fun21(){
        /*Write a program to input an integer T and then T lines each containing two integers A & B from user and print T lines conatining HCF of two given 2 numbers A and B.*/
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        String val=sc.nextLine();
        int temp=0;
        String finalRes="";
        while(i<=N){
            int res=1;
            val=sc.nextLine();

            String A_B[]=val.split(" ");
            int A=Integer.parseInt(A_B[0]);
            int B=Integer.parseInt(A_B[1]);
            if (A<=B){
                temp=A;
            }else{
                temp=B;
            }
            //System.out.println(temp);
            for (int j=1;j<=temp;j++){
            if (A%j==0 && B%j==0){
                res=j;
              //  System.out.println(res);
            }
            }
            i++;
            finalRes+=res+"\n";
          //  System.out.println(res);


        }
        System.out.println(finalRes);

    }
    public static void fun20(){
/*Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed. Negative numbers are not palindromic.*/

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
//        if (N<0){
//            return 0;
//        }
        int r,sum=0,temp;
        int n=N;//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("True");
        else
            System.out.println("False");

}
    public static void fun19(){
        /*Write a program to input T numbers(N) from user and print count of digits of the given numbers.*/
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String res="";
        for (int i = 1 ;i<=N ;i++){
            int count=0;
            int A = sc.nextInt();
            for(int j = A; j >=0;j--){

                count+=1;
//                System.out.println( "Number"+ A +"= remaindr"+rem +"/");
                A = A / 10;
                if (A<=0){
                    break;
                }
                }
            if(i==1){
                res+=count;
            }else{ res+="\n"+count; }
        }
       System.out.println(res);
    }
    public static void fun18(){
        /*You are given N positive integers.

For each given integer A, you have to tell whether it is a perfect number or not.

Perfect number is a positive integer which is equal to the sum of its proper positive divisors.*/
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();



        String res="";
        for (int i = 1; i <=N; i++) {
            int proper_divisor=0;
            int A = sc.nextInt();
            for (int j = 1; j < A; j++) {
                if (A % j == 0) {
                    proper_divisor += j;
                     // System.out.println("=##"+j+" - "+A+"=");
                }
            }
           // System.out.println(proper_divisor);
            if (proper_divisor==A){
                res+="YES\n";
            }
            else {
                res+="NO\n";
            }
        }
        System.out.println(res);
    }
    public static void fun17(){
        /*Given an integer A, you have to tell whether it is a prime number or not.
A prime number is a natural number greater than 1 which is divisible only by 1 and itself.*/
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();


            int fact_count=0;

            for (int i = 1; i <= N; i++) {

                if ( N % i == 0 ){
                    fact_count += 1;
                    //  System.out.print("=##"+i+" ");


                }
            }

            if (fact_count<=2){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }


    }
public static void fun16(){
        /*You are given an integer N you need to print all the Prime Numbers between 1 and N.
Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.*/
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    String prime="";
    for (int j=2;j<=N;j++) {
        int fact_count=0;
        //System.out.print("*"+j+" => ");
        for (int i = 1; i <= N; i++) {

            if ( j % i == 0 ){
                fact_count += 1;
              //  System.out.print("=##"+i+" ");


            }
        }
        //System.out.println("============================"+ fact_count);
        if (fact_count<=2){
            prime+=j+"\n";
        }

    }
//    for (int k=0;k<prime.length;k++){
//        System.out.println("%%%%%%%%%%"+prime[k]);
//    }
    System.out.println(prime);


}
    public static void fun15(){
        /*Write a program to input T numbers(N) from user and print first and last digits of the given numbers.*/
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        String res="";
        for (int i=1;i<=T;i++){
            int N=sc.nextInt();
            int last=N%10,first=0;
            while(N>0){
                int mod=N%10;
                first=N;
                N=N/10;
            }
            res+=""+first+" "+last+"\n";


        }
        System.out.println(res);

    }
    public static void fun14(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            if (N%i==0) {
                System.out.println(i);
            }
        }
    }
   public static void  fun13(){
        /* factor of N (can divide number with remainder=0)*/
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       for(int i=1;i<=N;i++){
           if (N%i==0) {
               System.out.println(i);
           }
       }

    }
    public static void fun12(){
        /* prent odd numbers */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i=i+2){
                System.out.println(i);
        }

    }

    public static void fun11(){
        /*reverse number */
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int rev=0;
    while(N>0){
        int rem=N%10;

        System.out.print(rem);
//        OR
        rev=rev*10+rem;

        N=N/10;

    }
    System.out.println();
    System.out.println(rev);
}
    public static  void fun10(){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        while(N>0){
            int rem=N%10;
            sum+= +rem;
            N=N/10;

        }
        System.out.println(sum);

    }
    public static void fun9(){
        /*You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.

Arae of a circle having radius R is given by (π * R2).

NOTE: Since, the answer can be a real number, you have to return the ceil value of the area. Ceil value of a real number X is the smallest integer that is greater than or equal to X.*/
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        double res=3.14159265359*(A*A);
        System.out.println(res);
        System.out.println(Math.ceil(res));


    }

    public static void fun8(){
        /*Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user*/
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int i=1;
        int res=0;
        while(i<=A){
            res+=i;
            i++;
        }
        System.out.println(res);




    }
    public static  void fun7(){
        /*Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line..*/
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();


            if (A>=B)
                System.out.print(A);
            else
                System.out.print(B);

    }
public static  void fun6(){
        /*Write a program to print all odd numbers from 1 to N where you have to take N as input from user.*/
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int i=1;
    while(i<=num){
        if (i%2==1){
            System.out.print(i+" ");
        }
        i++;

    }
}
    public static void fun5(){
        /*You are given two integers A and B. You have to find the value of AB.
NOTE: The value of answer is always less than or equal to 109.*/
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int i=1;
        int result=1;
        while (i<=B){
            result*=A;

            i++;
        }
        System.out.println(result);

    }
    public static void fun4(){
        /*You are given a positive integer A. You have to print the sum of all odd numbers in the range [1, A].*/
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        int result=0;
        while(i<=num){
            if (i%2==1){
                result+=i;
            }
            i++;
        }
        System.out.println(result);
    }
    public static void fun3(){
        /*Write a program to print all Natural numbers from N to 1 where you have to take N as input from user*/
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        while(num>=1){
            System.out.print(num+" ");
            num--;
        }
    }
    public static  void fun2(){
        /*Write a program to print all Natural numbers from 1 to N where you have to take N as input from user*/
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            System.out.print(i+" ");
            i++;
        }
    }
    public static void fun1(){
        /*For a given number A, print its multiplication table having the first 10 multiples.*/
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int i=1;
     while(i<=10){
         System.out.println(num+" * "+i+" = "+i*num);
         i++;
     }
    }
    public static void p(String val){
        System.out.println(val);
    }
    public static void fun0(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        while(num<=n){
            if (num*num<=n) {
                System.out.print(num*num + " ");
            }
            num++;
        }
    }
}
