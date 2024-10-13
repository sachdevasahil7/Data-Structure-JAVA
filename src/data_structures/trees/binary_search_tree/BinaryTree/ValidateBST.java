package data_structures.trees.binary_search_tree.BinaryTree;

import data_structures.search.Node;

/**
 * @author Sahil on 12/06/2024
 */
public class ValidateBST {
    public boolean helper(Node root, Integer lower, Integer upper){
        if(root==null){
            return true;
        }
        if (lower != null && root.data <= lower) {
            return false;
        }
        if (upper != null && root.data >= upper) {
            return false;
        }
        if(!helper(root.left,lower,root.data)){
            return false;
        }
        if(!helper(root.right,root.data,upper)){
            return false;
        }
        return true;
    }

}
