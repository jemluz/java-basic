package people;

public class People {
  // must has an name, old and id

  String name;
  int old;
  String id;

  String showMeThisPerson() {
    return "This is " + name + ", she/he has " + old + " years old and her/his ID is " + id;
  }
}
