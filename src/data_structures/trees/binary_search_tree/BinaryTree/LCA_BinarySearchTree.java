package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 14/10/2024
 */
public class LCA_BinarySearchTree {
    Node LCA(Node root, int n1, int n2)
    {
        if(root==null){
            return root;
        }
        if(root.data<n1&&root.data<n2){
            return LCA(root.right,n1,n2);
        }
        if(root.data>n1&&root.data>n2){
            return LCA(root.left,n1,n2);
        }
        return root;

    }

}
