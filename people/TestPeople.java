package people;

public class TestPeople {
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

    // instance of teacher
    Teacher teacherObj1 = new Teacher();
    // People teacherObj1 = new Teacher();

    teacherObj1.setId("000.000.000-03");
    teacherObj1.setName("Carlitos");
    teacherObj1.setOld(28);
    teacherObj1.setSalary("28.000");
    System.out.println(teacherObj1.showMeThisPerson());

    // instance of student
    Student studentObj1 = new Student();
    // People teacherObj1 = new Teacher();

    studentObj1.setId("000.000.000-03");
    studentObj1.setName("Carlitos");
    studentObj1.setName("Junin");
    studentObj1.setOld(28);
    studentObj1.setMatricullation("823741");
    System.out.println(studentObj1.showMeThisPerson());
  }
}
