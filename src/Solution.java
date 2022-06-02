import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        String[] split_str=s.split("");
        //String[] new_array;
        for (int i=0;i<split_str.length;i++){
            System.out.println(split_str[i]);

        }
        return 0;
    }
    public static void quest1(){

        String elements="";
            Scanner sc=new Scanner(System.in);
            String ele=sc.nextLine();
            elements=ele;
        String[] ele2=elements.split(" ");
          for (int i=0;i<ele2.length;i++){
               System.out.println(ele2[i]);
                }


    }
    public static void quest2() throws IOException {
int num=0;
int[] ele=new int[2];
      do {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          int toRead = Integer.parseInt(reader.readLine());
          ele[num]=toRead;
          num++;
      }while(num<2);
        System.out.println(ele.length);
for (int i=0;i<ele.length;i++){
    System.out.print(ele[i]);
    System.out.print(" ");
}




    }

    public static void quest3(){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        //inp.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = inp.nextInt();
//                inp.nextLine();
        }
        inp.close();
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);

        }
    }
    public static void quest4(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] i=new int[n][m];

        for (int x=0;x<n;x++){
            for (int y=0;y<m;y++){
            i[x][y]=sc.nextInt();
            }
        }

        for (int x=0;x<m;x++){
            int res=0;

            for (int y=0;y<n;y++){
             //   System.out.println(i[y][x]);
                   res+=i[y][x];
            }
            System.out.println(res);
        }

//        System.out.println("calculate");

    }




        public static void main(String[] args) {

            try
            {
                System.out.print("Hello" + " " + 1 / 0);
            }
            catch(ArithmeticException e)
            {
                System.out.print("World");
            }
        //    foo(null);
        }
        public static void foo(Object o) {
            System.out.println("Object argument");
        }
        public static void foo(String s) {
            System.out.println("String argument");
        }



//    public static void main(String[] args) {
////       int result= lengthOfLongestSubstring("asdkjkljds");
////        System.out.println(result);
//        int M = 3;
//        // quest1();
//        try {
//            //  quest2();
//
//         // quest3();
//            quest4();
//
//
////            for (int i=1;i<=M;i++){
////                System.out.println(i);
////            }
//
//            if(M%3==0 && M%5==0 ){
//                System.out.println("Good Number");
//            }else  if(M%3==0 && M%5!=0){
//                System.out.println("Bad Number");
//            } else if(M%3!=0 && M%5==0 ){
//                System.out.println("Poor Number");
//            }else{
//                System.out.println(-1);
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
}
