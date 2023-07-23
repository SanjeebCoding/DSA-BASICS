import java.util.Scanner;

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
class Stack
{
    Node top = null;
    Scanner sc = new Scanner(System.in);
    public void push()
    {
        System.out.println("Enter the Data :");
        int data = sc.nextInt();
        Node newNode = new Node(data);
        newNode.next = top ;
        top = newNode;
    }
    public int pop()
    {
        if(top == null){
        System.out.println("Stack Underflow");
        return -1;
        }

        int popElement = top.data;
        top = top.next;
        return popElement;
    }

    public int peek()
    {
        if(top == null){
        System.out.println("Stack is Empty");
        return -1;
        }   

        return top.data;
    }

    public void display()
    {
        if(top == null){
        System.out.println("Stack is empty ");
        }   
        Node temp = top;
        System.out.println("Stack Elments :");
        while(temp != null)
        {
            System.out.println(temp.data+"---->");
            temp = temp.next;
        }
        System.out.println();
    }
    public void push(int i) {
    }

}

public class StackLLImp {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter 0 for exist,1 for push, 2 for pop, 3 for peek, 4 for dispay");
            int n = sc.nextInt();

            switch(n)
            {
                case 0:
                System.exit(0);
                System.out.println("Yes System is Exist :");
                sc.close();
                break;

                case 1:
                stack.push();
                break;

                case 2:
                stack.pop();
                break;

                case 3:
                stack.peek();
                break;

                case 4:
                stack.display();
                break;

                default:
                System.out.println("NO Choices....");
            }
        }
    }
}
