package bank;

public class TestAccount {
  public static void main(String[] args) {
    Account accountObject1 = new Account();

    // with encapsulation
    accountObject1.setNumber("00000-1");
    accountObject1.setHolder("John Doe");

    accountObject1.deposit(100);
    accountObject1.withdraw(50);
    accountObject1.getBalance();

    // without encapsulation
    // data can be accessed and changed easily, there is no control over the confidenciality and security of the system, this is dangerous!
    // accountObject1.number = "000000-1";
    // accountObject1.holder = "John Doe";
    // accountObject1.balance = 100;

    // accountObject1.deposit(50);
    // accountObject1.withdraw(100);

    // accountObject1.balance = 20;
  }
}
