package data_structures.trees.binary_search_tree.BinaryTree;

import java.util.*;

/**
 * @author Sahil on 13/06/2024
 */
public class LevelOrderTraversal {

    public static void levelOrderTraversal(Node node){
        if (node==null){
            return;
        }
        List<Integer> nodeList= new ArrayList<>();
        Queue<Node> queue= new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            Node current = queue.remove();
                nodeList.add(current.data);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }

        System.out.println(Arrays.toString(nodeList.toArray()));
    }
}
