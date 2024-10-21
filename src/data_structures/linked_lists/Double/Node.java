package data_structures.linked_lists.Double;

/**
 * @author Sahil on 20/07/2024
 */
public class Node {
    Node next;
    Node prev;
    int value;

    public Node( int value) {
        this.next = null;
        this.prev = null;
        this.value = value;
    }
}
