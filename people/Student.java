package people;

public class Student extends People {

  private String matricullation;

  public String getMatricullation() {
    return matricullation;
  }

  public void setMatricullation(String matricullation) {
    this.matricullation = matricullation;
  }

  // Polimorfism, override from People showMeThisPerson() implementation
  String showMeThisPerson() {
    System.out.println(super.showMeThisPerson());
    return "She/He is a student!";
  }
}