// Write a program to find the intersection of two ArrayLists.

import java.util.ArrayList;
import java.util.Arrays;

public class P5 {
  public static void main(String[] args) {

    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

    // sets addAll is union
    // sets removeAll is diffrence
    // set retainAll is Intersection
    // set containsAll is subset
    // all of the above function work as A.f(B) where f is the above function and it
    // represent AUB or similar

    // Set<Integer> A = new LinkedHashSet<>(list1);
    // Set<Integer> B = new LinkedHashSet<>(list2);
    // using set for intersection will remove duplicates
    // for intersection we will do A.retainAll(B); that is A intersection B

    // A.retainAll(B);
    // A will get modified
    // for (Integer elem : A) {
    // System.out.println(elem);
    // }
    // for getting duplicates in intersection we can also do retainAll on List too

    list1.retainAll(list2);

    for (Integer elem : list1) {
      System.out.println(elem);
    }
  }
}
