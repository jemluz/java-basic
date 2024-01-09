package structures;

import java.util.HashMap;
import java.util.Map;

public class HashMapStructure {

  public static void main(String[] args) {
    // create a map<string, int> variable
    // the key must have a unique value, if you do two equal keys, the last one will be keeped
    Map<String, Integer> menu = new HashMap<>();
    menu.put("Burguer", 10);
    menu.put("Rice", 2);

    // The reserved word var -> automatically infers the type of the variable
    // Equals to Integer item = menu.get("Burguer");
    var item = menu.get("Burguer");
    System.out.println(item);

    // how to parse a map:
    for(Map.Entry<String, Integer> entry : menu.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("Key is:" + key + " and value is " + value);
    }
  }
}
