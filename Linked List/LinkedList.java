public class LinkedList {
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

    public void InsAtBeg(int newData)
    {
        Node newNode = new Node(newData);
        if(head ==null)
        head = new Node(newData);

    }
}
