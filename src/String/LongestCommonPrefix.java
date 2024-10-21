package String;

import java.util.Arrays;

/**
 * @author Sahil on 19/10/2024
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb =new StringBuilder();
        Arrays.sort(strs);
        String one=strs[0];
        for(int i=0;i<one.length();i++){
            if(one.charAt(i)!=strs[strs.length-1].charAt(i)){
                break;
            }
            sb.append(one.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs= {"ab", "a"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }
}
