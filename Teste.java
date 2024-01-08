class Teste {
  // TIPOS DE DADOS
  int integer = 10; // Numeros inteiros (sem quebra)
  double broken = 3.14; // Numeros quebrados
  float floaten = 3.14f; // Numeros quebrados
  long supernumber = 12738192318233L; // Numeros longos

  String text = "u text here"; // Textos

  boolean affirmation = true; // Verdadeiros
  boolean denial = false; // Falsos

  //MÉTODO MAIN
  public static void main(String[] args) {

    int anyNumber = 10;

    //ESTRUTURAS DE REPETIÇÃO
    if (anyNumber == 10) {
      System.out.println("Inside if!");
    } else if (anyNumber < 10) {
      System.out.println("Inside else if!");
    } else {
      System.out.println("Inside else!");
    }

    int initialValue = 1;
    while (initialValue < 3) {
      System.out.println("O valor inicial é menor que 3! Valor atual: " + initialValue);
      initialValue++;
    }
    System.out.println("Só vai imprimir aqui quando o processo do while terminar");

    for (int i = 0; i < 10; i++) {
        System.out.println("O valor do i é: " + i);
    }
    System.out.println("Só vai imprimir esse quando o processo do for terminar");

  }
}
