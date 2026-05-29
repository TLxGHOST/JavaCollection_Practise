// Write a program to find the intersection of multiple Sets.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P11_arrayList {
  public static void main(String[] args) {

    Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 25, 6, 17));
    Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 0, 14, 25, 36, 17));

    // set1.retainAll(set2);
    // System.out.println(set1);

    List<Set<Integer>> sets = new ArrayList<>();
    sets.add(set1);
    sets.add(set2);
    sets.add(set3);

    Set<Integer> result = new HashSet<>(sets.get(0));
    for (int i = 1; i < sets.size(); i++) {
      result.retainAll(sets.get(i));
    }

    // List<Set<Integer>> sets = Arrays.asList(set1, set2, set3);
    // Set<Integer> result = new HashSet<>(sets.get(0));

    // for (Set<Integer> s : sets) {
    // result.retainAll(s);
    // }

    // System.out.println(result);

    System.out.println("Union of all sets " + result);
  }

}
