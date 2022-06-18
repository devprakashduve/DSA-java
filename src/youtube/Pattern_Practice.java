package youtube;

/* Note: for the pattern problems we should follow 3 steps
Matrix
     col1 col2 col3
row1   *    *    *
row2   *    *    *
row3   *    *    *


* 1: number of lines = number of row => number of times outer loop will run
* 2: identify relation between row & column
* 3: identify what need to print
* */
public class Pattern_Practice {
    public static void main(String[] args) {
/*
 print this pattern
 *  *  *  *
 *  *  *  *
 *  *  *  *
 *  *  *  *

  */
//        pattern1(4);

        /*
print this pattern
         *
         **
         ***
         ****
         *****

         */
//        patter2(4);
/*
print this
 *****
 ****
 ***
 **
 *


 */
//        pattern3(5);
        /*

         *
         *  *
         *  *  *
         *  *  *  *
         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *

         */
//    pattern4(5);
/*print this pattern in reverse
 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  *
 *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *

 * */
//        pattern5(8);

        /*
print this pattern in reverse
         *  *  *  *  *  *  *  *
         *  *  *  *  *  *  *
         *  *  *  *  *  *
         *  *  *  *  *
         *  *  *  *
         *  *  *
         *  *
         *


         * */
//        pattern6(8);

        /* print tree

 -  -  -  -  -  -  -  -  *
 -  -  -  -  -  -  -  *  *  *
 -  -  -  -  -  -  *  *  *  *  *
 -  -  -  -  -  *  *  *  *  *  *  *
 -  -  -  -  *  *  *  *  *  *  *  *  *
 -  -  -  *  *  *  *  *  *  *  *  *  *  *
 -  -  *  *  *  *  *  *  *  *  *  *  *  *  *
 -  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
 -  -  -  -  -  -  *  *  *  *  *
 -  -  -  -  -  -  *  *  *  *  *
 -  -  -  -  -  -  *  *  *  *  *
 -  -  -  -  -  -  *  *  *  *  *
 -  -  -  -  -  -  *  *  *  *  *
 -  -  -  -  -  -  *  *  *  *  *
 -  -  -  -  -  -  *  *  *  *  *
 -  -  -  -  -  -  *  *  *  *  *
 -  -  -  -  -  -  *  *  *  *  *



         * */
//        pattern7(9);

        /*
        print this

 *  -  -  -  -  -  -  -  -  *
 *  *  -  -  -  -  -  -  *  *
 *  -  *  -  -  -  -  *  -  *
 *  -  -  *  -  -  *  -  -  *
 *  -  -  -  *  *  -  -  -  *
 *  -  -  -  *  *  -  -  -  *
 *  -  -  *  -  -  *  -  -  *
 *  -  *  -  -  -  -  *  -  *
 *  *  -  -  -  -  -  -  *  *
 *  -  -  -  -  -  -  -  -  *






        * */
        pattern8(3);
    }
    static void pattern8(int val){
  for (int row=0;row<=val;row++){
      System.out.print(" * ");
      for (int col=0;col<=row;col++){
          if (col!=0 && col==row){
              System.out.print(" * ");
          }else { if (col!=0 ) {
              System.out.print("   ");
          }
          }

      }
      for (int col=val;col>row;col--){
              System.out.print("   ");
      }
      for (int col=val;col>row;col--){

          System.out.print("   ");
      }
      for (int col=row;col>=0;col--){
          if (col==row){
              System.out.print(" * ");
          }else { if (col!=0 ) {
              System.out.print("   ");
          }else {
              System.out.print(" * ");
          }
          }
      }

      System.out.println();
  }
        for (int row=0;row<=val;row++){
            System.out.print(" * ");
            for (int col=val-1;col>row;col--){
                System.out.print("   ");
            }
            for (int col=row;col>=0;col--){
                if (col==row && row!=val){
                    System.out.print(" * ");
                }else {
                    if (col==row ) {
                        System.out.print("");
                    }
                    else{
                        System.out.print("   ");
                    }


                }
            }
            for (int col=0;col<row;col++){

                System.out.print("   ");
            }

            for (int col=0;col<=row;col++){
                if (col==row){
                    System.out.print(" * ");
                }

            }
            for (int col=val-1;col>=row;col--){
                if (col==row){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }

            System.out.println();




        }

    }
    static void pattern7(int val){
        for(int row=1;row<val;row++){
            for(int col=row;col<val;col++){
                System.out.print(" - ");
            }
            for(int col=0;col<row;col++){
                System.out.print(" * ");
            }
            for(int col=1;col<row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int row=0;row<val;row++){
            for(int col=-3;col<=val/4;col++){
                System.out.print(" - ");
            }
            for(int col=0;col<=val/2;col++){
                System.out.print(" * ");
            }

            System.out.println();
        }

    }
    static void pattern6(int val){
    for (int row=val;row>0;row--){
    for (int col=0;col<val-row;col++){
        System.out.print("   ");
    }
    for (int col=0;col<row;col++){
        System.out.print(" * ");
    }

    System.out.println();
}
    }
    static void pattern5(int val){
        for(int row=val;row>=1;row--){
            int col=0;
            for(col=1;col<row;col++){
                    System.out.print("   ");
            }
            for(col=0;col<=val-row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern4(int val){
        for (int row=0;row<=val;row++){
          for (int col=0;col<row;col++){
              System.out.print(" * ");
          }
            System.out.println();
        }
        for (int row=val-2;row>=0;row--){
            for (int col=row;col>=0;col--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern3(int val){
for(int row=val;row>0;row--){
    for(int col=row;col>0;col--){
        System.out.print(" * ");
    }
    System.out.println();
}
    }
    static void patter2(int val){
        for(int row=0;row<val;row++){
            for(int col=0;col<=row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern1(int val){
      //step1 : how many times outer loop will work => here it will be equal to val parameter
        for (int row=0;row<val;row++){
            // identify relation between out loop and inner loop: row & column=> here we are going to print
            // Square matrix so row & col both will be Equal to val parameter
            for (int col=0;col<val;col++){
                // what need to print row => we want to print * so
                System.out.print(" * ");
            }
            // when row is printed go to next line
            System.out.println();
        }

    }
}
