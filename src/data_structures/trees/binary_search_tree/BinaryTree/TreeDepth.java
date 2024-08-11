package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 11/06/2024
 */
public class TreeDepth {
    static int counter;
    public static int nodeDepth(Node node){
            counter=0;
//        return getDepth(node,counter,0);
        getSumTreeDepth(node,0);
        return counter;
    }

    public static int getTreeDepth(Node node,int total){
        if (node==null){
            return total;
        }
        int deptL= getTreeDepth(node.left,total+1);
        int depthR=getTreeDepth(node.right,total+1);
        return deptL>depthR?deptL:depthR;
    }
    public static void getSumTreeDepth(Node node,int total){
        counter+=total;
        if(node.left!=null){
            System.out.print(" left -->"+node.left.data+"_"+total+"--");
            System.out.println();
            getSumTreeDepth(node.left,total+1);
        }
        if(node.right!=null){
            System.out.print("right --->"+node.right.data+"_"+total+"--");
            System.out.println();
            getSumTreeDepth(node.right,total+1);

        }
    }
}
