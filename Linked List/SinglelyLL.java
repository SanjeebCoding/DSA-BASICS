import java.util.Scanner;

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

public class SinglelyLL
{
    static Node head = null;
    public static void create()
    {
        head = new Node(10);
        head.next = new Node(11);
        head.next.next = new Node(12);
    }

    public static void display()
    {
        Node temp = head;
        while(temp!= null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void InsBig()
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter data");
        int d = sc.nextInt();

        Node newNode = new Node(d);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public static void InsEnd()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int d = sc.nextInt();
        Node newNode = new Node(d);

        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
                temp.next = newNode;
            }
        }
    }
    
    public static void InsNth()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data");
        int d = sc.nextInt();
        System.out.println("Enter Position");
        int p = sc.nextInt();
        Node newNode = new Node(d);

        Node temp = head;
        int i=1;
        while(i<p-1)
        {
            i++;
            temp = temp.next;
        }
        Node Y = temp.next;
        temp.next = newNode;
        new.next = Y;
    }

    public static void DelBeg()
    {
        if(head == null)
            System.out.println("LinkedList id Empty");

        else
        {
            head = head.next;
        }
    }
    public static void DelEnd()
    {
        if(head == null)
            System.out.println("LinkedList id Empty");
        
        else if(head.next == null)
        head = null;

        else{
            Node temp =head;
            while(temp.next.next != null)
            {
                temp = temp.next;
                Node x = temp.next;
                temp.next = null;
            }
        }
    }
    public static void DelNth()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Position");
        int p = sc.nextInt();

        Node temp = head;
        int i=1;
        while(p<i-1)
        {
            i++;
            temp = temp.next;
        }
        Node x = temp.next;
        Node y = x.next;
        temp.next = y;
        x.next = y;
    }

    public static void del_particular_value()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to be deleted");
        int r = sc.nextInt();
        Node temp = head;
        Node prev = null;

        while(temp!=null)
        {
            if(temp.data == r)
            break;
            else
            {
                prev = temp;
                temp = temp.next;
            }
            if(temp==null)
            {
                System.out.println("Element to be delated is not present on list");
            }
            else if (prev ==null)  //if the 1st node reg is to be delated
            head = temp.next;

            else
            prev.next = temp.next;
            

        }
    }
    public static boolean search()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item to be searched");
        int i = sc.nextInt();

        System.out.println("Enter value that should be changed ");
        int u = sc.nextInt();

        Node temp = head;
        while(temp!=null)
        {
            if(temp.data==i)
            {
                temp.data = u;
                return true;
            }
            temp = temp.next;
        }

        System.out.println("Item to be searched is not found :");
        return false;   
    }

    public static void count()
    {
        Node temp = head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp = temp.next;
        }
        System.out.println("Count :"+c++);
    }
    public static void main(String[] args) {
        
    }
}
