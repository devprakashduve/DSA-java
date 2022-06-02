import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age=0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
               try {
                   System.out.println("Please enter your age : ");
                   age = sc.nextInt();
                   if (age > 18)
                       System.out.println("you are adult");
                   else
                       System.out.println("You are under 18");
               }catch(Exception e){

                   break;

               }finally {
                   sc.close();
               }

            } while (age > 1);
        }
    }
}