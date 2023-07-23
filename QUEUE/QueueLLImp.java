class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
public class QueueLLImp 
{
    public Node front = null;
    public Node rear = null;

    public void enQueue(int n)
    {
        Node newNode = new Node(n); 
        if(front == null && rear == null)
        {
            front = rear = newNode;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;
        }
    }
    public void deQueue()
    {
        if(front==null && rear ==null)
        System.out.println("Queue is Empty :");

        else
        front = front.next;
    }
    public void display()
    {
         if(front==null && rear ==null)
        System.out.println("Queue is Empty :");

        else
        {
            Node temp = front;

            while(front != null && rear != null)
            {
                System.out.println(temp.data+"-->");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
