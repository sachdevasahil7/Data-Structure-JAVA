package data_structures.trees.binary_search_tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Sahil on 13/06/2024
 */
public class LevelOrderTraversal {


    public static void levelOrderTraversal(Node node){
        if (node==null){
            return;
        }
        List<Node> nodeList= new ArrayList<>();
        Queue<Node> queue= new LinkedList();
        queue.add(node);
        while(!queue.isEmpty()) {
            Node current = queue.poll();
            if (current != null) {
                nodeList.add(current);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
                queue.add(null);
                if (queue.isEmpty()) {
                    break;
                }
            }
            }
        for (Node n:nodeList){
            if (n==null){
                System.out.println("");
            }else {
                System.out.print("--->" + n.data);
            }
        }
    }
}
