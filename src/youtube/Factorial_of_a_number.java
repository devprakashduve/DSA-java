package youtube;


public class Factorial_of_a_number {
    public static void main(String[] args) {
//find factorial
        long res=factorial(5);
        System.out.println("result="+res);
 /*
 // find the trailing 0 of a number by factorial

 */

        int ress=trailingZeros(5);
        System.out.println("result="+ress);
    }
public static int trailingZeros(int n){
        int res=0;
        for (int i=5;i<=n;i=i*5){
            System.out.print(n+"/"+i+" + " );
            res=res+(n/i);
        }
        return  res;
}
    public static long factorial(int n){
//        formula n!=n*(n-1);
//        5!=5*4*3*2*1;
long result=1;
int i=n;
while(i>=1){
    result*=i;
    i--;
}

return result;

    }
}
