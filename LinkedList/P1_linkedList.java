
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

// Create a LinkedList and perform various operations like add, remove, and iterate over it.
public class P1 {
  public static void main(String[] args) {

    LinkedList<Integer> ll = new LinkedList<>();
    Random r = new Random();
    for (int i = 0; i < 10; i++) {
      ll.offerLast(r.nextInt(i + 1));
    }
    // ListIterator<Integer> it = ll.listIterator();
    ListIterator<Integer> it = ll.listIterator();// iterator can also take index in parameter to start with
    // also since its a list iterator it hav hasNext() next() hasPrevious() and
    // previous() function for bidirectional move

    for (Object elem : ll) {
      System.out.print((Integer) elem + " ");
    }
    System.out.println("");
    while (it.hasNext()) {
      Integer x = it.next();
      System.out.print("has next - " + x);
      if (x % 2 == 0) {
        it.remove();
        if (it.hasPrevious()) {
          System.out.println("previous term now " + it.previous());
        }
      }
    }

  }

}
