package data_structures.trees.binary_search_tree.BinaryTree;

import data_structures.tree.Node;

import java.util.*;

/**
 * @author Sahil on 12/10/2024
 */

class Pair {
    private final Node node;
    private final int val;

    public Pair(Node node, int val) {
        this.node = node;
        this.val = val;
    }

    public Node getNode() {
        return node;
    }

    public int getVal() {
        return val;
    }
}



public class TopViewOfBST {
    //this need level order + vertical order algo
    public void topViewOfBinarySearchTree( Node node){
        List<Integer>finalAns= new ArrayList<>();
        Map<Integer,Integer>treeMap= new TreeMap<>();// to store nodes hd in ascending order
        Queue<Pair>queue= new LinkedList<>();
        queue.add(new Pair(node,0));
        while (!queue.isEmpty()){
            Pair pair=queue.remove();
            int hd=pair.getVal();
            Node pairNode=pair.getNode();
            if(!treeMap.containsKey(hd)){
                treeMap.put(hd,pairNode.data);
            }
            if(pairNode.left!=null){
                queue.add(new Pair(pairNode.left,hd-1));
            }
            if(pairNode.right!=null){
                queue.add(new Pair(pairNode.right,hd+1));
            }
        }
        for (Integer keys:treeMap.keySet()){
            finalAns.add(treeMap.get(keys));
        }
        System.out.println(Arrays.toString(finalAns.toArray()));

    }




}
