import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LetCode_Practice {

    public static int lengthOfLongestSubstring(String s){
        String[] split_str=s.split("");
        int res=0;
        for (int i=0;i< split_str.length;i++){
         //  System.out.println(Arrays.toString(split_str));
        }
        System.out.println(Arrays.toString(split_str));
        return res;
    }

    public static void main(String[] args) {


//        lengthOfLongestSubstring("AAABSCSC");
//        fun1();
        fun2();
    }
    public  static void fun2(){
        /*Given a string A which represents a time in 24 hour HH:MM format.
Find the minimum number of minutes need to pass to reach palindromic time.
Let some time be XY:ZW then it is palindromic if X == W and Y == Z.*/
        String A="23:59";String[] arr1=A.split(":");
        String[] arr_rev=arr1[0].split("");
        String[] arr_rev2=arr1[1].split("");
        int x=Integer.parseInt(arr_rev[0]);
        int y=Integer.parseInt(arr_rev[1]);

        int xy=Integer.parseInt(arr_rev[0]+arr_rev[1]);
        int yx=Integer.parseInt(arr_rev[1]+arr_rev[0]);


        int z=Integer.parseInt(arr_rev2[0]);
        int w=Integer.parseInt(arr_rev2[1]);
        int zw=Integer.parseInt(arr_rev2[0]+arr_rev2[1]);
        int wz=Integer.parseInt(arr_rev2[1]+arr_rev2[0]);

int temp_zw=zw;
int temp_xy=xy;
int res=0;
//System.out.println(temp_xy+" "+wz);

while(temp_xy<24){
//    System.out.println(" temp xy "+temp_xy);
    String reverse="";
    while(temp_zw<=60){
        temp_zw++;
        if(temp_zw==60){
            temp_zw=00;
            temp_xy+=1;
            break;
        }
    }
//    System.out.println(temp_zw+" "+temp_xy);

    while(xy>=0){
        if (xy==0){
            break;
        }
        int rem=xy%10;
        reverse+=rem+"";
        xy=xy/10;
//        System.out.println(rem);

    }

    if (temp_xy>=24){
        temp_xy=00;
        break;
    }
    int result=Integer.parseInt(reverse);
    result=result-zw;
    System.out.println(result);
    System.out.println(arr1[0]+" "+arr1[1]);



//    System.out.println(temp_xy);
   // System.out.println(temp_zw);
//    temp_xy++;


}

      //  System.out.println(temp_xy);


       // System.out.println(res);

    }
    public  static void fun1(){
        /*Given two integers A and B, where A is the first element of the sequence then find Bth element of the sequence.
If the kth element of the sequence is X then k+1th element calculated as:
if X is even then next element is X/2.
else next element is 3×X + 1.*/
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        long X=Long.parseLong(String.valueOf(A));
        long res=0;

            for(int i=0;i<B;i++){
                res=X;
               // System.out.println(X);
                if(X%2==1)
                    X=(3*X)+1;
                else
                    X=X/2;
        }
        System.out.println(res);
    }
}
