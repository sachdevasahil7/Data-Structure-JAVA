package data_structures.trees.binary_search_tree.BinaryTree;

import java.util.List;

/**
 * @author Sahil on 11/06/2024
 */
public class RootToLeafPath {
    public void rootToLeafPath(Node node, List<Integer> list){
        if (node==null){
            return;
        }

        list.add(node.data);
        //no leaf node
        if(node.left==null&&node.right==null) {
            for (Integer num:list){
                System.out.print("-->"+num);
            }
            System.out.println();
        }
        else{//leaf node
            rootToLeafPath(node.left,list);
            rootToLeafPath(node.right,list);
        }

        list.remove(list.size()-1);
    }
}
