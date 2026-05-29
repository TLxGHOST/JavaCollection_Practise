
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Implement a Queue using the LinkedList class.
public class P1 {
  public static void main(String[] args) {
    // the overall implementation is just to DO FIFO for Queue
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements you need in an array ");
    int limit = sc.nextInt();
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < limit; i++) {
      int m = sc.nextInt();
      q.offer(m);
    }

    System.out.println("Peek " + q.peek());
    System.out.println("Poll " + q.poll());
    System.out.println("Queue is " + q);
    System.out.println("Poll " + q.poll());

    // implementing Queue using Linked List give Queue implementarion ... and Using
    // Deque gives both the approaches to us for use
    sc.close();
  }
}
