package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 11/06/2024
 */
public class InvertBinaryTree {


    public static Node invertTree(Node node){
        if (node==null){
            return null;
        }
        Node left=invertTree(node.left);
        Node right=invertTree(node.right);
        System.out.print("-->"+node.data);
        node.left=right;
        node.right=left;
        return node;
    }
}
