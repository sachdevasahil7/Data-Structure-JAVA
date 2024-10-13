package data_structures.search;

/**
 * @author Sahil on 11/10/2024
 */
public class Node{
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