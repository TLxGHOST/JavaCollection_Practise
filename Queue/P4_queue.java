
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

// Implement a Queue using the ArrayDeque class.
public class P4 {
  public static void main(String[] args) {
    // generally it is preferred to use Array Deque using deque interface to have
    // LIFO +FIFO principals together
    Queue<Integer> q = new ArrayDeque<>();
    q.offer(1);
    Random r = new Random();
    for (int i = 0; i < 10; i++) {
      q.offer(r.nextInt(i + 1));
    }

    for (Object elem : q) {
      System.out.print((Integer) elem + " , ");

    }
  }

}
