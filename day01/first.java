class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class first {
    public static Node intersectPoint(Node head1, Node head2) {
        Node ptr1 = head1;
        Node ptr2 = head2;

        while (ptr1 != ptr2) {
            ptr1 = (ptr1 == null) ? head2 : ptr1.next;
            ptr2 = (ptr2 == null) ? head1 : ptr2.next;
        }
        return ptr1;
    }

    public static void main(String[] args) {
        // simple dummy test so file has an entry point
        Node a = new Node(1);
        Node b = new Node(2);
        intersectPoint(a, b);
        System.out.println("Compiled and ran");
    }
}
