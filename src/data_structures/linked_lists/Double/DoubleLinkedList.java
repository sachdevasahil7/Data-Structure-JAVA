package data_structures.linked_lists.Double;

/**
 * @author Sahil on 20/07/2024
 */
public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int size=0;
public Node createList(int value){
    Node node= new Node();
    node.value=value;
    node.prev=null;
    node.next=null;
    head=node;
    tail=node;
    size++;
    return head;
}
public void insertNode(int value,int location){
    Node newNode= new Node();
    newNode.value=value;
    if(head==null){
        createList(value);
        return;
    }
    else if (location==0){
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    else if (location>=size){
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }else{
        Node tempNode=head;
        int index=0;
        while(index<location-1){
            tempNode=tempNode.next;
            index++;
        }
        newNode.next=tempNode.next;
        newNode.prev=tempNode;
        tempNode.next=newNode;
        newNode.next.prev=newNode;
        }
    size++;
    }
    public void printList(){
    if (head==null){
        System.out.println("List is Empty");
        return;
    }
    Node node=head;
    int index =0;
    while (index<size-1){
        System.out.print("--->"+node.value+"-->");
        node=node.next;
        index++;
    }
}
public void deleteNode(int location){
    if(size==0){
        System.out.println("Cannot Delete Already an Empty List");
        return;
    }
    if (location==0){
        if (size==1){
            head=null;
            tail=null;
            size--;
        }else{
            head=head.next;
            head.prev=null;
            size--;
        }
    }else if(location>=size){
        if(size==0){
            tail=null;
            head=null;
            size--;
        }else{
            tail=tail.prev;
            tail.next=null;
            size--;
        }
    }else{
        Node tempNode=head;
        int index=0;
        while (index<location-1){
            tempNode=tempNode.next;
            index++;
        }
        tempNode.next=tempNode.next.next;
        tempNode.next.prev=tempNode;
        size--;
    }
}

}
