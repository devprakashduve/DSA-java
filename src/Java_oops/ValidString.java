package Java_oops;

import java.util.ArrayList;

public class ValidString {
    public static void main(String[] args) {
boolean res=isValid("{()}");
        System.out.println(res);
    }
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
    static boolean isValid(String s) {

        ArrayList<String> allOpen=new ArrayList<>();
        ArrayList<String> allClose=new ArrayList<>();
        allOpen.add("(");
        allOpen.add("{");
        allOpen.add("[");
        allClose.add(")");
        allClose.add("}");
        allClose.add("]");
        // String[] allOpen={"(","{","["};
        // String[] allClose={")","}","]"};
if (s.length()%2==1){
    return false;
}
        int i=0;
        while(i<s.length()){
            int  j=i;
            String s1="";
            String s2="";
            while(j<s.length()){
                char s11=s.charAt(j);
//                System.out.println(s1);
                int index=allOpen.indexOf(String.valueOf(s11));
//                System.out.println(index);
                if(index>=0){
//                    s1+=s.charAt(j);
//                    System.out.println(s1);
                    s2+=allClose.get(index);
                }else{
                    break;
                }
                j++;
            }
            String s3="";

            while(j<s.length()){
                char s12=s.charAt(j);
                int index2=allClose.indexOf(String.valueOf(s12));
                if(index2>=0){
                    s3=s.charAt(j)+s3;
                }else{
                    break;
                }
                j++;
            }
            int startingElem=s2.length()-s3.length();
//            System.out.println(startingElem);

            int x=startingElem-1;
            if (x>=0) {
                String s4="";
                String s5="";
                for (int start = 0, last=s.length()-1;start <=x ; start++,last--){
                    char s13=s.charAt(start);
                    int index3=allOpen.indexOf(String.valueOf(s13));
                    s4+=allClose.get(index3);

                    s5+=s.charAt(last);
                }
//                System.out.println(s4+"-"+s5);
                if (s4.equals(s5)){
//                    s2=charRemoveAt(s2,x);
//                    break;

                }else {
                    return false;
                }


            }


            if (x>=0) {
                s2=charRemoveAt(s2,x);
//                System.out.print(s2+"=>"+s3);
                if(s2.equals(s3)){
                    //return true;
                }else {
                    return false;
                }
                    break;
            }
            if(s2.equals(s3)){
                //return true;
            }else {
                return false;
            }
            i=j;
        }
        return true;

    }
}
