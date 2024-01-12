package exceptions;

/**
 * Exceptions
 */
public class Exceptions {

  // throws treatment
  // public static void main(String[] args) throws Exception {
  //   validateNumber();
  // }

  // Try-catch treatment
  public static void main(String[] args) throws Exception {

    try {
      validateNumber();
    } catch (Exception e) {
      System.out.println("lascou");
      e.printStackTrace();
    }

  }

  public static void validateNumber() throws Exception {
    int number = 10;
    if (number < 100) {
      throw new Exception("O número é menor que 100");
    }
  }
}