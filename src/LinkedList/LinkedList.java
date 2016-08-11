package LinkedList;

/**
 * Created by connie on 8/9/16.
 */
public class LinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    Node showHead() {
        return this.head;
    }

    void add(Node n) {
        if(this.head != null) {
            Node start = this.head;
            while(start.next != null) {
                if(start.next == null) {
                    start.next = n;
                } else {
                    start = start.next;
                }
            }
        } else {
            this.head = n;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Node(1));
        Node head = list.showHead();
        System.out.println("The head is " + head.data);
    }
}
