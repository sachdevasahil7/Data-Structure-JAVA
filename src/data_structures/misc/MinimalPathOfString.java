package data_structures.misc;

/**
 * @author Sahil on 28/05/2024
 */
public class MinimalPathOfString {

    public static void main(String[] args) {
        System.out.println(minimalPath("adb","dba"));
    }

public static int minimalPath(String a , String b){

    char[] a_arr=a.toCharArray();
    char[] b_arr=b.toCharArray();
    int move=0;
    for (int i=0;i<a_arr.length;i++){
        for ( int j=i;j<b_arr.length;j++){
            if (a_arr[a_arr.length-1]==b_arr[b_arr.length-1]){
                break;
            }
            if (a_arr[i]==b_arr[j]){
                move+=1;
                swap(b_arr,i,j);
                break;
            }
        }
    }
    return move;
}
public static void swap(char[] b_arr,int a_index,int b_index){
        char temp=b_arr[a_index];
        b_arr[a_index]=b_arr[b_index];
        b_arr[b_index]=temp;
}

}
