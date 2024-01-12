package vehicle;

public class Motobike implements Vehicle {
  @Override
  public void speedUp() {
    System.out.println("Vrum vrum...");
  }

  @Override
  public void brake() {
    System.out.println("Stooop...");
  }
}
