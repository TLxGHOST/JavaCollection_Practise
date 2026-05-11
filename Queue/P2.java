
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// Implement a priority queue using a custom comparator.
public class P2 {

  public static void main(String[] args) {
    int arr[] = { 1, 4, 6, 8, 9, 3, 2, 1, 2, 5 };

    // Queue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);

    Comparator<Integer> comp = (a, b) -> {
      if (a % 2 == 0 &&
          b % 2 != 0)
        return -1;

      if (a % 2 != 0 &&
          b % 2 == 0)
        return 1;

      return a - b;
    };
    Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> pq2 = new PriorityQueue<>(comp);

    pq.addAll(Arrays.stream(arr).boxed().toList());
    pq2.addAll(pq);

    System.out.println("pq " + pq.peek());
    pq.offer(10);

    System.out.println("pq2 " + pq);

  }
}
