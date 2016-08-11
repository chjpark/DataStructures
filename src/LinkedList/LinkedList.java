package LinkedList;

/**
 * Created by connie on 8/9/16.
 *
 * This is a singly linked list
 */
public class LinkedList {

    private static Node head;
    private int size;

    private LinkedList(int n) {
        head = new Node(n);
        size = 1;
    }

    private static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    private Node getHead() {
        return head;
    }

    private void add(int n) {
        if(head == null) {
            head = new Node(n);
        }
        else {
            Node newNode = new Node(n);
            Node current = getHead();

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            this.size++;
        }
    }

    private void printList() {
        Node current = head;
        if(this.size < 1) {
            System.out.println("Empty List!");
        } else {
            while(current != null) {
                System.out.println("Node number " + current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Node head = list.getHead();
        System.out.println("The head is " + head.data);
        System.out.println("The next node is " + head.next.data);
        list.printList();
    }
}
