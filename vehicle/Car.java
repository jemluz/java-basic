package vehicle;

public class Car implements Vehicle {
  @Override
  public void speedUp() {
    System.out.println("Speeding up...");
  }

  @Override
  public void brake() {
    System.out.println("Braking...");
  }
}
