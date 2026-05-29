// package JavaCollectionFrameWork.arrayListdemo;
// - P3: Write a program to remove all duplicate elements from an ArrayList.

import java.lang.reflect.Array;
import java.util.*;

public class P3_arrayList {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3));

    ArrayList<Integer> unique = new ArrayList<>();
    for (Integer x : list) {
      if (!unique.contains(x))
        unique.add(x);
    }

    System.out.println("O(N^2) solution " + unique);

    // Set<Integer> set = new LinkedHashSet<>(list);
    // list.clear();
    // list.addAll(set);
    // System.out.println(" Linear time solution " + list);
    // or if we do with new list we could do
    ArrayList<Integer> uni = new ArrayList<>(new LinkedHashSet<>(list));
    System.out.println(" Linear time solution " + uni);
  }

}
