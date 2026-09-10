class Queue {
    int arr[];
    int front;
    int rear;
    int size;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = arr[front];
        front++;
        return value;
    }

    int peek() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    boolean isEmpty() {
        return front > rear;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class QueueImp {
    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front element: " + q.peek());

        System.out.println("Removed: " + q.dequeue());

        System.out.println("Front element: " + q.peek());

        q.display();
    }
}