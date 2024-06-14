package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 12/06/2024
 */
public class BinaryTreeDiameter {


    public static int treeDiameter(Node node){
        int max=0;
        if (node==null){
            return max;
        }
        treeDiameter(node.left);
        treeDiameter(node.right);
        if (node.left!=null&node.right!=null){
            int num=calculateSubtree(node,0);
            if (max<num){
                max=num;
            }
        }
        return max;
    }
    public static int calculateSubtree(Node node,int length){
        if (node==null){
            return length;
        }
        int leftLen=calculateSubtree(node.left,length+1);
        int rightLe=calculateSubtree(node.right,length+1);
        return leftLen>rightLe?leftLen:rightLe;
    }
}
