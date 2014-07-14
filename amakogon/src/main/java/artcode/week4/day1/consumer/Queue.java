package artcode.week4.day1.consumer;

/**
 * Created by amakogon on 28.06.2014.
 */
public class Queue<T> {

    private class Node {
        T item;
        Node next;

        private Node(Node next, T item) {
            this.next = next;
            this.item = item;
        }
    }

    private Node head;
    private Node tail;
    private static final int LIMIT = 4;
    private volatile int size;


    public synchronized void add(T elem) {
        Node node = new Node(null, elem);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            while (size >= LIMIT) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            tail.next = node;
            tail = node;
            size++;
            this.notifyAll();
        }

    }

    public synchronized void remove() {
        while (size < 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (size == 1) {
            head = null;
            size--;
            this.notifyAll();
        } else if (size > 1) {
            head = head.next;
            size--;
            this.notifyAll();
        }
    }

    public void showQueue() {
        for (Node start = head; start != null; start = start.next) {
            System.out.println(start.item);
        }
    }
}
