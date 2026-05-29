// Write a program to check if a HashSet is a subset of another HashSet.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P13_arrayList {
  public static void main(String[] args) {
    // Let say B is subset of A that is all elements of B are in A which implies B-A
    // will result in Empty B.
    Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> B = new HashSet<>(Arrays.asList(2, 3, 4));

    // B.removeAll(A);
    // if (B.isEmpty()) {
    // System.out.println("B is subset of A");
    // } first approach
    if (A.containsAll(B)) {
      System.out.println("B is subset of A");
    } // approach 2 i guess
  }
}
