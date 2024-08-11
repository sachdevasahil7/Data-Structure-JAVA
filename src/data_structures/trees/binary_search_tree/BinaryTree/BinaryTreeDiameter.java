package data_structures.trees.binary_search_tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Sahil on 12/06/2024
 */
public class BinaryTreeDiameter {
   static int max=0;
    public static int treeDiameter(Node node){
        if (node==null){
            return 0;
        }
        int left=treeDiameter(node.left);
        int right=treeDiameter(node.right);
        if(max<(left+right)){
            max=left+right;
        }
        List lis= new ArrayList();
        return left>right?left+1:right+1;
    }
}
