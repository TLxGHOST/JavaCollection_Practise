
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

// Write a program to check if two LinkedLists are equal.
public class P4 {
  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(2, 3, 4, 4, 5, 1, 2, 4, 2, 1, 2));
    LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(2, 3, 4, 4, 5, 1, 2, 4, 2, 1, 2));

    if (l1.size() != l2.size()) {
      System.out.println("Not equal");
      return;
    } else {
      if (l1.size() == 0) {
        System.out.println("Equal linked lists");
        return;
      }
      // if (l1.size() == 1 && l1.pollFirst() == l2.pollFirst()) this pops the data
      // thus destroying original list so
      if (l1.size() == 1 && l1.peekFirst().equals(l2.peekFirst())) {
        System.out.println("Equal Linked Lists");
        return;
      } else {
        ListIterator<Integer> it1 = l1.listIterator();
        ListIterator<Integer> it2 = l2.listIterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().equals(it2.next())) {
            System.out.println("Not equal");
            return;
          }

        }
        System.out.println("Equal Linked Lists");

      }

    }

    // after all this Java internally handles everything using equals function for
    // linked list
    // including size , values ,order
    // so just the line l1.equals(l2) checks everything

    if (l1.equals(l2)) {
      System.out.println("Equal lists");
    } else {
      System.out.println("UnEqual lists");
    }

    // generally for all the collection equals works fine
    // and for arrays one can go with
    // 1D ; Arrays.equals(arr1,arr2);
    // 2D : Arrays.deepEquals(arr1,arr2);

  }
}
