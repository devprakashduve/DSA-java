package Scaler_classes;

public class Test {

    public static void main(String[] args) {
        int A[]={-98,54,52,15,23,-97,12,64,52,58};
int res=solve(A);
        System.out.println(res);
    }

    public static int solve(int[] A) {

        int max=0;
        int min=0;
        int i=0;
        while(i<A.length){

int tempp=A[i];
if(min==0|| max==0){
    if(A[i]%2==0 ){
        max=A[i];
    }
    if(A[i]%2!=0 ){
        min=A[i];
    }
}
            System.out.println(max<=A[i]);
            if((A[i]%2==0 || A[i]%2==-0) && max<=A[i]){
                max=A[i];
            }

            else if(A[i]%2!=0){
                if(A[i]%2==-1){
                    if(tempp>min){
                        min=A[i];
                    }
                }
//                System.out.println(-97<-98);
                if(tempp<min){
                    min=A[i];

                }

            }


            i++;
        }
        System.out.print(max+"-"+min);
        return max-min;
    }
}
