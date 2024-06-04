package data_structures.trees.binary_search_tree.BinaryTree;

import sun.security.rsa.RSAUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sahil on 01/06/2024
 */
public class BinarySearchTree {


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

    public int inOrderSuccessor(Node node,int value,int closetValue){
        if (node==null){
            return closetValue;
        }
        //check the difference between closet value and current value
        if (Math.abs(value-closetValue) > Math.abs(value-node.data)) {
            closetValue = node.data;
        }
            while (node!=null) {
            if (value < node.data) {
                return inOrderSuccessor(node.left, value,closetValue);
            } else if (value > node.data) {
                return inOrderSuccessor(node.right, value,closetValue);
            }
            else if(node.data==value) {
                    return node.data;
            }
        }
        return closetValue;
    }
/*
* to find the closet node value to target
*
* */
    public int  SubTreeClosetValue(Node node, int value) {
       int closetValue=Integer.MIN_VALUE;
        return inOrderSuccessor(node,value,closetValue);
    }


    /*
    * binary tree
    * branch sum problem
    *
    * */
    public static void branchSum(Node root,Integer runningSums,List<Integer>sums){
        if(root==null){
            return;
        }
        runningSums=runningSums+ root.data;
        if (root.left==null&&root.right==null){
            sums.add(runningSums);
            return;
        }
        branchSum(root.left,runningSums,sums);
        branchSum(root.right,runningSums,sums);
    }

    public static int nodeDepth(Node node){
        int counter=0;
        return getDepth(node,counter,0);
    }
    public static int getDepth(Node node,int counter,int total){
        if (node.left==null&&node.right==null){
            return total;
        }
        counter++;
        if (node.left!=null){
            total=getDepth(node.left,counter,total+counter);
        }
        if (node.right!=null){
            total=getDepth(node.right,counter,total+counter);
        }
        return total;
    }


    public static void main(String[] args) {

//        int values[]={10,15,22,13,14,5,5,2,1};
        int values[]={5,1,3,4,2,7,9,8};
//        int values[]={1,2,3,4,5,6,7,8,9,10};
//        int values[]={100,502,55000,1001,4500,204,205,207,208,206,203,5,15,22,57,60,5,2,3,1,1,1,1,1,-51,-403};
        BinarySearchTree bst=new BinarySearchTree();
        Node root= null;
        for(int value:values) {
            root=bst.insertAsTree(root,value);
        }
        List<Integer>sums= new ArrayList<>();
//        bst.inOrderTraverse(root);
        System.out.println(bst.nodeDepth(root));
//        bst.branchSum(root,0,sums);
//        System.out.println(Arrays.toString(sums.toArray()));
//        System.out.println("\n\n");
//        System.out.println(bst.binarySearch(root,66));

//    bst.deleteNode(root,10);
//        System.out.println(bst.SubTreeClosetValue(root,-1));

    }

}
