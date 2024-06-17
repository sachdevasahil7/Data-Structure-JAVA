package data_structures.trees.binary_search_tree.BinaryTree;

import static data_structures.trees.binary_search_tree.BinaryTree.PrintBST.printTree;

/**
 * @author Sahil on 16/06/2024
 */
public class MinHeightTree {

    BinarySearchTree bst= new BinarySearchTree();
    public  void minHeight(int[] arr) {
        Node root= null;
        root=traverseAndPrint(root,arr,0, arr.length-1);
        printTree(root);
    }

    public  Node traverseAndPrint(Node root,int[] array, int start, int end) {
        if (start > end) {
            return root;
        }

        // Find the middle index
        int middleIndex = start + (end - start) / 2;

        root=bst.insertAsTree(root,array[middleIndex]);

        // Recursively apply to the left subarray
        traverseAndPrint(root,array, start, middleIndex - 1);

        // Recursively apply to the right subarray
        traverseAndPrint(root,array, middleIndex + 1, end);
        return root;
    }
}