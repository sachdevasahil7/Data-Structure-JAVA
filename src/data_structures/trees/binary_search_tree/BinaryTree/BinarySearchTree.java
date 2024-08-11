package data_structures.trees.binary_search_tree.BinaryTree;

import static data_structures.trees.binary_search_tree.BinaryTree.BinaryTreeDiameter.treeDiameter;
import static data_structures.trees.binary_search_tree.BinaryTree.EvaluateExpressionTree.calculateExpression;
import static data_structures.trees.binary_search_tree.BinaryTree.EvaluateExpressionTree.evaluateExpressionTree;
import static data_structures.trees.binary_search_tree.BinaryTree.PrintBST.printTree;
import static data_structures.trees.binary_search_tree.BinaryTree.TreeDepth.nodeDepth;

/**
 * @author Sahil on 01/06/2024
 */
public class BinarySearchTree {



    /*
    *  inOrder traverse means it traverse on
    * left node
    * then root node
    * then right node
    * */
    public void inOrderTraverse(Node root){
        if (root==null){
            return;
        }
        inOrderTraverse(root.left); //traverse to left most node
        System.out.println(root.data+"  "); //print data
        inOrderTraverse(root.right); // then traverse to right most node
    }
    public boolean binarySearch(Node root, int value){
        if (root==null){
            return false;
        }
        if (value<root.data){//if value is less than data then it find in left node
            return binarySearch(root.left,value);
        }
        else if (root.data == value) {
            return true;
        }
        else{ //else part is to search in right node
            return binarySearch(root.right,value);
        }
    }

    /*
    * To delete node there are total 3 cases
    * 1: only parent no left and right node .. then delete parent only
    * 2: only one child node if left node null then return right node and if right null then return left
    * 3: two nodes are there then use inOrder successor
    * */

    public Node deleteNode(Node node,int value){
       if (value<node.data){
           node.left=deleteNode(node.left,value);
       }
       else if (value>node.data){
           node.right=deleteNode(node.right,value);
       }
       else{// case 1 node.data==value
           if (node.left==null&&node.right==null){
               return null;
           }
            //case 2
           if (node.left==null){
               return node.right;
           }
           else if (node.right==null){
               return node.left;
           }
           //case 3
           Node inOrderSuccessor=inOrderSuccessor(node.right);
           node.data=inOrderSuccessor.data;
           node=deleteNode(node.right,inOrderSuccessor.data);
       }
       return node;
    }

    public Node insertAsBST(Node root, int value){
        if(root==null){
            root= new Node(value);
            return root;
        }
        if (root.data>value){
            root.left= insertAsBST(root.left,value);
        }
        else{
            root.right= insertAsBST(root.right,value);
        }
        return root;
    }
    public Node insertAsTree(Node root, int value){
        if(root==null){
            root= new Node(value);
            return root;
        }
        if (value< root.data) {
            root.left = insertAsBST(root.left, value);
        }
        else if(value> root.data) {
            root.right = insertAsBST(root.right, value);
        }
        return root;
    }

    public Node inOrderSuccessor(Node node){
        while (node.left!=null){
            node=inOrderSuccessor(node.left);
        }
    return node;
    }


    public static void main(String[] args) {

//        int values[]={10,15,22,13,14,5,2,1};
//        int values[]={7,4,9,10,6};
        int values[]={50,20,80,15,8,16,21,90,75};
//        int values[]={1,2,5,7,10,13,14,15,20};
//        int values[]={3,5,4};
//        int values[]={1,2,3,4,5,6,7,8,9,10};
//        int values[]={100,502,55000,1001,4500,204,205,207,208,206,203,5,15,22,57,60,5,2,3,1,1,1,1,1,-51,-403};
        BinarySearchTree bst=new BinarySearchTree();
        Node root= null;
        for(int value:values) {
            root=bst.insertAsTree(root,value);
        }
        printTree(root);
        System.out.println(treeDiameter(root));
//        System.out.println(new AllKindOfNodeDepths().allKindOfNodeDepth(root,0));
//        new CheckSameLevel().checkSameLevel(root);
//        printTree(root);

//        new MinHeightTree().minHeight(values);
//        ZigZagTraversal(root);
//        leftView(root);
//        System.out.println(new CheckSameLevel().checkSameLevel(root));
//        printTree(root);
//        System.out.println(nodeDepth(root));

    }
}
