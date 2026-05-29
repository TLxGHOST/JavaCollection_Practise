// Write a program to check if two LinkedLists are equal.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P12_arrayList {
  public static void main(String[] args) {

    List<Integer> LL1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
    List<Integer> LL2 = new LinkedList<>(Arrays.asList(3, 4, 25, 6, 17));
    List<Integer> LL3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

    System.out.println("  " + LL1.equals(LL2));

  }
}
