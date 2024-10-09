package data_structures.misc;


import java.util.Objects;

/**
 * @author Sahil on 08/10/2024
 */

class Node{

    private Node left;
    private Node right;
    private int value;

    public Node(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }

    @Override
    public String toString() {
        return "{" +
                "left:" + left +
                ", right:" + right +
                ", value:" + value +
                '}';
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class BST {
    private Node root=null;

    public void insert(int value){
        if(Objects.isNull(root)){
            root= new Node(value);
            return;
        }
        Node newNode=new Node(value);
        Node currentNode=this.root;
        while(true){
            if(value<currentNode.getValue()){
                if(currentNode.getLeft()==null){// check if the left node is null
                    currentNode.setLeft(newNode); //if it is null then insert data into left node
                    return;
                }
                currentNode=currentNode.getLeft();
            }else {
                    if(currentNode.getRight()==null){
                        currentNode.setRight(newNode);
                        return;
                    }
                currentNode=currentNode.getRight();
            }
        }
    }
    public Node lookUp(int value){
        Node currentNode= root;
        while (true){
            if (currentNode==null){
                return null;
            }
            else if (value==currentNode.getValue()){
                return currentNode;
            }else if(value<currentNode.getValue()){
                currentNode=currentNode.getLeft();
            }else{
                currentNode=currentNode.getRight();
            }
        }
    }



    public void print(){
        System.out.println(root);
    }



    public static void main(String[] args) {

        BST bst= new BST();
        bst.insert(100);
        bst.insert(70);
        bst.insert(110);
        bst.insert(10);
        bst.insert(40);
        bst.insert(400);
        bst.insert(500);
//        bst.print();

        System.out.println(bst.lookUp(1100));


    }


}
