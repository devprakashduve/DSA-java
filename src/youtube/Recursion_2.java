package youtube;

import java.util.Stack;

public class Recursion_2 {
// function call itself known as recursion

    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int res=factorial(n);
//        System.out.println(res);

        /*int a=0,b=1;
        System.out.print(a+" "+ b+" ");
        fibonacci_nth(a,b,n);*/
String S="(";
        boolean res= isValid(S);
        System.out.println(res);
//       int x= aryIndex(new String[]{"(", ")", "{", "}"}, "}");

    }

    public static int aryIndex(String[] arr, String element){

        int res=0;
        for(int i=0;i< arr.length;i++){

            if (arr[i].equals(element)){
                res=i;
                break;
            }
        }
        return res;
    }
    public static boolean isValid(String s) {
        char[] ch=s.toCharArray();

        Stack<Character> stk=new Stack<>();
        for (int i=0;i<s.length();i++){

            if(ch[i]=='('|| ch[i]=='{'|| ch[i]=='['){
                stk.push(ch[i]);
            }else if(!stk.isEmpty()){
                if ((ch[i]==')' && stk.peek()=='(') ||(ch[i]=='}' && stk.peek()=='{')|| (ch[i]==']' && stk.peek()=='[')){
                    stk.pop();
                }
                else{
                    return  false;

                }
            }
                else {
                    return false;
                }
            }

if (stk.isEmpty()){
    return true;
}
return true;
    }

    /*find fibonacci n element*/
    public static void fibonacci_nth(int A,int B, int n){
//       with normal process
        /* int res=0;
        int temp1=0,temp2=0;
        for (int i=1;i<=n;i++){
            if (i==1){
                temp2=i;
            }
            else{
                temp1=temp1+temp2;
                temp2=temp1+temp2;
            }
            System.out.print(temp1+" ");
            System.out.print(temp2+" ");
        }*/
//        with recursion
//        int temp1=A,temp2=B;
        if (n==0){
            return ;
        }
        int c=A+B;
        System.out.print(c+" ");
        fibonacci_nth(B,c,n-1);
    }

    public static int factorial(int n){
        if (n==1 || n==1){
            return 1;
        }
        int fact1= factorial(n-1);
        int fact_return=n*fact1;
        return fact_return;
    }
}
