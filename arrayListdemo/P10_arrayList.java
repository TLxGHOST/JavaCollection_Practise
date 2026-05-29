// Write a program to merge two ArrayLists into a single ArrayList.

import java.util.ArrayList;
import java.util.Arrays;

public class P10_arrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

    list1.addAll(list2);

    System.out.println("List 1 " + list1);
    System.out.println("List 2 " + list2);
  }
}
