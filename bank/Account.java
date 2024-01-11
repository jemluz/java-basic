package bank;

public class Account {

  private String number;
  private String holder;
  private double balance;

  public Account() {
    balance = 0;
  }

  public double getBalance() {
    return balance;
  }

  public String getHolder() {
    return holder;
  }

  public String getNumber() {
    return number;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  void deposit(double value) {
    if (value > 0) {
      balance =+ value;
      System.out.println("Your deposit of " + value + " has been fulfilled! Your current balance is " + balance);
    } else {
      System.out.println("The deposit value is invalid! Try with another one.");
    }
  }

  void withdraw(double value) {
    if (value > 0 && value <= balance) {
      balance =- value;
      System.out.println("Your deposit of " + value + " has been fulfilled! Your current balance is " + balance);
    }
  }
}
