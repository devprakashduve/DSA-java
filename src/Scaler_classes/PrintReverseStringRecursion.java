package Scaler_classes;

import java.util.Scanner;

public class PrintReverseStringRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String data=sc.next();

        String res=ReversString(data,data.length()-1,"");
        System.out.print(res);
    }

    public static String ReversString(String s,int endIndex,String newString){
        if(endIndex<0){
            return newString;
        }
        newString+=s.charAt(endIndex);
        // System.out.print(s.charAt(endIndex));
        endIndex--;
        return ReversString(s,endIndex,newString);

    }
}
