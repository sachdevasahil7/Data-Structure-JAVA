package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 11/06/2024
 */
public class SubTreeClosetValue {
    public int  SubTreeClosetValue(Node node, int value) {
        int closetValue=Integer.MIN_VALUE;
        return inOrderSuccessor(node,value,closetValue);
    }
    public int inOrderSuccessor(Node node,int value,int closetValue){
        if (node==null){
            return closetValue;
        }
        //check the difference between closet value and current value
        if (Math.abs(value-closetValue) > Math.abs(value-node.data)) {
            closetValue = node.data;
        }
        if (value < node.data) {
            return inOrderSuccessor(node.left, value,closetValue);
        } else if (value > node.data) {
            return inOrderSuccessor(node.right, value,closetValue);
        }
        else if(node.data==value) {
            return node.data;
        }

        return closetValue;
    }

}
