public class Pattern {

    public  static void pattern1(){
        int i=0;
        int k=0;
        System.out.println("Patter 1");
        while(k<10){
            System.out.print("--");
            k++;
        }
        while(i<10){
            int j=0;
            String result="";
            while(j<i){
                result+=" * ";
                j++;
            }
            System.out.println(result);
            i++;
        }
    }


public static void pattern2(){
        int i=0;
        int k=0;

        while(k<10){
            System.out.print("------");
            k++;
        } System.out.println("patter 2");
        while(i<=5){
            int j=0;
            String result="";
            while(j<=5){
                result+=" * ";
                j++;
            }
            System.out.println(result);
            i++;
        }
}

public static void pattern3(){
        int i=0;
        int k=0;
        while(k<=10){
            System.out.print("--");
            k++;
        }
    System.out.println("PATTERN3");
        while(i<=5){
            int j=0;
            String result="";
            while(j<=5){
                if ((i==0 || j==0) ){
                    result +=" * ";
                }
              else if( (i==5 || j==5)){
                    result += " * " ;
                }else{ result += "   " ; }
                j++;
            }
            System.out.println(result);
            i++;
        }
}

public static void pattern4(){
    int k=0;
    int n=5;
    while(k<=10){
        System.out.print("--");
        k++;
    }
    System.out.println("Pattern 4");
    int i=0;

    while(i<=n){
        String result="";
        int j=0;
        while(j<=n){
            if (j>=n-i)
                result+=" * ";
            else
                result+="   ";
            j++;

        }
        System.out.println(result);
        i++;

    }
}
    public static void pattern5(int num){
        int k=0;
        int n=num-1;
        while(k<=10){
            System.out.print("--");
            k++;
        }
        System.out.println("Pattern 5");
        int i=0;

        while(i<=n){
            String result="";
            int j=0;
            while(j<=n){
                if (j==0 || i==0){
                    result += " * ";
                }else{
                    result += "   ";
                }

                if (j>=n-i) {
//                    result += " * ";
                    if (j==n || i==n){
                        result += " * ";
                    }else if(j==n-i){
                        result += " * ";
                    }else{
                        result += "   ";
                    }
                }
                else {
                    result += "   ";
                }
                j++;

            }
            System.out.println(result);
            i++;

        }
    }

    public static void pattern6(int num){
        int k=0;
        int n=5;
        while(k<=10){
            System.out.print("--");
            k++;
        }
        System.out.println("Pattern 6");

        int i=0;

        while (i<=num){
            int j=0;
            String result="";

            while(j<=num){
                 if (j>=(num-i)/2 && j<=(num+i)/2 ){
                    result += " * ";
                }
                else{
                    result += "   ";
                }
                j++;

            }
            System.out.println(result);
            i++;
        }

    }

    public static void pattern7(int num){
        int k=0;
        int n=num;
        while(k<=10){
            System.out.print("--");
            k++;
        }
        System.out.println("Pattern 7");

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" * "+"   ");
            }
            System.out.println();
        }

    }
    public  static void pattern8(int num){
        int k=0;
        int n=num;
        while(k<=10){
            System.out.print("--");
            k++;
        }
        System.out.println("Pattern 8");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for (int j=1;j<=(2*(n-i));j++){
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        // Lower part
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for (int j=1;j<=(2*(n-i));j++){
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    public  static void pattern9(int num){
        int k=0;
        int n=num;
        while(k<=10){
            System.out.print("--");
            k++;
        }
        System.out.println("Pattern 8");
        for (int i=1;i<n;i++){

            for (int j=1;j<n-i;j++){

            }
        }
    }
    public static void main(String[] args) {

        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5(6);
        pattern6(4);
        pattern7(4);
        pattern8(4);
        pattern9(4);
    }
}
