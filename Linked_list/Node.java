package Linked_list;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Linked_list {
    Node head;

    Linked_list() {
        head = null;
    }

    // Insert at end
    void insert_at_end(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    // Insert at beginning
    void insert_at_beg(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    // Delete at end
    void delete_at_end() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

            // For circular list check
            if (temp == head) {
                System.out.print("(head)\n");
                return;
            }
        }
        System.out.println("null");
    }

    // Check if list is circular
    boolean isCircular() {
        if (head == null) return false;

        Node temp = head.next;
        while (temp != null && temp != head) {
            temp = temp.next;
        }
        return temp == head;
    }

    // Make list circular
    void makeCircular() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head; // point last node to head
    }

    // Main method to test
    public static void main(String[] args) {
        Linked_list list = new Linked_list();

        list.insert_at_end(10);
        list.insert_at_end(20);
        list.insert_at_end(30);
        list.insert_at_beg(5);

        list.display();

        list.delete_at_end();
        System.out.println("After deleting at end:");
        list.display();

        System.out.println("Is list circular? " + list.isCircular());

        list.makeCircular();
        System.out.println("List made circular.");

        System.out.println("Is list circular now? " + list.isCircular());

        list.display();  // Will stop printing after one cycle
    }
}