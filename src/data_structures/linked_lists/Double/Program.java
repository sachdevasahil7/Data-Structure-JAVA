package data_structures.linked_lists.Double;

import java.util.*;

 public class Program {
     public static void main(String[] args) {
         System.out.println("he");
     }
    static class DoublyLinkedList {
        public Node head;
        public Node tail;


        public void setHead(Node node) {
            if(this.head==null){
                this.head=node;
                this.tail=node;
                return;
            }
            remove(node);
            this.insertBefore(this.head,node);
        }
        public void setTail(Node node) {
            if(tail==null){
                head=tail=node;
                return;
            }
            remove(node);
            insertAfter(tail,node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            if(nodeToInsert==this.head&&nodeToInsert==this.tail){
                return;
            }
            this.remove(nodeToInsert);
            nodeToInsert.prev=node.prev;
            nodeToInsert.next=node;
            if(node.prev==null){
                this.head=nodeToInsert;
            }else{
                node.prev.next=nodeToInsert;
            }
            node.prev=nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            if(node==null){
                return;
            }

            remove (nodeToInsert);
            Node copyOfAfter = node.next;
            node.next = nodeToInsert;
            nodeToInsert.prev = node;
            nodeToInsert.next = copyOfAfter;
            if (copyOfAfter != null) {
                copyOfAfter.prev = nodeToInsert;
            }
            if (node == tail) {
                tail = nodeToInsert;
            }
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            Node tempNode=head;
            for(int i=1;i<position;i++){
                tempNode=tempNode.next;
            }
            if(tempNode!=null){
                insertBefore(tempNode,nodeToInsert);
            }else{
                setTail(nodeToInsert);
            }
        }

        public void removeNodesWithValue(int value) {
            Node temp=head;
            while(temp!=null){
                Node tempNode=temp;
                temp=temp.next;
                if (tempNode.value==value){
                    remove(tempNode);
                }
            }
        }

        public void remove(Node node) {
            if(node==this.head){
                this.head=this.head.next;
            }
            if (node==this.tail){
                this.tail=this.tail.prev;
            }
            removeBindings(node);
        }
        public void removeBindings(Node node){
            if(node.prev!=null) {
                node.prev.next = node.next;
            }
            if(node.next!=null) {
                node.next.prev = node.prev;
            }
            node.prev=null;
            node.next=null;
        }
        public boolean containsNodeWithValue(int value) {
            Node tempNode=this.head;
            boolean flag=false;
            while(tempNode!=null){
                if(tempNode.value==value){
                    flag=true;
                    break;
                }
                tempNode=tempNode.next;
            }
            return flag;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
