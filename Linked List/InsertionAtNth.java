class LinkedList{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void InsAtNth(Node prev_Node,int newData)
    {
        if(prev_Node == null)
        System.out.println("Previoud Node can not be null");
        return;

        Node newNode = new Node(newData);
        newNode.next = prev_Node.next;
        prev_Node.next = newNode;
    }    

       // display all the nodes after the insertion
    public void printNodes(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;

        }
    }
}

public class InsertionAtNth
{
    public static void main(String[] args) 
    {
        LinkedLIst LL = new LinkedLIst();
        System.out.println("Before Insertion the NewData :");
        LL.displayLL();

    }
}