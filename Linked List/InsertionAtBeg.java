class LinkedLIst
{
    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    //implementation of insertion of a node at the beginning 
    public void insertAtBeginning(int newData)
    {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    // implementation of displaying the linkedlist
    public void displayLL(){
        Node current = head;
        while(current != null){
            System.out.println(current.data + "---->");
            current = current.next;
        }
    }
}
public class InsertionAtBeg {
    public static void main(String[] args) {
        LinkedLIst LL = new LinkedLIst();
        LL.insertAtBeginning(5);
        LL.insertAtBeginning(12);
        LL.insertAtBeginning(10);
        LL.insertAtBeginning(15);

        System.out.println("Before Insertion the NewData :");
        LL.displayLL();

        System.out.println("Enter the NEw Data :");
        LL.insertAtBeginning(5);
        LL.insertAtBeginning(5);
        LL.insertAtBeginning(5);

        System.out.println("After Insertion the NewData :");
        LL.displayLL();
        

    }
}
