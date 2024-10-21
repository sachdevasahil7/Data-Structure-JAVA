package data_structures.linked_lists.Double;

/**
 * @author Sahil on 14/10/2024
 */
public class DoubleLinkedListPrac {
    private Node head;
    private Node tail;

    public void insertAfter(int val){
        Node node = new Node(val);
        if(head==null){
            head=node;
            return;
        }
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
    }


    public void remove(int value){
        Node temp=head;
        while(temp!=null){
            Node nodeToRemove=temp;
            if(nodeToRemove.value==value){
                nodeToRemove.prev.next=nodeToRemove.next;
                nodeToRemove.next.prev=nodeToRemove.prev;
                nodeToRemove.next=null;
                nodeToRemove.prev=null;
            }
            temp=temp.next;
        }

    }
public boolean containsNode(int val){
        Node temp= head;
        while(temp!=null){
            if(temp.value==val){
                return true;
            }
            temp=temp.next;
        }
        return false;
}


}
