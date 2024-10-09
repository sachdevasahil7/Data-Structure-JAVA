package leetCode_problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sahil on 16/09/2024
 */
public class ProblemNo150 {
    public static void main(String[] args) {
        System.out.println(new ProblemNo150().romanToInt("III"));
    }
    public int romanToInt(String s) {
        int count=0;


        String[] sp= s.split(" ");
        Map<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1&&map.get(arr[i])<map.get(arr[i+1])){
                count-=map.get(arr[i]);
            }else{
                count+=map.get(arr[i]);
            }
        }
        return count;
    }
}
