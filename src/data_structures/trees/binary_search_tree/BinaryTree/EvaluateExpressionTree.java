package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 11/06/2024
 */
public class EvaluateExpressionTree {

public static int calculateExpression(Node node){
    if (node==null){
        return 0;
    }
    calculateExpression(node.left);
    calculateExpression(node.right);
    if (node.left!=null&&node.right!=null){
        if (node.data==-4){
            node.data=node.left.data*node.right.data;
        }
        else if (node.data==-2){
            node.data=node.left.data-node.right.data;
        }
       else if (node.data==-3){
           node.data=node.left.data/node.right.data;
        }
       else if(node.data==-1){
           node.data=node.left.data+node.right.data;
        }
    }
    return node.data;
}

    public static int evaluateExpressionTree(Node node) {
        if (node.left==null&&node.right==null){
            return node.data;
        }
        int left=evaluateExpressionTree(node.left);
        int right=evaluateExpressionTree(node.right);
        if (node.left!=null&&node.right!=null){
            if (node.data==-4){
                return left*right;
            }
            else if (node.data==-2){
                return left-right;
            }
            else if (node.data==-3){
                return left/right;
            }
            else if(node.data==-1){
                return left+right;
            }
        }
        return 0;
    }
}
