package data_structures.tree;


import data_structures.trees.binary_search_tree.BinaryTree.TopViewOfBST;

import java.util.Objects;

/**
 * @author Sahil on 04/10/2024
 */
public class BinarySearchTree {
private static Node rootNode;


    public void insert(int value){
        Node newNode= new Node(value);
        if (Objects.isNull(rootNode)){
            rootNode= newNode;
            return;
        }
        Node currentNode=rootNode;
        while(true){
            //left
            if(value<currentNode.data){
                if(currentNode.left==null) {
                    currentNode.left = newNode;
                    return;
                }
                currentNode=currentNode.left;
            }else{
                //right
                if (currentNode.right==null){
                    currentNode.right=newNode;
                    return;
                }
                currentNode=currentNode.right;
            }
        }
    }
    public Node lookup(int value){
        Node currentNode=rootNode;
        while(true ){
            if (Objects.isNull(currentNode)){
                return null;
            }
             else if (value<currentNode.data){
                currentNode=currentNode.left;
            }else if (value>currentNode.data){
                    currentNode=currentNode.right;
                }
                else{
                    return currentNode;
                }
        }
    }

    public void insertUsingRecursion(int value){
        if (Objects.isNull(rootNode)){
            rootNode= new Node(value);;
            return;
        }
        Node newNode= new Node(value);
        Node currentNode=rootNode;
        insertUsingRecursion(currentNode,value,newNode);
    }

    private void insertUsingRecursion(Node currentNode,int value,Node newNode){
      if(currentNode==null) {
          return;
      }
            if(value<currentNode.data){
                if(currentNode.left==null){
                    currentNode.left=newNode;
                    return;
                }
                insertUsingRecursion(currentNode.left,value,newNode);
            }else {
                if(currentNode.right==null){
                    currentNode.right=newNode;
                    return;
                }
                insertUsingRecursion(currentNode.right,value,newNode);
            }
    }

//we need to check 3 cases
    /*
    * 1: node has no child
    * 2: node has one child
    * 3: node has two child
    *
    * */
    public Node deleteNode(Node rootNode,int val){   //val =66   , root=66
     if(rootNode==null){
         return null;
     }
     if(val<rootNode.data){ //here we are checking if current val is less than node value
         rootNode.left=deleteNode(rootNode.left,val);
     }else if(val>rootNode.data){ //same for the right node
         rootNode.right=deleteNode(rootNode.right,val);
     }else{//here when we found value equal to node val then this else block run
         if (rootNode.left==null||rootNode.right==null){ // checking 0: no child and 1: prop (1 child)
             Node temp=rootNode.left==null?rootNode.right:rootNode.left; //checking if one child
             if(temp==null){
                 return null;
             }
             else{
                 return temp;
             }
         }else{ //this else block run when node has two child
             Node minNode=finfMinNode(rootNode.right);  // finding left most node
             rootNode.data=minNode.data; //assign data to current node
             rootNode.right=deleteNode(rootNode.right, minNode.data);// deleting node
         }
     }
     return rootNode;
    }
    private Node finfMinNode(Node currentNode){
        if (currentNode==null){
            return currentNode;
        }
        while (currentNode.left!=null){
            currentNode=currentNode.left;
            }
        return currentNode;
    }

    public void printNodes(){
        System.out.println(rootNode);
    }

    public boolean InOrder(Node root,int value){
        if(root.left!=null){
            InOrder(root.left,value);
        }
        if(root.data>value){
            value=root.data;
        }else{
            return false;
        }
        System.out.println(value);
        if(root.right!=null){
            InOrder(root.right,value);
        }
        return true;
    }
    int sum=0;
    boolean isSumTree(Node root) {
        int rootData=root.data;

        helper(root);
        return sum - rootData == rootData;
    }

    void helper(Node node){
        if(node==null){
            return;
        }
        helper(node.left);
        sum=sum+node.data;
        helper(node.right);
    }
    public static void main(String[] args) {

        BinarySearchTree bst= new BinarySearchTree();
//        bst.insertUsingRecursion(29);
//        bst.insertUsingRecursion(119);
//        bst.insertUsingRecursion(30);
//        bst.insertUsingRecursion(28);
//        bst.insertUsingRecursion(14);
//        bst.insertUsingRecursion(7);
        bst.insert(3);
        bst.insert(1);
        bst.insert(2);
//        bst.insert(11);
        bst.printNodes();
        System.out.println(bst.isSumTree(rootNode));
        new TopViewOfBST().topViewOfBinarySearchTree(rootNode);
//        LeftViewOfBinaryTree.leftView(rootNode);
//        System.out.println("\n");
//        rootNode=bst.deleteNode(rootNode,13);
//        bst.printNodes();
//        new ValidateBST().helper(rootNode,null,null);
//        bst.printNodes();

    }


}
