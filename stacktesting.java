import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class stacktesting {
    public static void main(String args[]) {
        Stack s = new Stack();
        Queue q = new LinkedList();


        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());


        customStack cs = new customStack();
        cs.push(1);
        cs.push(2);
        cs.push(3);
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());

    }
}


class customStack {
    Node top;
    int size;

    public customStack() {
        this.top = null;
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (this.top == null) {
            this.top = newNode;
        } else {
            newNode.next = this.top;
            this.top = newNode;
        }
        this.size++;
    }
    
    public int pop() 
    {
        if (this.top == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int data = this.top.data;
            this.top = this.top.next;
            this.size--;
            return data;
        }
    }

}

class customQueue {
    Node head;
    Node tail;
    int size;

    public customQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
    public void enqueue(int data)
    {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }

        this.size++;

    }

    public int dequeue() {
        if (this.head == null) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = this.head.data;
            this.head = this.head.next;
            this.size--;
            return data;
        }
    }
}
