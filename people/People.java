package people;

// This is a basic example about classes and objects
public class People {
  // must has an name, old and id

  String name;
  int old;
  String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getOld() {
    return old;
  }

  public void setOld(int old) {
    this.old = old;
  }

  String showMeThisPerson() {
    return "This is " + name + ", she/he has " + old + " years old and her/his ID is " + id;
  }
}
