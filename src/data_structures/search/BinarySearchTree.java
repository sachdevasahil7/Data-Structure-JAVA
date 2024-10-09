package data_structures.search;

import java.util.Objects;

/**
 * @author Sahil on 04/10/2024
 */

class Node{
  public Node left;
  public Node right;
  public int data;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    @Override
    public String toString() {
        return "{" +
                "\"left\":" + left +
                ", \"right\":" + right +
                ", \"value\":" + data +
                "}";
    }
}


public class BinarySearchTree {
    private static Node rootNode=null;

    public void insert(int value){
        if (Objects.isNull(rootNode)){
            rootNode= new Node(value);;
            return;
        }
        Node newNode= new Node(value);
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
//we need to check 3 cases
    /*
    * 1: node has no child
    * 2: node has one child;
    * 3: node has two child
    *
    *
    *
    * */
    public Node deleteNode(Node currentNode,int val){
     if(currentNode==null){
         return null;
     }
     if(val<currentNode.data){ //here we are checking if current val is less than node value
         currentNode.left=deleteNode(currentNode.left,val);
     }else if(val>currentNode.data){ //same for the right node
         currentNode.right=deleteNode(currentNode.right,val);
     }else{//here when we found value equal to node val then this else block run
         if (currentNode.left==null||currentNode.right==null){ // checking 1: prop (no child)
             Node temp=currentNode.left==null?currentNode.right:currentNode.left; //checking if one child
             if(temp==null){ //if no child then return null
                 return null;
             }else{
                 return temp; //if one child then return make that child to parent node
             }
         }else{ //this else block run when node has two child
             Node minNode=finfMinNode(currentNode.right);  // finding left most node
             currentNode.data=minNode.data; //assign data to current node
             currentNode.right=deleteNode(currentNode.right, minNode.data);// deleting node
         }
     }
     return currentNode;
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


    public static void main(String[] args) {

        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(9);
        bst.insert(119);
        bst.insert(8);
        bst.insert(4);
        bst.insert(1);
        bst.insert(7);
        bst.insert(7);
        bst.insert(13);
        bst.insert(11);
        bst.printNodes();
        System.out.println("\n");
        rootNode=bst.deleteNode(rootNode,4);
        bst.printNodes();

    }


}
