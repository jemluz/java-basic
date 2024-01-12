package people;

public class Teacher extends People {

  private String salary;

  public String getSalary() {
    return salary;
  }

  public void setSalary(String salary) {
    this.salary = salary;
  }

  // Polimorfism, override from People showMeThisPerson() implementation
  // super is a reference to parent class
  String showMeThisPerson() {
    System.out.println(super.showMeThisPerson());
    return "She/He is a Teacher!";
  }
}
