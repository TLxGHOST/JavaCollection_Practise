// Write a program to shuffle the elements of an ArrayList.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class P6 {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 12, 34, 425, 1, 123, 23, 35));
    // ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 12,
    // 34, 425, 1, 123, 23, 35));
    // Collections shuffle method

    Collections.shuffle(list1);
    System.out.println("Normal collection Shuffle " + list1);

    // using another number seed for shuffle
    Collections.shuffle(list1, new Random(5));
    System.out.println(" collection Shuffle with seed 5 " + list1);

    // Collections.shuffle(list2, new Random(5));
    // System.out.println(" collection Shuffle with seed 5 " + list2);
    // same staring point for two shuffle with same seed will result in same outcome

    // using Fisher-Yates shuffle
    //
    Random rand = new Random();
    for (int i = list1.size() - 1; i > 0; i--) {

      int j = rand.nextInt(i + 1);
      // System.out.println("i " + i + " j " + j);
      Collections.swap(list1, i, j);
    }
    System.out.println(" Fisher Yati  " + list1);
  }
}
