package youtube;

public class Recursion {
    public static void main(String[] args) {
//        print hello word 10 times
        rcrn(10);
    }
    static void rcrn(int n){
        if(n<=0){
            return;
        }
        System.out.println("Hello Word "+n);
        rcrn(n-1);

    }

}
