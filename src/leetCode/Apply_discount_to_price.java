package leetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Apply_discount_to_price {
    public static void main(String[] args) {
        /*String sentence="$2$3 $10 $100 $1 200 $33 33$ $$ $99 $99999 $9999999999";
       int discount=0;
        discountPrices(sentence, discount);*/
        int[] nums={5,3,4,4,7,3,6,11,8,5,11};//{10,6,5,10,15}; //
        totalSteps(nums);
    }

static int removeElement(ArrayList<Integer> arr,int stop, int count){
    if (stop==1){
        return count;
    }
    System.out.println(arr);
    stop=1;
    int i=1;

    i=1;

    while (i<arr.size()-1){

        if (arr.get(i - 1) > arr.get(i)) {
            //  System.out.println(arr.get(i));
            if (arr.get(i) == arr.get(i+1)) {
                //  System.out.println(arr.get(i));
                arr.remove(i+1);
            }
                arr.remove(i);

            stop=0;

        }
        else if (arr.get(i - 1) > arr.get(i) && arr.get(i)<=arr.get(i+1)) {
            arr.remove(i+1);
            arr.remove(i);
        }

        i++;
    }
   count++;


    return removeElement(arr, stop, count);


//        return res;
}
    static int totalSteps(int[] nums) {


        List<Integer> arr = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int i=1;
        int stop=0;
        int j=0;
        if (nums.length<=1){
            return 0;
        }
 int res=  removeElement((ArrayList<Integer>) arr,0,0);

        System.out.println(res);

        return res;

    }
    static String discountPrices(String sentence, int discount) {
        String res="";

        String seprateWords[]=sentence.split(" ");
        int i=0;
        while(i<seprateWords.length){

            if (seprateWords[i].matches("[$]?.[0-9]+") && seprateWords[i].matches("[a-z]?.[$]?")==false) {
                String specialCharacters = seprateWords[i];
                if (specialCharacters.contains("$")) {


//                System.out.println(seprateWords[i]);
                    String filterNiums = seprateWords[i].replace("$", "");
                    double num = Long.parseLong(filterNiums);
                    double rrs = (num * discount) / 100.0f;
                    rrs = num - rrs;
                    // System.out.println(num-rrs);
//                (1*(50.0f/100.0f));
                    res += "$" + String.format("%.02f", rrs) + " ";
                } else {
                    res += seprateWords[i] + " ";
                } } else {
                    res += seprateWords[i] + " ";
                }

            i++;
        }
            System.out.println(res);

        return res.trim();

    }
}
