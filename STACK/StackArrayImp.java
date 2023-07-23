class Stack
{
    int a[];
    int size;
    int top;
    Stack(int size)
    {
        a = new int [size];
        this.size = size;
        top = -1;
    }
    void push(int x)
    {
        if(top == size-1)
        {
            System.out.println("Overflow");
        }
        else
        {
            top++;
            a[top] = x;
        }
    }

    int pop()
    {
        if(top == -1)
        {
            System.out.println("Underflow");
            return -1;
        }
        else
        {
            top--;
            int x = a[top];
            return x;
        }
    }
    int peek()
    {
        if(top ==-1)
        {
            System.out.println("Underflow");
            return -1;
        } 
        else
        {   
            return a[top];
        }
    }
    void dispay()
    {
        if(top==-1)
        System.out.println("Stack is Empty");

        for(int i=0;i<top;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println();
    }
}
public class StackArrayImp
{    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(3);
        System.out.println("Topmost element = "+s.peek());
        s.push(45);
        System.out.println("Topmost element = "+s.peek());
        s.push(25);
        System.out.println("Topmost element = "+s.peek());
        s.pop();
        System.out.println("Topmost element = "+s.peek());
        s.dispay();
    }
}