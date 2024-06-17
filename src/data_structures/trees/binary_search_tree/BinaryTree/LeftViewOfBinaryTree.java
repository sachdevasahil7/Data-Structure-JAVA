package data_structures.trees.binary_search_tree.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Sahil on 13/06/2024
 */
public class LeftViewOfBinaryTree {

    public static void leftView(Node node){
        ArrayList<Integer>list= new ArrayList<>();
        int level=0;
        helper(node,level,list);
        System.out.println("level:::"+level);
        for (Integer num:list){
            System.out.print("-->"+num);
        }
    }

//todo debug and understand logic
    public static void helper(Node node,int level,ArrayList<Integer>list){
        if (node==null){
            return;
        }
        if (list.size()==level){
            list.add(node.data);
        }
        helper(node.left,level+1,list);
        helper(node.right,level+1,list);
    }
}
