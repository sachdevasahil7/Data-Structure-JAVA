package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 16/06/2024
 */
public class AllKindOfNodeDepths {

    int sum=0;
//todo not done yet
    public int allKindOfNodeDepth(Node node,int level){
        if (node==null){
            return level;
        }
        level=level+1;
        sum=sum+1;
        System.out.println(node.data+" total sum "+sum);
        int deptL =allKindOfNodeDepth(node.left,level);
       int depthR=allKindOfNodeDepth(node.right,level);
        return  deptL>depthR?deptL:depthR;
    }

}
