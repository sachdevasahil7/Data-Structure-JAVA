package data_structures.trees.binary_search_tree.BinaryTree;

/**
 * @author Sahil on 14/10/2024
 */
public class LCA_BinaryTree {
        //Function to return the lowest common ancestor in a Binary Tree.
        Node lca(Node root, int n1,int n2)
        {
            if(root==null){
                return root;
            }
            if(root.data==n1||root.data==n2){
                return root;
            }
            Node left=lca(root.left,n1,n2);
            Node right=lca(root.right,n1,n2);
            if(left!=null && right!=null){
                return root;
            }else if(left!=null & right==null){
                return left;
            }else {
                return right;
            }
        }
}
