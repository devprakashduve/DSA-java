package Scaler_classes;

import java.util.Scanner;

public class Else_if {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        double result=0.0;

        if (val<=50){
            result+=val*0.5;

        }
        else if (val>=150){
            result+=(val-50)*0.75;

        }
        else if (val>=250){
            result+=(val-150)*0.75;

        }
        else{
            result+=(val-250)*1.5;
        }

        System.out.println(result);

    }
}
