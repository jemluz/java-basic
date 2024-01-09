package structures;

import java.util.HashSet;
import java.util.Set;

public class HashSetStructure {
  public static void main(String[] args) {
    // The hashset has no indices. It could be that the time element is in index 10, and time in another random index. Because the hashset has no ordering.
    // ordered -> the elements of the data type have some kind of explicit order to them, where an element can be considered "before" or "after" another element. Like get index in some for loop.
    // sorting -> a process of rearranging data elements in an array or list in order to make it easier to search and retrieve. Trade elements between your indexes, like sort by alphabetic order, asc or desc, etc.
    Set<Integer> numbers = new HashSet<>();
    numbers.add(10);
    numbers.add(12);
    numbers.add(14);

    numbers.remove(12);

    for (Integer element: numbers) {
      System.out.println(element);
    }

    System.out.println(numbers.contains(10));
  }
}
