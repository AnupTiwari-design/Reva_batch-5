package Queue;
import java.util.*;
public class Reverse_Q_using_s {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        for (int num : arr) {
            q.offer(num);
        }

        while (!q.isEmpty()) {
            s.push(q.poll());
        }

        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
