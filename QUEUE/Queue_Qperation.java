class Queue {
    int queue[];
    int rear;
    int front;
    int size;

    Queue(int size)
    {
        queue = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    void enQueue(int item)
    {
        if(rear == size-1)
        System.out.println("Overflow");
        else if(front == -1 && rear == -1)
        {
        front++;
        rear++;
        queue[rear] = item;
        }
        else{
        rear++;
        queue[rear] = item;
        }
    }

    void deQueue()
    {
        if(front ==-1||front == rear+1)
            System.out.println("Underflow");

        else
        front++;
    }

    int peek()
    {
        return queue[front];
    }

    void display()
    {
        int i = front;
        System.out.println("Queue Elements");
        while(i <= rear)
        {
            System.out.print(queue[i]+"  ");
            i++;
        }
        System.out.println();
    }
}
public class Queue_Qperation
{
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(6);
        q.enQueue(8);
        q.enQueue(12);
        q.enQueue(15);
        q.display();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        System.out.println("After Dequeu the data");
        q.display();

    }
}

