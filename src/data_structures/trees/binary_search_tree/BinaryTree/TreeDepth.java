package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 11/06/2024
 */
public class TreeDepth {

    public static int nodeDepth(Node node){
        int counter=0;
//        return getDepth(node,counter,0);
        return getTreeDepth(node,0);
    }

    public static int getTreeDepth(Node node,int total){
        if (node==null){
            return total;
        }
        int deptL= getTreeDepth(node.left,total+1);
        int depthR=getTreeDepth(node.right,total+1);
        return deptL>depthR?deptL:depthR;
    }
}
