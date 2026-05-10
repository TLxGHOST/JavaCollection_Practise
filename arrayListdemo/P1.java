
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class P1 {
  // 1. Write a program to sort an ArrayList of Strings alphabetically.

  public static void main(String[] args) {

    String[] arr = { "Apple", "Zebra", "Mango", "Banana", "Cherry", "Date", "A", "AB" };
    ArrayList<String> li = new ArrayList<>(Arrays.asList(arr));

    System.out.println("list " + li);

    Collections.sort(li);

    System.out.println("list sorted with Collections.sort +" + li);

    li.sort(Comparator.naturalOrder());

    System.out.println("list sorted with Collections.sort +" + li);

    li.sort(Comparator.reverseOrder());

    System.out.println("list sorted with Collectionsreverse orde +" + li);

    Comparator<String> comp = (a, b) -> a.length() - b.length();

    li.sort(comp);

    System.out.println("list sorted with custom comparator +" + li);
  }

}
