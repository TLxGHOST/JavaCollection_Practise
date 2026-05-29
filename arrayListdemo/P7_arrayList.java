// Write a program to find the second-largest element in an ArrayList of Integers.

import java.util.ArrayList;
import java.util.Arrays;

public class P7_arrayList {

  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 12, 34, 425, 1, 123, 23, 35));
    // Collections.sort(list1);
    // System.out.println(list1.get(list1.size() - 2));

    // list1.sort((a, b) -> b - a);
    // System.out.println(list1.get(1));

    // O(n) single pass
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for (int x : list1) {
      if (x > max) {
        secondMax = max;
        max = x;
      } else if (x > secondMax && x != max) {
        secondMax = x;
      }
    }
    System.out.println(secondMax);
  }

}
