package structures;
import java.util.ArrayList;
import java.util.List;

public class ListStructure {

  public static void main(String[] args) {
    // List<E> => interface
    // ArrayList<E> => class
    List<String> texts = new ArrayList<String>();
    texts.add("random text");
    texts.add("another text");
    texts.add("other text");

    System.out.println(texts.get(0));

    // FOR IN
    for(String text : texts) {
      System.out.println("content:" + text);
    }

    // FOREACH VERBOSE FORM
    texts.forEach(text -> System.out.println("CONTENT:" + text));

    // FOREACH REDUCE FORM
    texts.forEach(System.out::println);
  }
}
