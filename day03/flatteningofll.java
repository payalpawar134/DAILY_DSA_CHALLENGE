class Node {
    int data;
    Node next, bottom;
    Node(int data) {
        this.data = data;
        next = bottom = null;
    }
}

class Solution {
    Node merge(Node a, Node b) {
        
        if (a == null) return b;
        if (b == null) return a;
        
        Node dummy = new Node(0);
        Node tail = dummy;
        
        while (a != null && b != null) {
            if (a.data < b.data) {
                tail.bottom = a;
                a = a.bottom;
            } else {
                tail.bottom = b;
                b = b.bottom;
            }
            tail = tail.bottom;
            tail.next = null;
        }
        
        if (a != null) tail.bottom = a;
        if (b != null) tail.bottom = b;
        
        return dummy.bottom;
    }
    
    Node flatten(Node root) {
        if (root == null || root.next == null) return root;
        
        root.next = flatten(root.next);
        root = merge(root, root.next);
        return root;
    }
}

public class flatteningofll {
    static Node push(Node head, int data) {
        Node node = new Node(data);
        node.bottom = head;
        return node;
    }
    
    static void printList(Node head) {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.bottom;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Solution ob = new Solution();
        
        
        Node head = new Node(5);
        head.next = new Node(7);
        head.next.next = new Node(8);
        head.next.next.next = new Node(30);
        
        
        head.bottom = new Node(10);
        head.bottom.bottom = new Node(20);
        
        head.next.bottom = new Node(19);
        head.next.bottom.bottom = new Node(22);
        head.next.bottom.bottom.bottom = new Node(50);
        
        head.next.next.bottom = new Node(28);
        
        System.out.print("Before: ");
        printList(head);
        
        head = ob.flatten(head);
        System.out.print("After: ");
        printList(head);
    }
}
