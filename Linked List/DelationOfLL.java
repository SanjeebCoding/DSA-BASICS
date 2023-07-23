class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
public class DelationOfLL {
    void deleteNode(int position){
        // linkedlist is empty
        if(head == null){
            return;
        }

        Node temp = head;
        // deletion from the beginning
        if(position == 0){
            head = temp.next;
            return;
        }

        // deletion is from other positions apart from the beginning
        for(int i=0; temp != null && i<position-1; i++){
            temp = temp.next;
        }

        if(temp == null && temp.next == null){
            return;
        }

        temp.next = temp.next.next;
    }
}
public static void main(String[] args) {
    LinkedLIst llist = new LinkedList();
        
        llist.deleteNode(3);
        System.out.println("Linked List after deletion of the node:");
        llist.displayLL();
        System.out.println();
}
}
