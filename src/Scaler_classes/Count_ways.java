package Scaler_classes;

public class Count_ways {

    public static void main(String[] args) {
        int[] A={2, 1, 6, 4};
       int res= solve(A);
        System.out.println(res);
    }
    public static int solve(int[] A) {
        int ans =0;
        int n=A.length;
        int PSE[]=new int[n];
        int PSO[]=new int[n];
        int pse=0;
        int pso=0;
        for(int i=0;i<n;i++){
            if(i % 2==0){
                pse+=A[i];
                PSE[i]=pse;
            }else{
                PSE[i]=pse;
            }
        }
        for(int i=0;i<n;i++){
            if(i % 2!=0){
                pso+=A[i];
                PSO[i]=pso;
            }else{
                PSO[i]=pso;
            }
        }

        int evenSum=0;
        int oddSum=0;

        for(int i=0;i<n;i++){

            if(i==0){
                oddSum=PSE[n-1]-PSE[i];
                evenSum=PSO[n-1]-PSO[i];

            }
            else{
                oddSum=PSO[i-1]+(PSE[n-1]-PSE[i]);
                evenSum=PSE[i-1]+(PSO[n-1]-PSO[i]);

            }


            //  System.out.print(evenSum+"/ "+oddSum+"=>>> ");
            if(evenSum==oddSum){
                ans++;
            }

        }

//  System.out.print(" E=> ");
// for(int i=0;i<n;i++){
//     System.out.print(PSE[i]+" ");
// }

// System.out.print(" O=> ");
// for(int i=0;i<n;i++){
//     System.out.print(PSO[i]+" ");
// }


        return ans;
    }
}
