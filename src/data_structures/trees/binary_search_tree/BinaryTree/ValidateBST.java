package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 12/06/2024
 */
public class ValidateBST {
     static boolean flag=true;
    public static boolean validateBST(Node node){
        if (node==null){
            return flag;
        }
        validateBST(node.left);
        if (node.left!=null) {
            if (node.data < node.left.data) {
                flag = false;
                return flag;
            }
        }
        if (node.right!=null){
            if (node.data>node.right.data){
                flag=false;
                return flag;
            }
        }
        validateBST(node.right);
        return flag;
    }
}
