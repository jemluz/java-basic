package vehicle;

public class VehicleTest {
  public static void main(String[] args) {
    Car carObj1 = new Car();
    Motobike motobikeObj1 = new Motobike();

    carObj1.speedUp();
    carObj1.brake();

    motobikeObj1.speedUp();
    motobikeObj1.brake();
  }
}
