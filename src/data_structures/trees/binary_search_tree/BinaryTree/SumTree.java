package data_structures.trees.binary_search_tree.BinaryTree;

import java.util.ArrayList;

/**
 * @author Sahil on 12/10/2024
 */
public class SumTree {
    int sum=0;
    boolean isSumTree(Node root) {
        if(root==null||isLeafNode(root)){
            return true;
        }
        int leftSum=sumSubTree(root.left);
        int rightSum=sumSubTree(root.right);

        if(root.data==leftSum+rightSum
                &&isSumTree(root.left)
                &&isSumTree(root.right)){
            return true;
        }
        return false;
    }
    boolean isLeafNode(Node node){
        return node.left==null&&node.right==null;
    }
    int sumSubTree(Node node){
        if(node==null){
            return 0;
        }
        return node.data+sumSubTree(node.left)+sumSubTree(node.right);
    }
}
