import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int myNumber=(int)( Math.random()*5);
        int userNumber;
        do {
            System.out.println("Please guse your number : ");
             userNumber=sc.nextInt();
            if (myNumber==userNumber){
                System.out.println("Wooo Currect");
                break;
            }
            else{
                System.out.println("oops Pleas try again");
            }

        }while(userNumber>=0);
    }
}
