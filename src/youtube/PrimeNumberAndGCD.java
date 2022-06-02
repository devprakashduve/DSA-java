package youtube;

import java.util.Arrays;

public class PrimeNumberAndGCD {
    public static void main(String[] args) {
       /*boolean[] res= seiveOfEratoSthenes(25);
        System.out.println(Arrays.toString(res));
*/
        /*int res2=GCD(15,35);
        System.out.println(res2);*/
        System.out.println(fastPower(3,5));
        System.out.println(fastPowerforBigger(2324243,5,1000007));

    }
// fastpower

    static long fastPowerforBigger(long a,long b,int n){
        long res=1;
        while(b>0){
            if((b&1)!=0){
                res=(res%n * a%n)%n;
            }
            a=(a%n*a%n)%n;
            b=b>>1;
        }

        return res;
    }
    static int fastPower(int a,int b){
        int res=1;
        while(b>0){
            if((b&1)!=0){
                res*=a;
            }
            a*=a;
            b=b>>1;
        }

        return res;
    }

    // GCD or HCF
static int GCD(int A,int B){
if(B==0){
    return A;
}
return GCD(B,A%B);
}





//    prime numbers
    /* if n is a prime number then there will be no factor in Root N

    */
static  boolean[] seiveOfEratoSthenes(int n){
    boolean isPrime[]=new boolean[n+1];
    Arrays.fill(isPrime,true);
    isPrime[0]=false;
    isPrime[1]=false;

for (int i=2;i*i<=n;i++){
    for(int j=2*i;j<=n;j+=i){
        isPrime[j]=false;
    }

}
    return  isPrime;
}



}
