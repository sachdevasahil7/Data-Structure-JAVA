package data_structures.linked_lists.Double;

/**
 * @author Sahil on 20/07/2024
 */
public class TestList {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList= new DoubleLinkedList();
        doubleLinkedList.insertNode(2,1);
        doubleLinkedList.insertNode(3,2);
        doubleLinkedList.insertNode(4,3);
        doubleLinkedList.insertNode(5,4);

//        doubleLinkedList.printList();
//        doubleLinkedList.deleteNode(0);
//        System.out.println();
////        doubleLinkedList.printList();
//        doubleLinkedList.deleteNode(4);
//        System.out.println();
////        doubleLinkedList.printList();
//        doubleLinkedList.deleteNode(3);
//        System.out.println();
////        doubleLinkedList.printList();
//        doubleLinkedList.deleteNode(0);
        System.out.println(doubleLinkedList.search(5));
        System.out.println();
        doubleLinkedList.printList();

    }

}
