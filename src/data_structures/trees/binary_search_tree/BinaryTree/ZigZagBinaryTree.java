package data_structures.trees.binary_search_tree.BinaryTree;

import java.util.*;

/**
 * @author Sahil on 14/06/2024
 */
public class ZigZagBinaryTree {



    public static void ZigZagTraversal(Node node){
        if (node==null){
            return;
        }
        List<Node> finalList= new ArrayList<>();
        Queue<Node> queue= new LinkedList();
        queue.add(node);
        boolean flag=true;
        while(!queue.isEmpty()) {
            List<Node> nodeList= new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node current = queue.poll();
                nodeList.add(current);
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            flag=!flag;
            if (!flag) {
                Collections.reverse(nodeList);
            }
            finalList.addAll(nodeList);
            if (queue.isEmpty()) {
                break;
                }
            }
        for (Node n:finalList){
                System.out.print("--->" + n.data);

        }
    }
}
