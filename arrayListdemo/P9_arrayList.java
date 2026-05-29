// Write a program to find the kth smallest element in an ArrayList.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class P9_arrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 12, 34, 425, 1, 123, 23, 35));
    list1.sort((a, b) -> a - b);
    // LinkedHashSet<Integer> set = new LinkedHashSet<>(list1);

    // ArrayList<Integer> unique = new ArrayList<>(set);
    // for distinct
    int k = 1;
    System.out.println(list1);
    System.out.println(list1.get(k - 1));

    // there can be a priority Queue implementation too
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int x : list1) {
      pq.offer(x);
      if (pq.size() > k) {
        pq.poll();
      }

    }
    System.out.println(pq.peek());
  }

}
