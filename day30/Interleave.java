import java.util.*;

public class Interleave {

    public static void rearrangeQueue(Queue<Integer> q) {
        int n = q.size();

        Queue<Integer> firstHalf = new LinkedList<>();

        // Move first half into another queue
        for (int i = 0; i < n / 2; i++) {
            firstHalf.add(q.poll());
        }

        // Interleave both halves
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.poll());
            q.add(q.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        
        q.add(2);
        q.add(4);
        q.add(3);
        q.add(1);

        System.out.println("Before interleaving: " + q);

        rearrangeQueue(q);

        System.out.println("After interleaving:  " + q);
    }
}
