package String;

import java.util.LinkedList;

/**
 * @author Sahil on 22/07/2024
 */
public class ReverseString {

    public static void main(String[] args) {

        StringBuilder reverseString= new StringBuilder("helloworld");
        int left=0;
        int right=reverseString.length()-1;
        while (left<right){
            char dummyChar=reverseString.charAt(right);
            reverseString.setCharAt(right,reverseString.charAt(left));
            reverseString.setCharAt(left,dummyChar);
            left++;
            right--;
        }
        System.out.println(reverseString);
    }


}
