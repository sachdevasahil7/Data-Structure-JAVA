package data_structures.trees.binary_search_tree.BinaryTree;

import java.util.List;

/**
 * @author Sahil on 11/06/2024
 */
public class BranchSumProblem {
    public static void branchSum(Node root, Integer runningSums, List<Integer> sums){
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
}
