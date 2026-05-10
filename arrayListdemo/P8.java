// Write a program to find the frequency of each element in an ArrayList.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class P8 {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 12, 34, 425, 1, 123, 23, 35));
    Map<Integer, Integer> freq = new LinkedHashMap<>();
    for (Integer elem : list1) {
      // int k = freq.getOrDefault(elem, 0);
      // freq.put(elem, k + 1);
      freq.put(elem, freq.getOrDefault(elem, 0) + 1);
    }

    // list1.stream().forEach((x) -> freq.put(x, freq.getOrDefault(x, 0) + 1));
    // using streams

    for (Map.Entry<Integer, Integer> k : freq.entrySet()) {
      System.out.println("Key " + k.getKey() + " frequency " + k.getValue());
    }

  }
}
