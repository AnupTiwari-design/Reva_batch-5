package Queue;
import java.util.*;
public class Binary_print {
    public static void generateBinaryNumbers(int n) {
        Queue<String> q = new LinkedList<>();
        q.offer("1");

        for (int i = 1; i <= n; i++) {
            String current = q.poll();
            System.out.println(current);
            q.offer(current + "0");
            q.offer(current + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        generateBinaryNumbers(n);
    }
}
    
