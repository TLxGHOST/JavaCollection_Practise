// package JavaCollectionFrameWork.arrayListdemo;
// Write a program to find the maximum element from an ArrayList of Integers.

import java.lang.reflect.Array;
import java.util.*;

public class P2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    List<Integer> li = new ArrayList<>();
    System.out.println("enter -5 to quit entering ");
    while (x != -5) {
      x = sc.nextInt();
      if (x == -5)
        break;
      li.add(x);
    }

    Comparator<Integer> com = (a, b) -> b - a;

    li.sort(com);
    int k = li.get(0);
    System.out.println(k + " ");

    // using collection functions
    int maxn = Collections.max(li);
    System.out.println(maxn + " ");

  }

}
