package data_structures.trees.binary_search_tree.BinaryTree;

import java.util.ArrayList;

/**
 * @author Sahil on 12/10/2024
 */
public class KthSmallestInBST {
    ArrayList<Integer> list= new ArrayList<Integer>();
    public int kthSmallest(Node root, int k) {
        helper(root);
        return list.get(k-1);
    }
    public void helper(Node node){
        if(node==null){
            return;
        }
        helper(node.left);
        list.add(node.data);
        helper(node.right);
    }
}
