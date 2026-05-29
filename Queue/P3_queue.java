
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

// Implement a Queue using the PriorityQueue class.
public class P3 {
  public static void main(String[] args) {
    Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
    // max heap
    q.offer(1);
    q.offer(2);
    Random r = new Random();
    for (int i = 0; i < 15; i++) {
      q.offer(r.nextInt(15));
    }

    q.stream().forEach(x -> System.out.print(x + " "));

  }

}
