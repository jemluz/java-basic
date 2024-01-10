package people;

public class Main {
  public static void main(String[] args) {
    // instance of People class
    People peopleObjectP1 = new People();

    peopleObjectP1.name = "John Doe";
    peopleObjectP1.old = 32;
    peopleObjectP1.id = "000.000.000-01";

    System.out.println(peopleObjectP1);
    System.out.println(peopleObjectP1.showMeThisPerson());

    People peopleObjectP2 = new People();

    peopleObjectP2.name = "Mary Jane";
    peopleObjectP2.old = 22;
    peopleObjectP2.id = "000.000.000-02";

    System.out.println(peopleObjectP2);
    System.out.println(peopleObjectP2.showMeThisPerson());
  }
}
